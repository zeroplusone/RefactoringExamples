package demo.refactor;

public class ExtractVariable {

    private int _quantity = 2;
    private int _itemPrice = 20;

    double getPrice() {
        return _quantity * _itemPrice -
               Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
               Math.min(_quantity * _itemPrice * 0.1, 100);
    }
    public static void main(String[] args) {
        System.out.println(new ExtractVariable().getPrice());
    }
}
