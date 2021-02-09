package kunit;

import java.util.*;

/******************************************************************************
This class KUnit2 is mainly created to be used as a prototype of a unit testing 
system for the data type String. Created to be used for the "mainClass.java"

Author@ashen Sibera
 ******************************************************************************/

public class KUnit2 {
  private static List<String> checks;
  private static int testscarriedout = 0;
  private static int passedTests = 0;
  private static int failedTests = 0;

  /******************************************************************************
 Here in addToReport, a report is formed using a list of string and 
 a message is added to the final report 
   ******************************************************************************/

  private static void addToReport(String txt) {
    if (checks == null) {
      checks = new LinkedList<String>();
    }
    checks.add(String.format("%04d: %s", testscarriedout++, txt));
  }

  /******************************************************************************
  This method is similar to the assertequals method. It checks 2 String values. 
  According to the message the appropriate value is printed 
   ******************************************************************************/
  
  public static void checkEqualStrings(String value1, String value2) {
    if (value1==(value2)) {
      addToReport(String.format(" Passed Test(CES)(True) "+ value1+" == "+value2));
      passedTests++;
    } else {
      addToReport(String.format("* Failed Test- False(CES)(False) "+ value1+" == "+value2));
      failedTests++;
    }
  }

  /******************************************************************************
  This method is similar to the assertequals method. It checks 2 String values. 
  According to the message the appropriate value is printed 
   ******************************************************************************/
  
  public static void checkUnEqualStrings(String value1, String value2) {
    if (value1 != value2) {
      addToReport(String.format("Passed Test (CUES)(True) "+ value1+" != "+value2));
      passedTests++;
    } else {
      addToReport(String.format("*Failed Test (CUES)(False) "+ value1+" != "+value2));
      failedTests++;
    }
  }

  /******************************************************************************
  Here the report method is used to output the results in the form of a report
   ******************************************************************************/

  public static void report() {
    System.out.printf("%d Passed Tests\n", passedTests);
    System.out.printf("%d Failed Tests\n", failedTests);
    System.out.println();
    
    for (String check : checks) {
      System.out.println(check);
    }
  }
}