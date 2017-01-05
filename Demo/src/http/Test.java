package http;

public class Test {

	public static void main(String[] args) {
		try {  
            HttpRequester request = new HttpRequester();  
            HttpResponse hr = request.sendGet("http://www.baidu.com"); 
            HttpResponse hr2= request.sendPost("http://www.baidu.com");
   
            System.out.println("(1)==="+hr2.getUrlString());  
            System.out.println("(2)==="+hr2.getProtocol());  
            System.out.println("(3)==="+hr2.getHost());  
            System.out.println("(4)==="+hr2.getPort());  
            System.out.println("(5)==="+hr2.getContentEncoding());  
            System.out.println("(6)==="+hr2.getMethod());  
              
            System.out.println("(7)==="+hr2.getContent());  
            
            
            
//            System.out.println("(1)=2=="+hr2.getUrlString());  
//            System.out.println("(2)=2=="+hr2.getProtocol());  
//            System.out.println("(3)=2=="+hr2.getHost());  
//            System.out.println("(4)=2=="+hr2.getPort());  
//            System.out.println("(5)=2=="+hr2.getContentEncoding());  
//            System.out.println("(6)=2=="+hr2.getMethod());  
//              
//            System.out.println("(7)=2=="+hr2.getContent());  
   
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}

}
