package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = capacity;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }


    public double howMuchSpaceLeft(){
        return this.capacity - this.balance;
    }
    
    public void addToWarehouse(double amount) {
        if (amount > 0) {
            balance = Math.min(balance + amount, capacity);
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount > 0) {
            double takenAmount = Math.min(amount, balance);
            balance -= takenAmount;
            return takenAmount;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + (capacity - balance);
    }
}


