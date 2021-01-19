package com.sand.tests;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sand.businesslogic.Calculator;
//unit testing a java class with testng
public class Calculatortest {
  @Test
  public void testAppend() {
	  Calculator calc = new Calculator();
	  String str3 =calc.concatstr("sandhya", "singireddy");
	  Assert.assertEquals(str3, "sandhyasingireddy");
  }
  
  @Test
  public void testAppendnoargs() {
	  Calculator calc = new Calculator();
	  String str3 =calc.concatstr("", "");
	  Assert.assertEquals(str3, "");
  }
  
  @Test
  public void testAppendnonearg() {
	  Calculator calc = new Calculator();
	  String str3 =calc.concatstr("", "srt");
	  Assert.assertEquals(str3, " srt");
  }
}

