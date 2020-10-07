package com.solid;

public class TakeName extends GiveName {
 
	public void printName() {
		String nameFromGiveNameClass = super.name();
		System.out.println(" final Name is :"+ nameFromGiveNameClass +  " chopperla");
	}
}
