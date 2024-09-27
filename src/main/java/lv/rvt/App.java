package lv.rvt;
import java.util.Scanner;
public class App 
{ 
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first number:");

        int cipars1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me the second number:");
        int cipars2 = Integer.valueOf(scanner.nextLine());


        if (cipars1 > cipars2 ) {
            System.out.println("Greater number is:"+cipars1);
        }  else if (cipars1 < cipars2) {
            System.out.println("Greater number is:"+cipars2);
        }  else {
                System.out.println("The number are equal!");
            }
        }
}    

