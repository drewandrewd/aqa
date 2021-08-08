package school.lesson4.ex7;

import java.util.ArrayList;

public class Park {

    private static ArrayList<Park.Amusement> list = new ArrayList<Amusement>();

    public static ArrayList<Amusement> getList() {
        return list;
    }

    public class Amusement {

        private String name;
        private String time;
        private int price;

        public Amusement(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
            list.add(this);
        }
    }

    public static void listOfAmusement() {
        for (int i = 0; i < list.size(); i++) {
            Park.Amusement curr = list.get(i);
            System.out.println(curr.name + ", время работы: " + curr.time + ", цена: " + curr.price);
        }
    }
}