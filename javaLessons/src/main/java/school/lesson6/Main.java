package school.lesson6;

public class Main {

    public static int sumElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length !=4  || array[1].length !=4 || array[2].length !=4 || array[3].length !=4) {
            throw new MyArraySizeException("Массив другого размера.", array);
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i][j].matches("\\d+")) {
                    throw new MyArrayDataException("Неверные данные в ячейке: " + "[" + i + "]" + "[" + j + "]", array[i][j]);
                }
                int curr = Integer.parseInt(array[i][j]);
                result += curr;
            }
        }
        return result;
    }
}