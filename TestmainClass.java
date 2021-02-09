package task4;

import kunit.KUnit2;
import static kunit.KUnit2.*;

public class TestmainClass
{

	void checkCAS()
	{
		
		mainClass mc=new mainClass();
		checkEqualStrings((mc.getfname()),"Ashen"); //checking equal data
		checkEqualStrings(mc.getlname(),"Sibera");//checking equal data
		checkEqualStrings(mc.getfname(),"Niroshan");//Checking unequal data
		checkEqualStrings(mc.getlname(),"Ashen");//Checking unequal data
		checkUnEqualStrings(mc.getfname(),"Ashen");//Checking equal data whether they are unequal
		checkUnEqualStrings(mc.getlname(),"Sibera");//Checking equal data whether they are unequal
		checkUnEqualStrings(mc.getfname(),"Sibera");//Checking unequal data whether they are unequal
		checkUnEqualStrings(mc.getlname(),"Ashen");//Checking unequal data whether they are unequal

		
	}

	public static void main(String[] args)
	{
		TestmainClass tmc=new TestmainClass();
		tmc.checkCAS();
		report();
	}

}
