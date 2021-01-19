package com.sand.automation;
//sandhya singireddy 
//method overlaoding example

public class Jmethodovl {
	public void sum1() {
		System.out.println("method without arguments");
	}

	public void sum1(int x) {
		System.out.println("method with  arguments " + x);
	}

	public void sum1(int x, int y) {
		System.out.println("method with  arguments " + x + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jmethodovl jobj = new Jmethodovl();
		jobj.sum1();
		jobj.sum1(3);
		jobj.sum1(3, 4);
	}
	
	//non static and statis
	//non static methods can be called by creatign the object 
	//class level variables an dmethods are accessed only through object
	//can static called by object references
	//yes but it gives a warning yes but no need of doing htat you can call directly
	//primitive
	//non primitieve
	
	//int char, long, double, 
	//Integer, String, 
	
//	Primitive Data Type: In Java, the primitive data types are the predefined data types of Java. They specify the size and type of any standard values. 
	//Java has 8 primitive data types namely byte, short, int, long, float, double, char and Boolean.
	
//wrapper classes for Integger, Double, Boolean
	//Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
}
