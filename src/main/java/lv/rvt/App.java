package lv.rvt;
import java.util.Scanner;
public class App 
{ 
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");

        int cipars1 = Integer.valueOf(scanner.nextLine());


        if (cipars1 <18 ) {
            System.out.println("You are not an adult");
        }  else if (cipars1 >18) {
            System.out.println("You are an adult");
        }  else {
                System.out.println("You are a adult");
            }
        }
}    

