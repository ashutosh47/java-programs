package lang;
public class Mycreatedequals {
	String name;
	int rollno;
	Mycreatedequals(String name,int rollno)
	{
		this.rollno=rollno;
		this.name=name;
	}

public boolean equals(Object obj)
{
 //int rollno1=rollno;
 //String name1=name;
 Mycreatedequals m=(Mycreatedequals)obj;
 //String name2=m.name;
 //int rollno2=m.rollno;
 //only with object not variable 
  if(name.equals(m.name)&&rollno==m.rollno)
  {
  return true;	
  }
  else
  {
 	 return false;
  }
 }
 


 
public static void main(String[] args) 
{//overriding equals method 
		//my equals created by me and equals is a method we can use it 
	 Mycreatedequals m1=new Mycreatedequals("ram",101);
	 Mycreatedequals m2=new Mycreatedequals("shyam",102);
	 Mycreatedequals m3=new Mycreatedequals("ram",101);
	 Mycreatedequals m4=m1;
System.out.println(m1.equals(m2));
System.out.println(m1.equals(m3));
//System.out.println(m1.equals(m2));
System.out.println(m1.equals(m4));

}

}
