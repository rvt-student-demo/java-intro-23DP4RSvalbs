package lv.rvt;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();

     
        while (true) {
            System.out.print("Enter name and birth year (name,year) or press enter to finish: ");
            String input = scanner.nextLine();
            
         
            if (input.isEmpty()) {
                break;
            }
            
      
            String[] parts = input.split(",");
            String name = parts[0];
            int year = Integer.parseInt(parts[1]);

            names.add(name);
            birthYears.add(year);
        }

       
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

     
        int sumOfYears = 0;
        for (int year : birthYears) {
            sumOfYears += year;
        }
        double averageBirthYear = (double) sumOfYears / birthYears.size();

       
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}






    
        


