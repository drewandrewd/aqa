package school.lesson4.ex8;

public class Triangle extends Shape implements Calculation {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String colorBackground, String colorBorder, double sideA, double sideB, double sideC) {
        super(colorBackground, colorBorder);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

    @Override
    public void info() {
        System.out.println("Периметр: " + this.perimeter() + ", площадь: " + this.area() + ", цвет фона: " + this.getColorBackground() + ", цвет границы: " + this.getColorBorder());
    }
}
