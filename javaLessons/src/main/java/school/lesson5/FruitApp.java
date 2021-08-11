package school.lesson5;

import java.util.ArrayList;

public class FruitApp {
    public static void main(String[] args) {
        Box<Apple> oneBox = new Box<>(new ArrayList<Apple>());
        for (int i = 0; i < 10; i++) {
            oneBox.getFruits().add(new Apple());
        }
        Apple newApple = new Apple();
        oneBox.addFruit(newApple);
        System.out.println("Вес первой коробки с яблоками: " + oneBox.getWeight());
        Box<Apple> twoBox = new Box<>(new ArrayList<Apple>());
        for (int i = 0; i < 10; i++) {
            twoBox.getFruits().add(new Apple());
        }
        System.out.println("Вес второй коробки с яблоками: " + twoBox.getWeight());
        System.out.print("Данные коробки ");
        if (twoBox.compare(oneBox)) {
            System.out.println("равны");
        } else {
            System.out.println("неравны");
        }
        oneBox.pourFruit(twoBox);
        System.out.println("Вес коробки после пересыпания: " + oneBox.getWeight());
        Box<Orange> threeBox = new Box<>(new ArrayList<Orange>());
        for (int i = 0; i < 10; i++) {
            threeBox.getFruits().add(new Orange());
        }
        System.out.println("Вес третьей коробки с апельсинами: " + threeBox.getWeight());
    }
}
