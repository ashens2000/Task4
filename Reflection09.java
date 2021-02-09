package task4;

import java.lang.reflect.Method;



public class Reflection09 {

	public static void main(String[] args)throws Exception{
		mainClass mc=new mainClass();
		Method [] methods= mc.getClass().getMethods();
		System.out.printf("There are %d methods\n", methods.length);
		for(Method m: methods)
		{
			System.out.printf(" method name=%s parameters=%s\n", m.getName() ,m.getReturnType());
			Class [] types = m.getParameterTypes();
			for(Class c :types) {
				System.out.print(c.getName()+" ");
			}
			//System.out.println();
		}
}

}
