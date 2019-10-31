package demo.refactor;

public class ChangeFunctionDeclarationAfter {
    double circumference(int radius, String test) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        System.out.println(new ChangeFunctionDeclarationAfter().circumference(4, "444"));
    }
}
