package school.lesson4.ex1;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Джек");
        cat.run(333);
        dog.run(300);
        cat.swim(30);
        dog.swim(10);
        System.out.println(Animal.getAnimalCounter());
        System.out.println(Cat.getCatCounter());
        System.out.println(Dog.getDogCounter());
    }
}
