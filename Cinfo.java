package lang;
import java.lang.reflect.*;
class Cinfo {
	public static void main(String[]args )
	{
		int count=0;
	Object o=new Integer(10);
	Class c=o.getClass();
	System.out.println("name of class:"+c.getName());
		Method [] m=c.getDeclaredMethods();
		System.out.println("method informations");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("no of methods   "  +count);
		
		}
		
		
	}	


