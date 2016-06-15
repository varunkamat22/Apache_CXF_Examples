package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService(endpointInterface="service.GreetService")
public class GreetServiceImpl implements GreetService{
	
	public String sayHi(String name){
		return "Welcome, "+name;
	}

	public String uploadDoc(@XmlElement(name = "doc") byte[] data) {
		// TODO Auto-generated method stub
		OutputStream os = null;
		try {
			os = new FileOutputStream(new File("img.png"));
			os.write(data);
			os.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "done";
	}
	
	
}
