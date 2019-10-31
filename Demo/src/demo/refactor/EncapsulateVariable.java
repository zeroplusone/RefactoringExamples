package demo.refactor;

public class EncapsulateVariable {

    public static void main(String[] args) {
        System.out.println(new Person().name);
    }
}

class Person {
    public String name = "name";
}
