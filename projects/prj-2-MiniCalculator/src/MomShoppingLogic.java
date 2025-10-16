//Mom calls and says:
//If you’re near the store and have cash, buy milk.
//If you’re near the store, have no cash, but have a credit card, buy milk and sugar.
//If you’re near the store, and have both cash and credit card, buy milk, sugar, and tomatoes.
//Otherwise, don’t buy anything.


public class MomShoppingLogic {

    public static void main(String[] args) {

        boolean nearStore = true;
        boolean hasCash = false;
        boolean hasCreditCard = true;

        System.out.println("Mom’s Instructions:");

        if (nearStore && hasCash && hasCreditCard) {
            System.out.println("Buy milk, sugar, and tomatoes.");
        } else if (nearStore && !hasCash && hasCreditCard) {
            System.out.println("Buy milk and sugar.");
        } else if (nearStore && hasCash) {
            System.out.println("Buy milk.");
        } else {
            System.out.println("Don’t buy anything.");
        }

        System.out.println("\n--- Condition Summary ---");
        System.out.println("Near store? " + nearStore);
        System.out.println("Has cash? " + hasCash);
        System.out.println("Has credit card? " + hasCreditCard);
    }
}
