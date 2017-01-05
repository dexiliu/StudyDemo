package getIP;

import java.net.InetAddress;

public class GetLocalIP {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		InetAddress ia=null;
		try{
			ia=ia.getLocalHost();
			String ip=ia.getHostAddress();
			String name=ia.getHostName();
			System.out.println(ip+"|-------|"+name+"|-------|");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
