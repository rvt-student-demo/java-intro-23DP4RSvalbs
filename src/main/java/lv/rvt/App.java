package lv.rvt;
import java.util.*;

import lv.DecreasingCounter;
public class App {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
        
    }

}




    
        


