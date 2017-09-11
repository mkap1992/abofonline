   package com.library;

import java.io.FileInputStream;


import java.util.Properties;

public class Generic
{

	public static String getproperties (String skey) 
	{
		String svalue=null;
		Properties prop=new Properties();
		try
		{
		FileInputStream file=new FileInputStream("C:\\Users\\Nagarjuna\\eclipse-workspace\\framework\\config.abof");
		prop.load(file);
		svalue=prop.getProperty(skey);
		}
		catch(Exception e) 
		{
			
		}
		return svalue;
		
	}
}
