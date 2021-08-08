package school.lesson4.ex7;

public class ParkApp {
    public static void main(String[] args) {
        Park.Amusement wheel = new Park().new Amusement("Колесо обозрения", "c 10 до 19", 500);
        Park.Amusement roller = new Park().new Amusement("Американские горки", "c 12 до 19", 800);
        Park.Amusement horse = new Park().new Amusement("Лошадки", "c 10 до 19", 200);
        Park.listOfAmusement();
    }
}
