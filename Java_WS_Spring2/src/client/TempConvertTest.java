package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TempConvertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = (ApplicationContext) new FileSystemXmlApplicationContext(new  String[] {"src\\main\\webapp\\WEB-INF\\ws-client-config.xml"});
		TempConvertSoap tempConvert = (TempConvertSoap)ctx.getBean("tempConvClient");
		System.out.println("Celcius to Fahrenheit--"+tempConvert.celsiusToFahrenheit("20"));
	}

}
