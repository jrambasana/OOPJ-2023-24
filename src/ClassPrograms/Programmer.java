package ClassPrograms;
class Employee{  
	 float salary=40000;  
	 public void displaySalary() {
		 System.out.println("Employee Salary: " + salary);
	 }
	}  
public class Programmer extends Employee{
	int bonus=10000;  	
	 public void displaySalary() {
		 System.out.println("Programmer Salary: " + salary);
	 }	
	 public void displaySalary(String s) {
		 System.out.println("Programmer Salary: " + salary);
	 }	
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus); 
	   p.displaySalary();
	}  
}