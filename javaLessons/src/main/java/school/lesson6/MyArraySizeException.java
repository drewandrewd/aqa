package school.lesson6;

public class MyArraySizeException extends Exception {

    private String[][] array;

    public MyArraySizeException(String message, String[][] array) {
        super(message);
        this.array = array;
    }

    public String[][] getArray() {
        return array;
    }

    public void setArray(String[][] array) {
        this.array = array;
    }
}
