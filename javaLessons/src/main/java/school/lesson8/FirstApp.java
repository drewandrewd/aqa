package school.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstApp {

    private ArrayList<String> list;

    public FirstApp(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public void removeCopies() {
        ArrayList<String> newList = new ArrayList<>();
        for (String curr : list) {
            for (String newCurr : list) {
                if (list.indexOf(curr) != list.indexOf(newCurr)) {
                    continue;
                } else if (!curr.equals(newCurr)) {
                    newList.add(newCurr);
                }
            }
        }
        for (String curr : newList) {
            System.out.println(curr);
        }
    }

    public static void main(String[] args) {
        FirstApp app = new FirstApp(new ArrayList<String>(Arrays.asList("apple", "berry", "orange", "banana", "pineapple", "berry", "watermelon", "apple", "lemon", "lemon", "orange")));
        app.removeCopies();

    }
}
