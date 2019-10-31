package demo.refactor;

public class ExtractVariableAfter {

    private int _quantity = 2;
    private int _itemPrice = 20;

    double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
        double Shipping = Math.min(_quantity * _itemPrice * 0.1, 100);
        return basePrice -
               quantityDiscount +
               Shipping;
    }
    public static void main(String[] args) {
        System.out.println(new ExtractVariable().getPrice());
    }
}
