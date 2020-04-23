package snackBar;

public class Main{
    public static void main(String[] args){
        Customer customer1 =  new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);
        VendingMachine vendingMachine1 =  new VendingMachine("Food");
        VendingMachine vendingMachine2 = new VendingMachine("Drink");
        VendingMachine vendingMachine3 = new VendingMachine("Office");
        Snack snack1 = new Snack("Chips", 36, 1, 1.75);
        Snack snack2 = new Snack("Chocolate Bar", 36, 1, 1.00);
        Snack snack3 = new Snack("Pretzel", 30,1, 2.00);
        Snack snack4 = new Snack("Soda",24, 2, 2.50);
        Snack snack5 = new Snack("Water", 20, 2, 2.75);

        System.out.println(customer1.getCashOnHand() - snack4.getTotalCost(3));  
        snack4.buySnack(3);
        customer1.buySnacks(snack4.getTotalCost(3));
        System.out.println(snack4.getQuantity());;   
        System.out.println(customer1.getCashOnHand() - snack3.getTotalCost(1));
        snack3.buySnack(1);
        System.out.println(snack3.getQuantity());
        ;  
        customer1.buySnacks(snack3.getTotalCost(1));   
        System.out.println(customer2.getCashOnHand() - snack4.getTotalCost(2));
        snack4.buySnack(2);
        System.out.println(snack4.getQuantity());
        ;
        customer2.buySnacks(snack4.getTotalCost(2));
        customer1.addCashOnHand(10);
        System.out.println(customer1.getCashOnHand());
        System.out.println(customer1.getCashOnHand() - snack2.getTotalCost(1));
        snack2.buySnack(1);
        System.out.println(snack2.getQuantity());
        ;
        customer1.buySnacks(snack2.getTotalCost(1));
        snack3.addQuantity(12);
        System.out.println(snack3.getQuantity());
        System.out.println(customer2.getCashOnHand() - snack3.getTotalCost(3));
        snack3.buySnack(3);
        System.out.println(snack3.getQuantity());
        ;
        customer2.buySnacks(snack3.getTotalCost(3));
    }
}