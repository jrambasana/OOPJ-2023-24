package ClassPrograms;

class Animal{  
	int a = 10;
	public Animal() 
	{	System.out.println("Animal created");	}  
	public Animal(String name) 
	{	System.out.println("Animal "+name+" created");	}  
	
	void eat()
	{	System.out.println("Animal eating...");	}  
	void eat(String food)
	{	System.out.println("Animal Eating " + food);	}  
}  

class Dog extends Animal{ 
	int b = 20;
	public Dog() 
	{	System.out.println("Dog created");	}  
	public Dog(String name) 
	{	super(name);
		System.out.println("Dog "+name+" created");	}  
	void bark()
	{	System.out.println("Dog barking...");	}  
}  
class TestInheritance{  
	public static void main(String args[]){  
		Dog d1 = new Dog();  
		d1.eat();  
		d1.bark();  
		
		Animal d2 = new Dog("Bob"); 
		d2.eat(); 
		((Dog)d2).bark();	
	}
}  