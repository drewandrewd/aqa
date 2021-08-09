package school.lesson4.ex8;

public class Shape {

    private String colorBackground;
    private String colorBorder;

    public Shape(String colorBackground, String colorBorder) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }

    public String getColorBackground() {
        return colorBackground;
    }

    public void setColorBackground(String colorBackground) {
        this.colorBackground = colorBackground;
    }

    public String getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(String colorBorder) {
        this.colorBorder = colorBorder;
    }
}
