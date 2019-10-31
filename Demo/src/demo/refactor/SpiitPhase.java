package demo.refactor;

public class SpiitPhase {
    double priceOrder(ProductAfter productAfter, int quantity, ShippingMethodAfter shippingMethodAfter) {
        int basePrice = productAfter.basePrice * quantity;
        double discount = Math.max(quantity - productAfter.discountThreshold, 0)
                          * productAfter.basePrice * productAfter.discountRate;
        double shippingPerCase = (basePrice > shippingMethodAfter.discountThreshold)
                                 ? shippingMethodAfter.discountedFee : shippingMethodAfter.feePerCase;
        double shippingCost = quantity * shippingPerCase;
        double price =  basePrice - discount + shippingCost;
        return price;
    }

    public static void main(String[] args) {
        System.out.println(new SpiitPhaseAfter().priceOrder(new ProductAfter(20), 4, new ShippingMethodAfter()));
    }
}

class Product{
    int basePrice;
    public int discountThreshold = 1;
    public double discountRate = 0.9;

    public Product(int basePrice) {
        this.basePrice = basePrice;
    }
}

class ShippingMethod{
    public double discountThreshold = 0.9;
    public double discountedFee = 1;
    public double feePerCase = 5;
}
