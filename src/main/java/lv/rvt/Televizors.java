package lv.rvt;

public class Televizors {
    public double price;
    public int TV_channel_number;
    public String name;
    
    public Televizors(int TV_channel_number, String name, double price) {
        this.price = price;
        this.TV_channel_number = TV_channel_number;
        this.name = name;
    }

    
    public void showInfo(){
        System.out.println("Kanāls "+TV_channel_number+" - "+name+", cena: " + price);
    }

    

    
}

