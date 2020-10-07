package com.solid;

import java.util.Scanner;

public class Main {
   
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of user :");
		String name = sc.next();
		UserSettingService uss = new UserSettingService();
		uss.changeEmail(name);
		
	}
}
