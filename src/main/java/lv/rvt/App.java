package lv.rvt;
import java.util.Scanner;
public class App {
    public static void main( String[] args ){




        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a numbers:");
        int ns = -1;
        int sum = 1;
        int avg = 0;
        int p = 0;
        int n = 0;

        while (true){


            int num = scanner.nextInt();
            sum = sum + num;
            ns++;
            


            if (ns != 0){
                avg = sum/ns;
            


            }
            
            if (num == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum:"+sum);
                System.out.println("Numbers:"+ns++);
                System.out.println("Average:"+avg);
                System.out.println("Even:"+p);
                System.out.println("Odd:"+n);

                
                break;
            
            }

            if (num % 2 ==0){
                p = p +1;
            } else {
                n = n + 1;
                }
            
            
        
        
                
            
            
        }



    }






}

    
    

            
               




        
        
 
        

            
            

        
        


    

        



    
        


