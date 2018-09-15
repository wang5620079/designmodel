package decoratorpattern;

import java.io.*;

/**
 * Created by wp-pc on 2018/9/15.
 */
public class LowerCaseTest {
    public static void main(String[] args) {
        String str="I kwon the Decorator Pattern therefore I Rule!";
        int c;
        try{
            InputStream in = new LowerCaseInputstream(new BufferedInputStream(new ByteArrayInputStream(str.getBytes("utf-8"))));
            while((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
