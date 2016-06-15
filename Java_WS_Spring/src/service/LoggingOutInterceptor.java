package service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingMessage;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.io.DelegatingInputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

public class LoggingOutInterceptor extends AbstractSoapInterceptor {

	public LoggingOutInterceptor() {
		super(Phase.PRE_STREAM);
	}

	public void handleMessage(SoapMessage message) throws Fault {
		final OutputStream os = message.getContent(OutputStream.class);
		final InputStream is = message.getContent(InputStream.class);
		
		try {
			System.out.println(is.read());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (os != null) {
				final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(os);
				IOUtils.copyAtLeast(is, newOut, Integer.MAX_VALUE); 
	            newOut.flush();
				message.setContent(OutputStream.class, newOut);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(new String(bytes));

	}

}
