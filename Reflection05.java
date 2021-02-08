package task4;

import java.lang.reflect.Field;



public class Reflection05 {

	public static void main(String[] args) throws Exception{
		mainClass mc=new mainClass();
		Field [] fields= mc.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);
		for(Field f: fields)
		{
			System.out.printf(" field name=%s type=%s  value=%s\n", f.getName() , f.getType() , f.get(mc));
		}

	}

	}


