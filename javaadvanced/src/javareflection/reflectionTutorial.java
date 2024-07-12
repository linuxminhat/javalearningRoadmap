package javareflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectionTutorial {
	public static void main(String[] args) throws Exception  {
		cat myCat = new cat("chung",1);
		Field[] catFields =  myCat.getClass().getDeclaredFields();
		for(Field field:catFields) {
			System.out.println(field.getName());
			//Browse individual properties
			if(field.getName().equals("name")) {
				field.setAccessible(true);
				field.set(myCat,"minh");
			}
		}
		Method[] catMethod = myCat.getClass().getDeclaredMethods(); 
		System.out.println(myCat.getname());
		for(Method myMethod:catMethod) {
			System.out.println(myMethod.getName());
		}
	}

}
