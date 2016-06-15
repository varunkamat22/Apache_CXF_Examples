package service;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.DelegatingInputStream;
import org.apache.cxf.phase.Phase;

public class LoggingInterceptor extends AbstractSoapInterceptor {

	public LoggingInterceptor() {
		super(Phase.PRE_STREAM);
	}

	public void handleMessage(SoapMessage message) throws Fault {
		InputStream is = message.getContent(InputStream.class);
		CachedOutputStream bos = new CachedOutputStream();
		try {
		
			 // use the appropriate input stream and restore it later
            InputStream bis = is instanceof DelegatingInputStream 
                ? ((DelegatingInputStream)is).getInputStream() : is;
            

            //only copy up to the limit since that's all we need to log
            //we can stream the rest
            IOUtils.copyAtLeast(bis, bos, Integer.MAX_VALUE); 
            bos.flush();
            System.out.println(new String(bos.getBytes()));
            bis = new SequenceInputStream(bos.getInputStream(), bis);
            
            // restore the delegating input stream or the input stream
            if (is instanceof DelegatingInputStream) {
                ((DelegatingInputStream)is).setInputStream(bis);
            } else {
                message.setContent(InputStream.class, bis);
            }
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println(new String(bytes));
		
	}


}
