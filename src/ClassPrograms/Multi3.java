package ClassPrograms;

public class Multi3 implements Runnable{  
public void run(){  
	System.out.println("Run method thread is running...");
	for(int i = 0; i < 10 ; i++)
		System.out.println("Run method thread: "+i);
}  	  
public static void main(String args[]){  
	Multi3 m1=new Multi3();  
	Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
	t1.start();  
	System.out.println("Main thread is running...");  
	for(int i = 0; i < 10 ; i++)
		System.out.println("Main method thread: "+i);	}  
}  
