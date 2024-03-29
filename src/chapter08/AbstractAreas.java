package chapter08;

abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b) {
        dim1 = a;
        dim2 = b;

    }

    abstract double area();
}

class Rectangle2 extends Figure2 {

    Rectangle2(double a, double b) {
        super(a, b);

    }

    //override area of Rectangle
    double area() {
        System.out.println("Inside area of Rectangle");
        return dim1 * dim2;
    }
}

class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    //override area of Triangle
    double area() {
        System.out.println("Inside area of Triangle");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {

        //Figure2 f= new Figure2(); Illegal Now //Abstract classes can not be initiated with keyword new..
        Rectangle2 r = new Rectangle2(9, 5);
        Triangle2 t = new Triangle2(5, 8);

        Figure2 figref; //This is ok , no object is created.. (it is a reference variable not an object)

        figref =r;
        System.out.println("Area is : "+figref.area());

        figref =t;
        System.out.println("Area is : "+figref.area());



    }
}
