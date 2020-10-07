package com.solid;

public class SecurityService {

	public static boolean checkAccess(String user)
	{   
		System.out.println("User is :" + user);
		String crt ="yaswanth";
		
		if ( user.equalsIgnoreCase(crt)) {
			
			return true;
		}
		else {
			return false;
		}
		
	
	}
	
}
