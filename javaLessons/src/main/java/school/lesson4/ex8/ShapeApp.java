package school.lesson4.ex8;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle = new Circle("Черный", "Красный", 10);
        Triangle triangle = new Triangle("Желтый", "Белый", 30, 30, 30);
        Rectangle rectangle = new Rectangle("Синий", "Оранжевый", 20, 40);
        circle.info();
        triangle.info();
        rectangle.info();
    }
}
