package chapter06;

public class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double width, double height, double depth) {
        System.out.println("Constructing Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);

    }

    double volume2() {
        return width * height * depth;

    }

    void setDim(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

}
