package school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class SecondApp {

    private Map<String, String> book;

    public SecondApp(Map<String, String> book) {
        this.book = book;
    }

    public Map<String, String> getBook() {
        return book;
    }

    public void setBook(Map<String, String> book) {
        this.book = book;
    }

    public void add(String phone, String name) {
            book.put(phone, name);
    }

    public void get(String name) {
        for (Map.Entry<String, String> curr : getBook().entrySet()) {
            if (curr.getValue().equals(name)) {
                System.out.println(curr.getValue() + ": " + curr.getKey());
            }
        }
    }

    public static void main(String[] args) {
        SecondApp app = new SecondApp(new HashMap<>());
        app.add("89221295787", "Andrew");
        app.add("899999999999", "Drew");
        app.add("892299999994", "Crew");
        app.add("89022515115", "Rew");
        app.add("89221295777", "Ew");
        app.add("89222222222", "Andrew");
        app.add("89222222228", "Andrew");
        app.get("Andrew");
    }
}
