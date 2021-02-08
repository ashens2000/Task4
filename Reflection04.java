package task4;

import java.lang.reflect.Field;


public class Reflection04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		mainClass mc=new mainClass();//declaring the mainclass
		Field [] fields1= mc.getClass().getFields();//getting the public fields in the main class
		System.out.printf("There are %d fields\n", fields1.length);
		for(Field f: fields1)
		{
			//displaying the identified data in the field
			System.out.printf(" Field name=%s \nType=%s \nValue=%s \n", f.getName() , f.getType() , f.get(mc));
		}
	}

}
