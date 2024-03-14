package ClassPrograms;
class A{  
	 float a1=40000;  
	 public A() { System.out.println("A object created");}
	 public void methodA1() {
		 System.out.println("A's methodA1: " + a1);
	 }
	}  
public class B extends A{
	int b1=10000;  	
	 public void methodA1() {
		 super.methodA1();
		 System.out.println("B's methodA1: " + a1);
	 }	
	 public void methodA1(String s) {
		 this.methodA1();
	 }	
	 public void methodB1() {
		 System.out.println(1);
	 }		 
	 public static void main(String args[]){  
	   B p=new B();  
	   System.out.println(p.a1);  
	   System.out.println(p.b1); 
	   p.methodA1();
	}  
}