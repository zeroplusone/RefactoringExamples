package demo.refactor;

public class InlineFunction {

    private final int _numberOfLateDeliveries = 4;

    int getRating() {
        return moreThanFiveDeliveries(_numberOfLateDeliveries) ? 2 : 1;
    }

    private boolean moreThanFiveDeliveries(int driver) {
        return driver > 5;
    }

    public static void main(String[] args) {
        System.out.println(new InlineFunction().getRating());
    }
}
