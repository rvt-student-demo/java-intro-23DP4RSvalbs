package lv.rvt;
import java.util.*;
public class App {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int meginajums = 3;
        Random rand = new Random(10);
        int val = rand.nextInt((10)+1);




        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess: ");

        while ( true )
        {
            int cipars = Integer.valueOf(scanner.nextLine());
            if (cipars == val) {
                System.out.println("RIGHT!");
                System.out.println("You have won the game.");
                break;
            }
                else { 
                    System.out.println("wrong");
                    meginajums -= 1;

                    if (meginajums == 3) {
                        System.out.println("The correct number was "+val+".");
                        System.out.println("You have lost the game.");
                        break;
                    }
                        continue;
                }
                    
            
        
            
        }
      } 
    }
        




        
           
    
        
        




            
            

        
        


    

        



    
        


