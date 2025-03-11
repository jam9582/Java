abstract class Diagram {
    //도형 면적 계산법이 도형마다 다르므로, 각 도형이 직접 면적을 구하도록 해야함.
//따라서 추상 메소드로 정의해야 하고 추상 클래스로 만듦
    private String name;

    public Diagram(String name) {
        this.name = name;
    }

    public abstract double calculate(); //추상 메소드!

    public void info() {
        System.out.println("도형: " + name);
        System.out.println("면적: " + calculate() + "[m^2]");
    }
}

class Circle extends Diagram {

    private double r;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double calculate() {
        return Math.floor(Math.PI * r * r * 100) / 100;
        //Math.floor: 소숫점 셋째자리에서 절삭
        //100을 곱해서 소수점 자리 이동 한 후, 절삭, 다시 100을 나눠 원래 소수점으로 이동
    }
}

class Rectangle extends Diagram {

    private double x, y;

    public Rectangle(double x, double y) {
        super("Rectangle");
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculate() {
        return x * y;
    }
}

class Triangle extends Diagram {

    private double a, h;

    public Triangle(double a, double h) {
        super("Triangle");
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculate() {
        return a * h / 2;
    }
}

public class task2 {
    public static void main(String[] args) {
        Diagram[] solution = {
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 2),
        };

        for (Diagram diagram : solution) {
            diagram.info();
        }
    }
}