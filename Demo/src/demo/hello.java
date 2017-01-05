package demo;
public class hello {

	private String baseName="base";
	
	public hello(){
		callName();  //1
	}
	
	public void callName(){
		System.out.println(baseName);
	}
	
	static class sub extends hello{
		private String baseName="sub";  //3.baseName=sub
		public sub(){
			callName();  //4
		}
		public void callName(){
			System.out.println(baseName);  //2.baseName=null,5.baseName=sub
		}
	}
	
	public static void main(String[] args) {
		hello h=new sub(); 
		h.callName();  //6
	}

}
