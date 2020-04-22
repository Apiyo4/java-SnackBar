package snackBar;

public class Main{
    public static void main(String[] args){
        System.out.println("Trial");
        Snack mango = new Snack("mango", 1, 10, 1 );
        System.out.println(mango.getQuantity());
        mango.addQuantity(4);
        System.out.println(mango.getQuantity());
        mango.buySnack(2);
        System.out.println(mango.getQuantity());
        System.out.println(mango.getTotalCost(4));
    }
}