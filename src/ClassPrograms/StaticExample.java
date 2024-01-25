package ClassPrograms;

public class StaticExample {
	
	static int countOfObjects = 0;
	int objectNo;
	
	StaticExample(){
		countOfObjects++;
		objectNo = countOfObjects;
	}

	public static void main(String[] args) {
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		StaticExample s3 = new StaticExample();
		System.out.println("Total no objects: " + countOfObjects);
		System.out.println("Object no: " + s1.objectNo);
		System.out.println("Object no: " + s2.objectNo);
		System.out.println("Object no: " + s3.objectNo);
		

	}

}
