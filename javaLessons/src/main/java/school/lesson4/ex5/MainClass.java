package school.lesson4.ex5;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Барсик", 5), new Cat("Джек", 15), new Cat("Бигбой", 25)};
        Plate plate = new Plate(40);
        for(Cat cat : cats) {
            cat.eat(plate);
            cat.satietyInfo();
        }
        plate.info();
        plate.addFood(50);
        plate.info();
    }
}
