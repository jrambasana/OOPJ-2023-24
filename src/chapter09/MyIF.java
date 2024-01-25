package chapter09;

public interface MyIF {
    //This is a "normal" interface method declaration
    //It does not define a default implementation
    int getNumber();

    //This is a default method , Notice that it provides a default implementation
    default String getString() {
        return "Default String";
    }


}
