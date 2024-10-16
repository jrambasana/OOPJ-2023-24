package ClassPrograms;

public class Multi extends Thread{
	String name;
	public Multi(String name) {
		super(name);
		this.name = name;
	}
public void run(){  
	System.out.println(name + " thread is running...");
	for(int i = 0; i < 10 ; i++) {
		System.out.println(name + " thread: "+i);
		try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
	}
}  
public static void main(String args[]){  
	Multi t1=new Multi("Main2"); 
	t1.start();  
	System.out.println("Main1 thread is running..."); 
	for(int i = 0; i < 10 ; i++)
	{
		System.out.println("Main1 thread: "+i);
		try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
	}
}  
}  