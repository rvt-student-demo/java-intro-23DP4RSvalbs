package lv.rvt;


public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

}


