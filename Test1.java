package lang;

public class Test1 {
    String name;
	int rollno;
	
	Test1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}

	public static void main(String[] args) {
		// program related with equals method
Test1 t=new Test1("ram",101);
//System.out.println();
Test1 t1=new Test1("shyam",102);

Test1 t2=new Test1("ram",101);
    Test1 t3=t;
    //Test1 t3=t1;
System.out.println(t.equals(t1));
System.out.println(t.equals(t2));
System.out.println(t.equals(t3));
//System.out.println(t.equals(t4));
}

}


