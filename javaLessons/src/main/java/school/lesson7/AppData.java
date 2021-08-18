package school.lesson7;

import java.io.*;
import java.util.Scanner;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void outputData(File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        StringBuilder sbOne = new StringBuilder();
        for (int i = 0; i < getHeader().length; i++) {
            sbOne.append(getHeader()[i] + ";");
        }
        writer.write(sbOne.toString());
        StringBuilder sbTwo = new StringBuilder();
        for (int i = 0; i < getData().length; i++) {
            sbTwo.append('\n');
            for (int j = 0; j < getData()[i].length; j++) {
                sbTwo.append(getData()[i][j] + ";");
            }
        }
        writer.write(sbTwo.toString());
        writer.close();
    }

    public void inputData(File file) throws IOException {
        Scanner scanner = new Scanner(new FileReader(file));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    public void save(AppData data) {

    }
}
