package lang;

public class Strtostring {
	int uid;
	String name;
	/*public String toString()//it is convention to add tostring() method 
	 *                            in your program
	{
		return uid+" "+name;
		
	}*/
	Strtostring(int uid,String name)
	{
		this.uid=uid;
		this.name=name;
		
	}
    public static void main(String[] args) {
	String s=new String("ashutosh");
	System.out.println(s);
	Integer i=new Integer(101);
	System.out.println(i);
	Strtostring s1=new Strtostring(101,"ashutosh");
	System.out.println(s1);
	System.out.println(s1.toString());
	}

}
