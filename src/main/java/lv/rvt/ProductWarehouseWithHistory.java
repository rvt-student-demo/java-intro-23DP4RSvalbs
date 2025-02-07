package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;


    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity); 
        changeHistory = new ChangeHistory();  
        addToWarehouse(initialBalance); 
        changeHistory.add(getBalance()); 
    }



    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);  
        changeHistory.add(getBalance());  
    }

   
    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);  
        changeHistory.add(getBalance());  
        return takenAmount;  
    }


    public String history() {
        return changeHistory.toString();  
    }


    public void printAnalysis() {
        System.out.println("Product: " + getName());  
        System.out.println("History: " + history());  
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }



    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); 
        
        juice.addToWarehouse(1.0);
        System.out.println(juice);  
        System.out.println(juice.history());
        juice.printAnalysis();
    }
}


