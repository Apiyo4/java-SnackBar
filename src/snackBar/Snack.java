package snackBar;
public class Snack{
    // fields
    private static int maxId=0;
    private int id;
    private String name;
    private int quantity;
    private int vendingMachineId;
    private double cost;
    // constructor
    public Snack(String name, int quantity, int vendingMachineId, double cost ){
        maxId++;
        id = maxId;
        this.name= name;
        this.quantity = quantity;
        this.vendingMachineId =vendingMachineId;
        this.cost = cost;
    }

    // getters and setters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public int getVendingMachineId(){
        return vendingMachineId;
    }
    public void setVendingMachineId(int vendingMachineId){
        this.vendingMachineId =  vendingMachineId;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost =  cost;
    }
    public void addQuantity(int items){
        this.quantity = this.quantity + items;
    }
    public void buySnack(int items){
        quantity -= items;
    }
    public double getTotalCost(int items){
        return items * cost;
    }
}