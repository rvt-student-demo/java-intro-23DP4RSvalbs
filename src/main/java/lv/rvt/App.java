package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first number");

        int cipars1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Write the second number");
        int cipars2 = Integer.valueOf(scanner.nextLine());

    



        
        int sask = cipars1+cipars2;
        int atn = cipars1-cipars2;
        int reiz = cipars1*cipars2;
        int dal = cipars1/cipars2;

        System.out.println(cipars1+"+"+cipars2+"="+sask);
        System.out.println(cipars1+"+"+cipars2+"="+atn);
        System.out.println(cipars1+"+"+cipars2+"="+reiz);
        System.out.println(cipars1+"+"+cipars2+"="+dal);
    }
}
