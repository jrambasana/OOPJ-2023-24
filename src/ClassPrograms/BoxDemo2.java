package ClassPrograms;

class Box2 {
	private double width, height, depth;
	public Box2() {
		width = height = depth = 10; 
	}
	public Box2(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public void volume()	{
		System.out.println("Volume is: "+width*height*depth);
	}
	
	public void finalize() throws Throwable{
		System.out.println("My Box Object is garbage collected.");
	}
}

public class BoxDemo2 {
	public static void main(String[] args) {
		Box2 mybox1 = new Box2(10, 20, 30);
		mybox1.volume();
		mybox1 = null;
		System.gc();
		
		Box2 mybox2 = new Box2();
		mybox2.setWidth(10);
		mybox2.setHeight(20);
		mybox2.setDepth(30);
		
		mybox2.volume(); 
	}

}
