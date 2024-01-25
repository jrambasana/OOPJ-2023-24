package practicals;

public class Prac02 {

	public static void main(String[] args) {
		short a=32767;  
		short b=32767;  
		//a+=b;//a=a+b internally so fine  
		a=(short)(a+b+32770);//Compile time error because 10+10=20 now int  
		System.out.println(a);  
	}

}
