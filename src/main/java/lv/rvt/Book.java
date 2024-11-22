package lv.rvt;



public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String name, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getname(){
        return this.title;
        
    }
    public int getpages(){
        return this.pages;
        
    }
    public int getyear(){
        return this.year;
        
    }

    @Override
    public String toString(){
        return this.title +", "+ this.pages +"pages, "+ this.year;
    }

}
