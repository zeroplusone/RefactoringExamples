package demo.refactor;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class ExtractFunction {

    private final Vector<Order> _orders = new Vector<>(Arrays.asList(new Order(1.0), new Order(2.0)));
    private final String _name = "name";

    public void printOwing() {


        // print banner
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");

        // calculate outstanding
        Enumeration e = _orders.elements();
        double outstanding1 = 0.0;
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding1 += each.getAmount();
        }
        double outstanding = outstanding1;

        //print details
        System.out.println ("name:" + _name);
        System.out.println ("amount" + outstanding);
    }

    class Order{
        double amount;

        public Order(double amount){
            this.amount = amount;
        }
        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        new ExtractFunction().printOwing();
    }
}
