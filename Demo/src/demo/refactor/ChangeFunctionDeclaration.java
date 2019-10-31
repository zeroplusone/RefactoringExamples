package demo.refactor;

public class ChangeFunctionDeclaration {
    double circum(int radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        System.out.println(new ChangeFunctionDeclaration().circum(4));
    }
}
