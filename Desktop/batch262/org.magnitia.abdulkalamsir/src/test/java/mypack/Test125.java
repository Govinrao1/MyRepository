package mypack;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;

public class Test125
{
	public static void main(String[] args) throws Exception
	{
		//Open an existing file, read values, edit values and save that file
		File f=new File("src\\test\\resources\\datafiles\\config.properties");
	    //Edit values
		PropertiesConfiguration pc=new PropertiesConfiguration(f);
        pc.setProperty("name","Mr. abdul kalam sir");
        pc.setProperty("url","http://www.apjabdulkalam.com");
        pc.setProperty("age","94");
        pc.save();
        //Read values
      	FileReader fr=new FileReader(f);  
      	Properties p=new Properties();  
      	p.load(fr); 
      	Set<Object> keys=p.keySet(); //get all keys
      	for(Object key:keys) //get values using keys
      	{
      		System.out.println(key.toString()+"="+p.getProperty(key.toString()));
      	}
	}
}
