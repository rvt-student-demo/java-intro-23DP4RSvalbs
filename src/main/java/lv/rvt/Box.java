package lv.rvt;

public class Box {

    private double width;
    private double height;
    private double length;


    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box(double side) {
        this(side, side, side);
    }

    public Box(Box oldBox) {
        this(oldBox.width, oldBox.height, oldBox.length);
    }


    public double volume() {
        return width * height * length;
    }


    public double area() {
        return 2 * (width * height + height * length + length * width);
    }


    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }


    private double sideArea() {
        return height * length;
    }

    public double width() {
        return width;
    }


    public double height() {
        return height;
    }


    public double length() {
        return length;
    }
}




