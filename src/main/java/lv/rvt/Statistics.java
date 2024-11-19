package lv.rvt;

import java.util.Scanner;

public class Statistics {
    Scanner scanner = new Scanner(System.in);

    private int sum;

    public Statistics() {

        this.sum = 0;
    }
    
    public void addNumber(int number) {
        

        this.sum += number;
    }

    public int sum() {
        return this.sum;
    }

}       





