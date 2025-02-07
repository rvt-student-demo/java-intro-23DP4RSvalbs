package lv.rvt;

public class ProductWarehouse extends Warehouse {
    private String productName;
    private ChangeHistory changeHistory;  


    public ProductWarehouse(String productName, double capacity) {
        super(capacity);  
        this.productName = productName;
        this.changeHistory = new ChangeHistory();  
        changeHistory.add(super.getBalance());  
    }


    public String getName() {
        return productName;
    }

   
    @Override
    public String toString() {
        return productName + ": " + super.toString();  
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);  
        changeHistory.add(super.getBalance());  
    }


    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);  
        changeHistory.add(super.getBalance());  
        return takenAmount;
    }


    public ChangeHistory getChangeHistory() {
        return changeHistory;
    }

    public static void main(String[] args) {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); 
        System.out.println(juice);  
        System.out.println("Change History: " + juice.getChangeHistory());  
        juice.addToWarehouse(1.0);
        System.out.println(juice); 
        System.out.println("Updated Change History: " + juice.getChangeHistory()); 
    }
}




   