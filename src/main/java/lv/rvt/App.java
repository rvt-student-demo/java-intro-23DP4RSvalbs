package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed:");

        int cipars1 = Integer.valueOf(scanner.nextLine());


        if (cipars1 > 120 ) {
            System.out.println("Speeding ticket!");
        }
    }    
}
