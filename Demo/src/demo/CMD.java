package demo;

import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class CMD {

    static public void main(String[] args) {
        String cmd = "ping 127.0.0.1";

        try {
            Process ps = Runtime.getRuntime().exec(cmd);
            System.out.print(loadStream(ps.getInputStream()));
            System.err.print(loadStream(ps.getErrorStream()));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    // read an input-stream into a String
    static String loadStream(InputStream in) throws IOException {
        int ptr = 0;
        in = new BufferedInputStream(in);
        StringBuffer buffer = new StringBuffer();
        while( (ptr = in.read()) != -1 ) {
            buffer.append((char)ptr);
        }
        return buffer.toString();
    }
}
