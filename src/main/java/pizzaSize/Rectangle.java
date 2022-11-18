package pizzaSize;

public class Rectangle {
    public String name;
    public double width;
    public double height;

    public Rectangle() {}

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
