package demo.refactor;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class ExtractFunctionAfter {

    private final Vector<Order> _orders = new Vector<>(Arrays.asList(new Order(1.0), new Order(2.0)));
    private final String _name = "name";

    public void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    private double getOutstanding() {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;
        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    private void printDetails(double outstanding) {
        System.out.println("name:" + _name);
        System.out.println("amount" + outstanding);
    }

    private void printBanner() {
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }

    class Order {
        double amount;

        public Order(double amount){
            this.amount = amount;
        }
        public double getAmount() {
            return amount;
        }

    }

    public static void main(String[] args) {
        new ExtractFunctionAfter().printOwing();
    }
}
