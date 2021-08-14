package school.lesson6;

public class MainApp {
    public static void main(String[] args) {
        try {
            String[][] array = {{"44", "77", "0", "3"}, {"5", "4", "6", "7"}, {"4", "4", "3", "5"}, {"33", "1", "4", "9"}};
            System.out.println(Main.sumElements(array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[][] array = {{"44", "77", "0"}, {"5", "4", "6", "7"}};
            System.out.println(Main.sumElements(array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[][] array = {{"44", "77", "0", "H"}, {"5", "4", "6", "7"}, {"4", "4", "3", "5"}, {"33", "1", "4", "9"}};
            System.out.println(Main.sumElements(array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
