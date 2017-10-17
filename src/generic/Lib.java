package generic;

import java.io.FileInputStream;
import java.util.Properties;

//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Lib {
	
	
	public static String getPpt(String path,String key){
		String v="";
		try{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e){
		}
		return v;
	}	
}
