package chapter08;

//Using run time polymorphism
class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area of Figure is undefined ");
        return 0;

    }

}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    //override area of rectangle
    double area() {
        System.out.println("Inside area of rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    //override area of triangle
    double area() {
        System.out.println("Inside area of triangle");
        return dim1 * dim2 / 2;
    }
}

class FindAreas {
    public static void main(String[] args) {

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref;

        figref = r;
        System.out.println("Area is : " + figref.area());

        figref = t;
        System.out.println("Area is : " + figref.area());

        figref = f;
        System.out.println("Area is : " + figref.area());

    }
}
