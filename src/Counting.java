

public class Counting
{
	public static int counter = 0;
	public int counter2 = 0;
	public static void main(String[] args)
	{
		Counting c1 = new Counting();
		System.out.println("Class ka counter is "+ ++c1.counter);
		System.out.println("C1 ka counter2 is "+ ++c1.counter2);
		
		Counting c2 = new Counting();
		System.out.println("Class ka counter is "+ ++c2.counter);
		System.out.println("C2 ka counter2 is "+ ++c2.counter2);

		c1.count();
		c2.count();
//		System.out.println("At the end of this program, counter is "+ counter);
	}//end method main
	
	public void count()	{
		int counter2=10;
		System.out.println("At the end of this method, counter is "+ counter2);
		System.out.println("At the end of this method, counter is "+ this.counter2);
	}//end method count
}//end class Counting
