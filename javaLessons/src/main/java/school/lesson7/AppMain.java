package school.lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppMain {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("./file.csv");
            AppData data = new AppData(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123}, {300, 400, 500}});
            data.outputData(file);
            data.inputData(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
