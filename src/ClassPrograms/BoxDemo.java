package ClassPrograms;

class Box
{
	double width, height, depth;
	void volume()	{
		System.out.println("Volume is: "+width*height*depth);
	}
}


public class BoxDemo {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.width 	= 10;
		mybox1.height 	= 20;
		mybox1.depth  	= 30;
		
		Box mybox2 = new Box();
		mybox2.width 	= 100;
		mybox2.height 	= 200;
		mybox2.depth 	= 300;
		
		
		mybox1.volume();
		mybox2.volume(); 
	}

}
