package ClassPrograms;
class Animal1 { 
   public void makeNoise() {
	   System.out.println("talk");
   }
}

class Dog1 extends Animal1 {
   public void makeNoise() {  
	   System.out.println("Bark");
   }
}

public class DogExample1 {
public static void main(String[] args) {
	Animal1 animal = new Animal1();  
	animal.makeNoise();
	
	Dog1 dog = new Dog1();  
	dog.makeNoise();
	
	Animal1 animaldog = new Dog1(); 
	animaldog.makeNoise();
	
	if (animal instanceof Animal1) 
		System.out.println("animal is Animal");
	if (dog instanceof Animal1)
		System.out.println("dog is Animal");
	if (animaldog instanceof Animal1)
		System.out.println("animaldog is Animal");
	if (animal instanceof Dog1)
		System.out.println("animal is Dog"); 
	else
		System.out.println("animal is NOT a Dog"); 
}
}
