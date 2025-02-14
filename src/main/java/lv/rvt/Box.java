package lv.rvt;

import java.util.ArrayList;

public class Box {
    private double maxCapacity;
    private ArrayList<Packable> items;
    private double currentWeight;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }

    public void add(Packable item) {
        double newWeight = this.currentWeight + item.weight();
        if (newWeight <= maxCapacity) {
            items.add(item);
            currentWeight = newWeight;  
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + currentWeight + " kg";
    }
}
