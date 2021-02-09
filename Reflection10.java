package task4;

import java.lang.reflect.Method;

public class Reflection10 {

	

		public static void main(String[] args) throws Exception{
			mainClass mc=new mainClass();
			Method m= mc.getClass().getDeclaredMethod("setlname",String.class);
			m.setAccessible(true);
			m.invoke(mc, "Niroshan");
			System.out.println(mc);
	}


}