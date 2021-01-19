package com.sand.automation;

import org.apache.log4j.Logger;

public class Log {

//Initialize Log4j logs

private static Logger Log = Logger.getLogger(Log.class.getName());//

// This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

public static void startTestCase(String sTestCaseName){

Log.info("****************************************************************************************");

Log.info("****************************************************************************************");

Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

Log.info("****************************************************************************************");

Log.info("****************************************************************************************");

}

//This is to print log for the ending of the test case

public static void endTestCase(String sTestCaseName){

Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

Log.info("X");

Log.info("X");

Log.info("X");

Log.info("X");
}
}