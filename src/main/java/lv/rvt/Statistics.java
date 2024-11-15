package lv.rvt;

import java.util.Scanner;

public class Statistics {
    Scanner scanner = new Scanner(System.in);
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        
        this.count++;
        this.sum += number;
    }

    public int sum() {
        return this.sum;
    }

}       





