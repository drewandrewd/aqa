package school.lesson4;

public class Animal {

    private String name;
    private static int animalCounter;

    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println("Все животные могут бежать");
    }

    public void swim(int distance) {
        System.out.println("Все животные могут плыть");
    }
}
