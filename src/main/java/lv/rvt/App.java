package lv.rvt;
import java.util.Scanner;
public class App 
{ 
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int n3 = 0;
        int n2 = 0;    


    while (true) {
        System.out.println("Give me a number:");
        int n1 = Integer.valueOf(scanner.nextLine());

        if (n1 != 0) {
            n3 = n3 + 1;
            n2 = n2+ n1;
        }
        if (n1 == 0) {
            System.out.println("Number of numbers:"+ n3);
            System.out.println("Sum of the numbers:"+ n2);
    
            break;
        }

        

    } 

    
        




    }
}


