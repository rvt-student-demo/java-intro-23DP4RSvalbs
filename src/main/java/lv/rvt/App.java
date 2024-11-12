package lv.rvt;
import java.util.*;

import lv.DecreasingCounter;
public class App {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
        
    }

}




    
        


