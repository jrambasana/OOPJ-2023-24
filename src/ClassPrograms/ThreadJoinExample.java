package ClassPrograms;

//import statement  
import java.io.*;  

//The ThreadJoin class is the child class of the class Thread  
class ThreadJoin extends Thread  
{  
//overriding the run method  
public void run()  
{  
for (int j = 0; j < 2; j++)  
{  
try  
{  
//sleeping the thread for 300 milli seconds  
Thread.sleep(1000);  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
}  
//catch block for catching the raised exception  
catch(Exception e)  
{  
System.out.println("The exception has been caught: " + e);  
}  
System.out.println( j );  
}  
}  
}  

public class ThreadJoinExample  
{  
//main method  
public static void main (String argvs[])  
{  
	//creating 3 threads  
	ThreadJoin th1 = new ThreadJoin();  
	ThreadJoin th2 = new ThreadJoin();  
	ThreadJoin th3 = new ThreadJoin();  
	th1.setName("Th1");
	th2.setName("Th2");
	th3.setName("Th3");

	try  
	{  
		th1.start();  
		th1.join();  
		System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
		 
		th2.start();  
		th2.join();  
		System.out.println("The current thread name is: " + Thread.currentThread().getName());  
		  
		th3.start(); 
		th2.join();  
		System.out.println("The current thread name is: " + Thread.currentThread().getName());  
	}  
	catch(Exception e)  
	{  
	System.out.println("The exception has been caught " + e);  
	}
}  
}  