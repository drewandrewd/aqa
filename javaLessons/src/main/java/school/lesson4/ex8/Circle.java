package school.lesson4.ex8;

public class Circle extends Shape implements Calculation {

    private double radius;

    public Circle(String colorBackground, String colorBorder, double radius) {
        super(colorBackground, colorBorder);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void info() {
        System.out.println("Периметр: " + this.perimeter() + ", площадь: " + this.area() + ", цвет фона: " + this.getColorBackground() + ", цвет границы: " + this.getColorBorder());
    }
}
