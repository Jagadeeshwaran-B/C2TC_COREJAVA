package com.tns.ifet.daysix.usingfinal;

public class FinalVariable {
	int x = 100;
	static int Y;
	static int Z = 10;
	void change() {
		x = 30; // final variables can't be reassigned
		Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		Z = 100; 
		System.out.println("Value of Y: " + Y);
	}

}
