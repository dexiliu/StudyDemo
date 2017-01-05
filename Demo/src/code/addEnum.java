package code;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sun.reflect.ConstructorAccessor;
import sun.reflect.FieldAccessor;
import sun.reflect.ReflectionFactory;

public class addEnum {

	private static ReflectionFactory reflectionFactory = ReflectionFactory.getReflectionFactory();
	
	public static void main(String[] args) {
		System.out.println(DataSourceType.dataSource_main);
		addE(DataSourceType.class,"DS_yxyz");
		addE(DataSourceType.class,"DS_yxfx");
		addE(DataSourceType.class,"DS_lzyz");
		System.out.println(Arrays.deepToString(DataSourceType.values()));
		DataSourceType dst = DataSourceType.valueOf("DS_yxyz");
		System.out.println("====="+dst);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Enum<?>> void addE(Class<T> enumType,String enumName){
		
		if(!Enum.class.isAssignableFrom(enumType)){
			throw new RuntimeException("class "+enumType+"is not an instance of ENUM");
		}
		
		Field valuesField = null;
		Field[] fields = DataSourceType.class.getDeclaredFields();
		for(Field field:fields){
			if(field.getName().contains("$VALUES")){
				valuesField = field;
				break;
			}
		}
		AccessibleObject.setAccessible(new Field[]{valuesField}, true);
		
		try{
			T[] previousValues = (T[])valuesField.get(enumType);
			List values = new ArrayList(Arrays.asList(previousValues));
			
			T newValue = (T)makeEnum(enumType,enumName,values.size(),new Class<?>[]{},new Object[]{});
			
			values.add(newValue);
			
			setFailsafeFieldValue(valuesField,null,values.toArray((T[])Array.newInstance(enumType, 0)));
			
			cleanEnumCache(enumType);
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	private static Object makeEnum(Class<?> enumClass, String value, int ordinal, 
	        Class<?>[] additionalTypes, Object[] additionalValues) throws Exception {
	    Object[] parms = new Object[additionalValues.length + 2];
	    parms[0] = value;
	    parms[1] = Integer.valueOf(ordinal);
	    System.arraycopy(additionalValues, 0, parms, 2, additionalValues.length);
	    return enumClass.cast(getConstructorAccessor(enumClass, additionalTypes).newInstance(parms));
	}
	 
	private static ConstructorAccessor getConstructorAccessor(Class<?> enumClass, 
	        Class<?>[] additionalParameterTypes) throws NoSuchMethodException {
	    Class<?>[] parameterTypes = new Class[additionalParameterTypes.length + 2];
	    parameterTypes[0] = String.class;
	    parameterTypes[1] = int.class;
	    System.arraycopy(additionalParameterTypes, 0, 
	            parameterTypes, 2, additionalParameterTypes.length);
	    return reflectionFactory.newConstructorAccessor(
	            enumClass.getDeclaredConstructor(parameterTypes));
	}

	private static void setFailsafeFieldValue(Field field, Object target, Object value)
	         throws NoSuchFieldException, IllegalAccessException {
	 
	    // let's make the field accessible
	    field.setAccessible(true);
	 
	    // next we change the modifier in the Field instance to
	    // not be final anymore, thus tricking reflection into
	    // letting us modify the static final field
	    Field modifiersField = Field.class.getDeclaredField("modifiers");
	    modifiersField.setAccessible(true);
	    int modifiers = modifiersField.getInt(field);
	 
	    // blank out the final bit in the modifiers int
	    modifiers &= ~Modifier.FINAL;
	    modifiersField.setInt(field, modifiers);
	 
	    FieldAccessor fa = reflectionFactory.newFieldAccessor(field, false);
	    fa.set(target, value);
	}
	
	private static void cleanEnumCache(Class<?> enumClass) 
	        throws NoSuchFieldException, IllegalAccessException {
	    blankField(enumClass, "enumConstantDirectory"); // Sun (Oracle?!?) JDK 1.5/6
	    blankField(enumClass, "enumConstants"); // IBM JDK
	}
	 
	private static void blankField(Class<?> enumClass, String fieldName) 
	        throws NoSuchFieldException, IllegalAccessException {
	    for (Field field : Class.class.getDeclaredFields()) {
	        if (field.getName().contains(fieldName)) {
	            AccessibleObject.setAccessible(new Field[] { field }, true);
	            setFailsafeFieldValue(field, enumClass, null);
	            break;
	        }
	    }
	}
	
}
