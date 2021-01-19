 /* This pet supply shop only sells one item: pet food bags.
       It tracks the number of pet food bags there are in the shop.
       As well as the current amount of money.
       I created a method to represent a customer coming into the shop to buy a pet food bag.
       The money made from the sale has to be tracked, and the pet food bags have to be reduced accordingly.
       The main method was used to simulate this program running */

public class Petshop {

    static void totalPetFoodBag(int petFoodBags) {
        System.out.println("The number of pet food bags " + (petFoodBags));
    }

    static void getcurrentMoney(int currentMoney) {
        System.out.println("Current amount of money " + currentMoney);
    }

    static void simulateCustomerPurchase(int customerPurchaseQuantity, int moneyCustomerGave) {
        int earnedFromCustomer = customerPurchaseQuantity * moneyCustomerGave;
        System.out.println("Amount of money customer gave after purchase " + earnedFromCustomer);
    }

    public static void main(String[] args) {
        int petFoodBags = 10;
        int startingMoney = 25;
        int customerPurchaseQuantity = 1;
        int moneyCustomerGave = 3;
        totalPetFoodBag(petFoodBags - customerPurchaseQuantity);
        simulateCustomerPurchase(customerPurchaseQuantity, moneyCustomerGave);
        getcurrentMoney(startingMoney + moneyCustomerGave);
    }
}
