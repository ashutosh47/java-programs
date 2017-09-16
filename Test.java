package lang;

public class Test {
    
      int i;
      Test(int i)
      {
    	 this.i=i;
      }
      public String toString()
      {
    	  return i+"";
      }
	
	public int hashCode()
	{
		return i;
	}
	public static void main(String[] args)
	{
		Test t=new Test(10);
		Test t1=new Test(100);
		System.out.println(t);
		System.out.println(t1);
    }

}
