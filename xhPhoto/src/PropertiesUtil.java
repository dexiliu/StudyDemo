
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;


public class PropertiesUtil 
{

	//public final String DOMINANT="18016169399025b66ab3c88b357fb788";
	
	private Map<String,String> param = new HashMap<String,String>();
	private static PropertiesUtil paramInstance = null;
	
	private PropertiesUtil()
	{
		Properties props = new Properties();
		InputStream in = null;
		try
		{
			in = (PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties"));
			if (in == null)
			{
//				logger.debug("config file jdbc.properties not found");
			}
			props.load(in);
			
			Iterator<Object> it = props.keySet().iterator();
			while(it.hasNext())
			{
				String key = (String)it.next();
				param.put(key, props.getProperty(key));
			}
		}
		catch(Exception ex)
		{
			
		}
		finally
		{
			if(in != null){try{in.close();}catch(Exception e){}}
		}
	}
	public static PropertiesUtil getInstance()
	{
		if(paramInstance == null)
		{
			paramInstance = new PropertiesUtil();
		}
		return paramInstance;
	}
	
	public String getParam(String key)
	{
		if(param.containsKey(key))
		{
			return param.get(key);
		}
		return "";
	}
	
	
}
