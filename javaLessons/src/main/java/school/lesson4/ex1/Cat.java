package school.lesson4.ex1;

public class Cat extends Animal {

    protected static int catCounter;

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(this.getName() + " пробежал " + distance + "м.");
        } else {
            System.out.println(this.getName() + " устал.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.getName() + " не умеет плавать.");
    }
}
