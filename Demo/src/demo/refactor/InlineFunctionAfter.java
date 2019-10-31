package demo.refactor;

public class InlineFunctionAfter {

    private final int _numberOfLateDeliveries = 4;

    int getRating() {
        return _numberOfLateDeliveries > 5 ? 2 : 1;
    }

    public static void main(String[] args) {
        System.out.println(new InlineFunctionAfter().getRating());
    }
}
