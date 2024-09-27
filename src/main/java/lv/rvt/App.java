package lv.rvt;
import java.util.Scanner;
public class App 
{ 
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give point [0-100]:");

        int cipars1 = Integer.valueOf(scanner.nextLine());


        if (cipars1 <= 0 ) {
            System.out.println("impossible!");
        }  else if (cipars1 >= 0 && cipars1 <= 49) {
            System.out.println("failed");
        }  else if (cipars1 >= 50 && cipars1 <= 59) {
            System.out.println("1");
        }  else if (cipars1 >= 60 && cipars1 <= 69) {
            System.out.println("2");
        }  else if (cipars1 >= 70 && cipars1 <= 79) {
            System.out.println("3");
        }  else if (cipars1 >= 80 && cipars1 <= 89) {
            System.out.println("4");
        }  else if (cipars1 >= 90 && cipars1 <= 100) {
            System.out.println("5");
        }  else {
                System.out.println("Incredible");
            }
        }
}    

