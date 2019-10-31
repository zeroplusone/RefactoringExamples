package demo.refactor;

public class CombineFunction {

    private static String baseCharge(Reading aReading) {
        return aReading.customer + 100 * aReading.quntity;
    }

    private static String taxableCharge(Reading aReading) {
        return aReading.customer + 100 * aReading.quntity * 1.1;
    }


    public static void main(String[] args) {
        Reading aReading = new Reading("Alice", 4);
        System.out.println(baseCharge(aReading));
        System.out.println(taxableCharge(aReading));
    }

}

class Reading{
    String customer;
    int quntity;

    public Reading(String customer, int quntity) {
        this.customer = customer;
        this.quntity = quntity;
    }
}
