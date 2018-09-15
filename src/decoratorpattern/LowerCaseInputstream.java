package decoratorpattern;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wp-pc on 2018/9/15.
 */
public class LowerCaseInputstream extends FilterInputStream {
//    InputStream inputStream ;

    public LowerCaseInputstream(InputStream inputStream){
        super(inputStream);
//        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        int  c = super.read();
        return (c==-1?c:Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b ,int offset,int len) throws IOException {
        int result = super.read(b,offset,len);
        for(int i=offset;i<offset+result;i++){
            b[i]=(byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
