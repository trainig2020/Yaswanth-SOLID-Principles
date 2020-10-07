package com.solid;

public class UserSettingService {

	public void changeEmail(String user) { 
		System.out.println("user is :"+ user);
		if (SecurityService.checkAccess(user)) {
             System.out.println("yes he is an authorized user give access");
		}
		else {
			System.out.println("Access denied");
		}

	}
}