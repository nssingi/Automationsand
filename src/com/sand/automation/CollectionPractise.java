package com.sand.automation;
import java.util.*;

public class CollectionPractise {
	
	

	
public static void main(String[] args) {
	
	System.out.println("hi there from eclipse");
	
	ArrayList<String> arr1 = new ArrayList<String>();
	arr1.add("sandhya");
	arr1.add("aanika");
	arr1.add("sandeep");
	
	//retreive data
	
	for (int i=0;i<arr1.size();i++) {
		System.out.println("arr1 values are "+ arr1.get(i));
		
		
	}
	
	//arraylist storing class objects
	
	Car a = new Car();
	a.model=1860;
	a.color="blue";
	Car b = new Car();
	b.model=1890;
	b.color="white";
	Car c = new Car();
	c.model=2000;
	c.color="red";
	
	ArrayList<Car> arr2 = new ArrayList<Car>();
	arr2.add(a);
	arr2.add(b);
	arr2.add(c);
	Iterator<Car> it = arr2.iterator();
	while(it.hasNext()) {
		Car car = it.next();
		System.out.println("car.model"+ car.model);
		System.out.println("car.color "+ car.color);
	
	}
	//add all adds 2 merge 2 arraylist
	 
	 List<Object> lstObject = new ArrayList<Object>();
	 lstObject.add(1232);
	 lstObject.add("String");
	 lstObject.add(122.212f);
	 lstObject.add(a);
	 lstObject.add(b);

	 for (Object obj : lstObject) {
	     if (obj.getClass() == String.class) {
	         System.out.println("I found a string :- " + obj);
	     }
	     if (obj.getClass() == Integer.class) {
	         System.out.println("I found an int :- " + obj);
	     }
	     if (obj.getClass() == Float.class) {
	         System.out.println("I found a float :- " + obj);
	     }
	     if (obj.getClass() == Car.class) {
	         Car car = (Car) obj;
	         System.out.println("I found a person object");
	         System.out.println("Person Id :- " + car.getmodel());
	       
	     }
	 }
	
	
}
}
