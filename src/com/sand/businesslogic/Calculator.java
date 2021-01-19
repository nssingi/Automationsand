

package com.sand.businesslogic;

import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.then;
import static io.restassured.RestAssured.when;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.path.json.JsonPath.from;


import java.util.Scanner;

public class Calculator {
	
	public String concatstr(String str1, String str2) {
		
		String str3 = str1 + str2;
		return str3;
		
	}
	

	public static void main(String[] args) {
		//scanner to read input  from console
		// TODO Auto-generated method stub
		/*Scanner scnobject = new Scanner(System.in);
		int number1 ;
		System.out.println("enter the first number: ");
		number1= scnobject.nextInt();
		System.out.println("enter teh second  number2");
		int number2 = scnobject.nextInt();
		int number3 = number1 + number2;
		System.out.println("enter hte character type ");
		char x = scnobject.next().charAt(0);
		System.out.println("sum of 2 number is hello: " + number3);
		System.out.println("character value enter is  " + x);*/
		Calculator cal1 = new Calculator();
		cal1.concatstr("sandhya", "singireddy");
		

	}

}
