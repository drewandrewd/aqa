package school.lesson4.ex8;

public interface Calculation {

    public default double perimeter() {
        return 0;
    }

    public double area();
    public void info();
}
