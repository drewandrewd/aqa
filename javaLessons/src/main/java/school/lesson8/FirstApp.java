package school.lesson8;

import java.util.*;

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
        Set<String> newList = new HashSet<String>(getList());
        for (String curr : newList) {
            System.out.println(curr);
        }
    }

    public void countSameWords() {
        Map<String, Integer> newMap = new HashMap<>();
        for (String curr : getList()) {
            int count = newMap.getOrDefault(curr, 0);
            newMap.put(curr, count + 1);
        }
        for (Map.Entry<String, Integer> pair : newMap.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }

    public static void main(String[] args) {
        FirstApp app = new FirstApp(new ArrayList<String>(Arrays.asList("apple", "berry", "orange", "banana", "pineapple", "berry", "watermelon", "apple", "lemon", "lemon", "orange")));
        app.removeCopies();
        System.out.println();
        app.countSameWords();
    }
}
