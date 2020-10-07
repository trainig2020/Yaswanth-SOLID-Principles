package com.solid;

public class Main {
	
	public void caluculateArea(Rectangle r) {
		r.setBreadth(5);
		r.setLength(10);
		System.out.println(r.getArea());
	}
   
	 public static void main(String[] args) {
		 Main m = new Main();
		 System.out.println("Area of rectangle is :");
		 m.caluculateArea(new Rectangle());
		 System.out.println("Area of square is :");
		 m.caluculateArea(new Square());
	}
}
