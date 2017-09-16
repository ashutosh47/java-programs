package lang;

public class MyTest {
	
	String name;
	int id;
	MyTest(String name,int id)
	{ 
		this.name=name;
		this.id=id;
	  
	}
	public boolean equals(Object obj)
	{
	  MyTest t=(MyTest)obj;
	  if(name.equals(t.name)&&t.id==id)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
		  
	  }
	}
	public static void main(String[] args) {
	MyTest m1=new MyTest("ashu",101);
	MyTest m2=new MyTest("jafri",102);
	MyTest m3=new MyTest("ashu",101);
	MyTest m4=m1;
	System.out.println(m1.equals(m2));
	System.out.println(m1.equals(m3));
	System.out.println(m1.equals(m4));}

} 
