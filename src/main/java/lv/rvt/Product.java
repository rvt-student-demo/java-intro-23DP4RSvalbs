package lv.rvt;


public class Product {
    public String Name;
    public int Quantity;
    public double Price;



    public Product(String initialName, double initialPrice, int initialQuantity){    
        this.Name = initialName;
        this.Price = initialPrice;
        this.Quantity = initialQuantity;


    }
    public void printProduct(){
        System.out.println(Name + ", " + Price + ", "+ Quantity + " pieces");
    }
}
