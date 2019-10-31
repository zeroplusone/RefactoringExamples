package demo.refactor;

public class CombineFunctionAfter {

    // Combine functions into transform
    static ReadingAfter enrichReading(ReadingAfter aReading) {
        // demo.refactor.ReadingAfter copy =SerializationUtil.clone(aReading); //Apache Commons Lang https://www.baeldung.com/java-deep-copy
        aReading.setBase(100 * aReading.quntity);
        aReading.setTaxableCharge(100 * aReading.quntity * 1.1);
        return aReading;
    }

    public static void main(String[] args) {
        ReadingAfter aReading = new ReadingAfter("Alice", 3);
        System.out.println(aReading.baseCharge());
        System.out.println(aReading.taxableCharge());

        ReadingAfter enriched = enrichReading(aReading);
        System.out.println(enriched.getBase());
        System.out.println(enriched.getTaxableCharge());
    }

}

// Combine functions into class
class ReadingAfter{
    String customer;
    int quntity;
    private double base;
    private double taxableCharge;

    public ReadingAfter(String customer, int quntity) {
        this.customer = customer;
        this.quntity = quntity;
    }

    String baseCharge() {
        return customer + 100 * quntity;
    }

    String taxableCharge() {
        return customer + 100 * quntity * 1.1;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setTaxableCharge(double taxableCharge) {
        this.taxableCharge = taxableCharge;
    }

    public double getBase() {
        return base;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }
}
