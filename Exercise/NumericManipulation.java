package Exercise;

public class NumericManipulation {
    public static void main(String[] args) {
        double price = 20.50; // for example
        double tax = 0.05;    // representing 5% tax, for example
        int quantity = 1;     // for example
        double total;
        String custName = "John Doe";
        String itemDesc = "blue Shirt";
        total = price * quantity * (1 + tax);

        String message = custName + " wants to purchase " + quantity + " of " + itemDesc + ".";
        System.out.println(message);
        System.out.printf("Total cost with tax is: %.2f.", total);



    }
}
