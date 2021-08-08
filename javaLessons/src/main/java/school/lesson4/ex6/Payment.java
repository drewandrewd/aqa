package school.lesson4.ex6;

import java.util.ArrayList;

public class Payment {

    private static int check;
    private static ArrayList<Payment.Products> list = new ArrayList<Products>();

    public static int getCheck() {
        return check;
    }

    public static ArrayList<Products> getList() {
        return list;
    }

    public class Products {

        private String name;
        private int price;

        public Products(String name, int price) {
            this.name = name;
            this.price = price;
            check += price;
            list.add(this);
        }
    }

    public static void listOfProducts() {
        for (int i = 0; i < list.size(); i++) {
            Payment.Products curr = list.get(i);
            System.out.println(curr.name + ": " + curr.price);
        }
        System.out.println("Итого: " + check);
    }
}
