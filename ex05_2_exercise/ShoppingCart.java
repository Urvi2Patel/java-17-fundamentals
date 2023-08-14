package ex05_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase several items.";

        String[] items = {"shirt","Pant","boots","Cap"};
        
        System.out.println("Total available items " + items.length);
        System.out.println("Selected item is "+items[2]);
    }

}
