package pizzaSize;

public class Circle {
    public String name;
    public double radius;

    public Circle() {}  // 기본생성자는 리턴이 없고 클래스의 이름과 같다.

    public Circle(String name, double radius) { // 생성자 오버로딩 가능 >> 같은 이름 메소드 생성 가능
        this.name = name;   // 객체 자신의 참조값을 리턴 >> 별도의 객체명 설정
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
