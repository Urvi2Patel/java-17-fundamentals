package ex05_1_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        boolean outOfStock = false;
       if(quantity > 1){
        System.out.println("quantity is " + quantity);
       }

       if(outOfStock) {
        System.out.println("Shirt is Out of stock");
       } else {
        System.out.println("Shirt is available and cost of shirt is " + total);
       }

        // Test quantity and modify message if quantity > 1.
        // ... Your code here ...

        // Test outOfStock and notify user in either case.
        // ... Your code here ...
    }
}
