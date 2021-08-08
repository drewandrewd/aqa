package school.lesson4.ex1;

public class Dog extends Animal {

    private static int dogCounter;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    public static int getDogCounter() {
        return dogCounter;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(this.getName() + " пробежал " + distance + "м.");
        } else {
            System.out.println(this.getName() + " устал.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(this.getName() + " проплыл " + distance + ".");
        } else {
            System.out.println(this.getName() + " устал.");
        }
    }
}
