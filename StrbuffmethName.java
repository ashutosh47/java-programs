package lang;
import java.lang.reflect.*;

public class StrbuffmethName {

	public static void main(String[] args)throws Exception
	{
	  int count=0;
	  Class c=Class.forName("java.lang.StringBuffer");
	  Method []m=c.getDeclaredMethods();
	  for(Method m1:m)
	  {
		  count++;
		  System.out.println(m1.getName());
	  }
	  System.out.println("the numbers of methods"+count);
		
	

	}

}
