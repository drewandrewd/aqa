package school.lesson4.ex8;

public class Rectangle extends Shape implements Calculation {

    private double width;
    private double length;

    public Rectangle(String colorBackground, String colorBorder, double width, double length) {
        super(colorBackground, colorBorder);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return width * 2 + length * 2;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public void info() {
        System.out.println("Периметр: " + this.perimeter() + ", площадь: " + this.area() + ", цвет фона: " + this.getColorBackground() + ", цвет границы: " + this.getColorBorder());
    }
}
