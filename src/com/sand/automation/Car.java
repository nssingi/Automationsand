package com.sand.automation;

public class Car {
	int model;
	String color;
	int a;
	int b;
	public Car(int model, String color) {
		this.model=model;
		this.color=color;
		
		
	}
	
	public void sum(int a,int b) {
		int c= a+b;
		System.out.println("sum of a and b i s"+ c);
	}
	public void sum1(Car cobj) {
		int k = cobj.a+cobj.b;
		System.out.println("sum of a and b i s"+ k);
	}
	
	
	
	public static void main(String[] args) {
		
		Car car = new Car(1, "red");
		car.a=4;
		car.b=5;
		car.sum(3, 4);
		car.sum1(car);
		Car car1 = new Car();
		car.a=5;
		car.b=6;
		car.sum1(car);
				/*Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model=1860;
		b.model=1900;
		c.model=2000;
		System.out.println("a.model "+a.model );
		System.out.println("b.model "+b.model );
		System.out.println("c.model "+c.model );
		a=b;
		b=c;
		c=a;
		System.out.println("a.model after changing refernce "+a.model );
		System.out.println("b.model after changing refernce"+b.model );
		System.out.println("c.model after changing refernce"+c.model );
		
		a.model=2010;
		b.model=2015;
		c.model=2020;
		
		System.out.println("a.model after adsinging"+a.model );
		System.out.println("b.model after adsinging"+b.model );
		System.out.println("c.model after adsinging"+c.model );*/
		
	}

	public int getmodel() {
		// TODO Auto-generated method stub
		return model;
	}

}
