package demo.refactor;

public class SpiitPhaseAfter {
    double priceOrder(ProductAfter productAfter, int quantity, ShippingMethodAfter shippingMethodAfter) {
        PriceData priceData = calculatePriceData(productAfter, quantity);
        double price =  applyShipping(priceData, shippingMethodAfter);
        return price;
    }

    double applyShipping(PriceData priceData, ShippingMethodAfter shippingMethodAfter) {
        double shippingPerCase = (priceData.basePrice > shippingMethodAfter.discountThreshold)
                                 ? shippingMethodAfter.discountedFee : shippingMethodAfter.feePerCase;
        double shippingCost = priceData.quantity * shippingPerCase;
        return priceData.basePrice - priceData.discount + shippingCost;
    }

    PriceData calculatePriceData(ProductAfter productAfter, int quantity) {
        int basePrice = productAfter.basePrice * quantity;
        double discount = Math.max(quantity - productAfter.discountThreshold, 0)
                          * productAfter.basePrice * productAfter.discountRate;
        return new PriceData(basePrice, quantity, discount);
    }

    public static void main(String[] args) {
        System.out.println(new SpiitPhaseAfter().priceOrder(new ProductAfter(20), 4, new ShippingMethodAfter()));
    }
}

class ProductAfter {
    int basePrice;
    public int discountThreshold = 1;
    public double discountRate = 0.9;

    public ProductAfter(int basePrice) {
        this.basePrice = basePrice;
    }
}

class ShippingMethodAfter {
    public double discountThreshold = 0.9;
    public double discountedFee = 1;
    public double feePerCase = 5;
}

class PriceData{
    int basePrice;
    int quantity;
    double discount;

    public PriceData(int basePrice, int quantity, double discount) {
        this.basePrice = basePrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
