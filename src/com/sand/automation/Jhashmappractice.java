package com.sand.automation;

import java.util.HashMap;
import java.util.Map.Entry;

public class Jhashmappractice {
	
	//hmap - it add in non synchronixed 
	//implemetns map interface
	//it may have one null key and multiple null values
	//no order
	
	
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(0, "sandhya");
		hmap.put(1, "sandhya");
		hmap.put(2, "sandhya");
		hmap.put(2, "saritha");
		System.out.println(hmap.get(1));
	
			
			for (Entry e : hmap.entrySet()) {
				
				System.out.println(e.getKey());
				System.out.println(e.getValue());
		}
		
			HashMap<Integer, Car> hmap2 = new HashMap<Integer, Car>();
			Car car1 = new Car(1980, "bmw");
			Car car2 = new Car(1990, "tesla");
			Car car3 = new Car(2000, "honda");
			hmap2.put(0, car1);
			hmap2.put(0, car2);
			hmap2.put(0, car3);
			
			//hmap.put(0, "sandhya");
			//hmap.put(1, "sandhya");
			//hmap.put(2, "sandhya");
			//hmap.put(2, "saritha");
			//System.out.println(hmap.get(1));
			
			for (Entry e : hmap2.entrySet()) {
				
				System.out.println(e.getKey());
				m=e.
		}
		
	
		
		
	}

}
