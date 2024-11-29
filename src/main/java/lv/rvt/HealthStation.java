package lv.rvt;

public class HealthStation {
    private int weighingCount; 

    public HealthStation() {
        this.weighingCount = 0; 
    }

    public int weigh(Person person) {
        this.weighingCount++; 
        return person.getWeight(); 
    }

    public int weighings() {
        return this.weighingCount; 
    }
}


