package practicals;

class Car
{
	private int no, capacity, mYear;
	private String color, registration, mCompany, modelName;
	private double mileage;

	public Car() {
		
	}
	
	public Car(	int no, int capacity, int mYear,
				String color, String registration, String mCompany, String modelName,
				double mileage) {
		this.no = no;
		this.capacity = capacity;
		this.mYear = mYear;
		this.color = color;
		this.registration = registration;
		this.mCompany = mCompany;
		this.modelName = modelName;
		this.mileage = mileage;
	}
	
	public String getmCompany() {
		return mCompany;
	}
	public void setmCompany(String mCompany) {
		this.mCompany = mCompany;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getmYear() {
		return mYear;
	}
	public void setmYear(int mYear) {
		this.mYear = mYear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public void display() {
		System.out.println("Car no: " + getNo());
		System.out.println("Company Name: " + getmCompany());
		System.out.println("Model Name: " + getModelName());
		System.out.println("Registration no: " + getRegistration());
		System.out.println("Color: " + getColor());
		System.out.println("Manufacturing year: " + getmYear());
		System.out.println("Fuel mileage: " + getMileage());
		System.out.println("Seating capacity: " + getCapacity());
	}
	public String toString() {
		return ("Car no: " + getNo() +
				"\nCompany Name: " + getmCompany() +
				"\nModel Name: " + getModelName() +
				"\nRegistration no: " + getRegistration() +
				"\nColor: " + getColor() +
				"\nManufacturing year: " + getmYear() +
				"\nFuel mileage: " + getMileage() +
				"\nSeating capacity: " + getCapacity());
	}
	
	public void finalize() throws Throwable{
		System.out.println(	" Car is destroyed: " + mCompany +
							"Registration no: " + registration );
	}
}

public class Prac05 {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1);		
		c1.setNo(1);
		c1.setmCompany("Mercedes Benz");
		c1.setModelName("S Class");
		c1.setRegistration("GJ-01-ABCD-9999");
		c1.setColor("Sky Green");
		c1.setmYear(2023);
		c1.setMileage(35);
		c1.setCapacity(7);
		
		System.out.println("");
		
		c1 = null;
		
		Car c2 = new Car(2, 5, 2022, 
				"Sky Blue", "GJ-18-XYZ-7777", "BMW", "L6",
				 20);
		System.out.println(c2);			
		System.out.println("");
		
		System.gc();
		Car c3 = new Car(2, 5, 2022, 
				"Sky Blue", "GJ-18-XYZ-7777", "BMW", "L6",
				 20);
		System.out.println(c3);			
		System.out.println("");
		System.out.println(c2);			

	}

}
