package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        ArrayList<Televizors> channels = new ArrayList<>();

        while (true) {

            System.out.println("1 - Pievienot kanālu  2 - Parādīt Visus Kanālus  3 - Parādīt visdārgāko kanālu  4 - Iziet");
            int Izvele = scanner.nextInt();





            if (Izvele == 1) {
                
                System.out.print("Kanāla Numurs: ");
                int num = scanner.nextInt();

                System.out.print("Kanāla Vārds: ");
                String name = scanner.next();

                System.out.print("Kanāla Cena: ");
                double price = scanner.nextDouble();


                channels.add(new Televizors(num, name, price));
                System.out.println("Pievienots");
            } 
            



            
            else if (Izvele == 2) {
                
                for (int i = 0; i < channels.size(); i++) {
                    Televizors telev = channels.get(i);
                    telev.showInfo();
                }
            } 
            




            else if (Izvele == 3) {
                System.out.println("Dārgākais Kanāls - ");
                
            } 





            else if (Izvele == 4) {
                break;
            }
        }
    


}

}
