// Write a java program to:
// (a) Find a factorial 		(b) Print Fibonacci series.
// (c) Find the sum of digits in a given number. 

package practicals;

import java.util.Scanner;

public class Prac03 { 						// Class Starts
	
	public static long factorial(int num) {	// factorial method Starts
        long i=1,fact=1;
        while(i<=num) {
            fact = fact*i;
            i++;
        }
        return fact;
	}											// factorial method Ends
	
	public static void fibonacci(int n)	{	// fibonacci method Starts
		int n1=0, n2=1, n3, i;    
		System.out.print(n1+" "+n2);//printing 0 and 1    
		for( i = 2 ; i < n ; ++i )//loop starts from 2 as 0 n 1 are already printed    
		{    
			n3 = n1+n2;    
			System.out.print(" "+n3);    
			n1 = n2;    
			n2 = n3;    
		}
	}
	
	public static int sumOfDigits(int n){	// sumOfDigits method Starts
		int sum;
		for( sum = 0 ; n != 0 ; n = n/10 )  
		{  
			//finds the last digit and add it to the variable sum      
			sum = sum + n % 10;  
		}  
		return sum;
	}
	
	public static void main(String[] args) {	// main method Starts
		Scanner sc = new Scanner(System.in);	

		System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of the number: " + factorial(num)); 
        

		System.out.print("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Fibonacci of the number " + num + " is: ");
        fibonacci(num);
        System.out.println("");
        
		System.out.print("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Sum of digits of the number " + num + " is: ");
        System.out.println(sumOfDigits(num));        
	}											// main method Ends

}												// Class Ends