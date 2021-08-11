package school.lesson5;

import java.util.ArrayList;

public class  Box<T> {

    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setBox(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        if (getFruits().size() == 0) {
            return 0;
        } else if (getFruits().get(0) instanceof Apple) {
            return getFruits().size() * Apple.getWeight();
        } else {
            return getFruits().size() * Orange.getWeight();
        }
    }

    public boolean compare(Box<?> newBox) {
        return newBox.getWeight() == this.getWeight();
    }

    public void pourFruit(Box<T> newBox) {
        if (newBox.getFruits().get(0) instanceof Apple && this.getFruits().get(0) instanceof Apple) {
            for(T apple : newBox.getFruits()) {
                this.getFruits().add(apple);
            }
        } else if (newBox.getFruits().get(0) instanceof Orange && this.getFruits().get(0) instanceof Orange) {
            for(T apple : newBox.getFruits()) {
                this.getFruits().add(apple);
            }
        }
    }

    public void addFruit(T fruit) {
        if (fruit instanceof Apple  && getFruits().get(0) instanceof Apple) {
            getFruits().add(fruit);
        } else if (fruit instanceof Orange  && getFruits().get(0) instanceof Orange) {
            getFruits().add(fruit);
        }
    }


}
