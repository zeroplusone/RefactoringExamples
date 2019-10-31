package demo.refactor;

public class EncapsulateVariableAfter {

    public static void main(String[] args) {
        System.out.println(new PersonAfter().getName());
    }
}

class PersonAfter {
    private String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
