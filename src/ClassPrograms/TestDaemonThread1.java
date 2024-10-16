package ClassPrograms;
public class TestDaemonThread1 extends Thread{  
	 public void run(){ 
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
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
	 }  
	 public static void main(String[] args){  
	  TestDaemonThread1 t1=new TestDaemonThread1();//creating thread  
	  TestDaemonThread1 t2=new TestDaemonThread1();  
	  TestDaemonThread1 t3=new TestDaemonThread1();  
	  
	  t1.setDaemon(true);//now t1 is daemon thread  
	    
	  t1.start();//starting threads  
	  t2.start();  
	  t3.start();  
	 }  
	}  