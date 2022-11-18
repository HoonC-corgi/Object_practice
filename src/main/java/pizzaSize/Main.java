package pizzaSize;

public class Main {
    public static void printCircle(Circle c) {
        System.out.println(c.name + c.getArea());
    }

    public static void main(String[] args) {
        Circle pizza = new Circle("피자", 30);

        Circle pie = new Circle();
        pie.name = "애플파이";
        pie.radius = 5;
        printCircle(pie);   // pie의 값이 아닌 객체 'pie'의 참조값이 넘어감

        System.out.println(pizza.name + pizza.getArea());
        System.out.println(pie.name + pie.getArea());

        Rectangle r = new Rectangle();
        r.width = 10;
        r.height = 20;
        r.name = "상자";
        System.out.println(r.name + r.getArea());
    }
}
