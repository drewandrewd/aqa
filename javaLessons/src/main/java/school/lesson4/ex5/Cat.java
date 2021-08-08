package school.lesson4.ex5;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        int currentFood = p.getFood();
        p.decreaseFood(appetite);
        if (currentFood != p.getFood()) {
            satiety = true;
        }
    }

    public void satietyInfo() {
        if(satiety) {
            System.out.println(name + " сытый");
        } else {
            System.out.println(name + " голодный");
        }
    }
}
