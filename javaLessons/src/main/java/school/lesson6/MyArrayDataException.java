package school.lesson6;

public class MyArrayDataException  extends Exception{

    private String line;

    public MyArrayDataException(String message, String line) {
        super(message);
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
