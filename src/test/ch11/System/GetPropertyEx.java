package test.ch11.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		
		//getProperty(String key)
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		//getProperties()
		//import 필요
		Properties props = System.getProperties();
		Set keys = props.keySet(); //Set import 필요
		
		//확장for문: 변경없이 배열의 값을 출력할 때
		for(Object objkey: keys) {
			String key = (String) objkey;
			System.out.println(key);
		}

	}

}
