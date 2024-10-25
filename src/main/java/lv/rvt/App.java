package lv.rvt;

public class App {

    public static void main(String[] args){
        printSpaces(3);
        printStars(1);
        printSpaces(2);
        printStars(2);
        printSpaces(1);
        printStars(3);
        printStars(4);
        System.out.println();


    }
    
    public static void christmasTree(int height){
            for (int i=0; i<height;i++){
                
            }
                
    }



    public static void printSpaces(int number){
        for(int i =0;i < number;i++){
            System.out.print(" ");

        }
    }


    public static void printStars(int number) {

        for (int i=0;i<number;i++) {
            System.out.print("*");
        }
        System.out.println();
    }












    public static void printTriangle(int size){
        for (int i=1;i<=size;i++){
            printStars(i);
        }
    }







        public static void printSquare(int size) {
            for (int i =0; i <size;i++){
                printStars(size);
            }

        }




        









    
}  
    

            
               




        
        
 
        

            
            

        
        


    

        



    
        


