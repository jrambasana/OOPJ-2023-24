package chapter04;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i=10;
        k = i < 0 ? -i : i; //Get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i+" is "+k);

        i=-10;
        k = i < 0 ? -i : i; //Get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i+" is "+k);

    }
}
