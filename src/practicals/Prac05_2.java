package practicals;
class MyClass{
	int no;
	public MyClass() {	}
	public MyClass(int n) 
	{		no = n; 	}
	public String toString() 
	{		return ("MyClass no: "+no); 	}
	public void finalize() throws Throwable{
		System.out.println("MyClass object destroyed: " + no);
	}
}
public class Prac05_2 {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		System.out.println(m1);		
		m1 = null;
		System.gc();
		MyClass m2 = new MyClass(11);
		System.out.println(m2);				
	}
}
