package com.solid;

public class Main {
    
	public static void main(String[] args) {
		Project p = new Project();
		p.implement(new BackEndDeveloper());
		p.implement(new FrontEndDeveloper());
		
		Developer dev = new BackEndDeveloper();
		dev.develop();
		Developer dev1 = new FrontEndDeveloper();
		dev1.develop();
		
	}
}
