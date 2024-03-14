package chapter10;

//This program contains error , will not compile..
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throw one ");
        throw new IllegalAccessException("demo"); //gives error , unhandled exception
//        throw new RuntimeException();
    }

    public static void main(String[] args) throws IllegalAccessException{
//    	try {
        throwOne();
//    	}catch(IllegalAccessException e) {}
    }
}
