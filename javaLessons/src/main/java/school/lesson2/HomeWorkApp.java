package school.lesson2;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //6
        for (int i = 0; i < arrOne.length; i++) {
            int curr = arrOne[i];
            if (curr == 0) {
                curr = 1;
            } else if (curr == 1) {
                curr = 0;
            }
        }

        int[] arrTwo = new int[100]; //7
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i + 1;
        }

        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //8
        for (int i = 0; i < arrThree.length; i++) {
            int curr = arrThree[i];
            if (curr < 6) {
                curr *= 2;
            }
        }

        int[][] arrFour = new int[9][9]; //9
        for (int i = 0; i < arrFour.length; i++) {
            for (int j = 0; j < arrFour[i].length; j++) {
                if (i == j || j == arrFour.length - 1 - i) {
                    arrFour[i][j] = 1;
                }
            }
        }

        int[] arrFive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //10*
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrFive.length; i++) {
            int curr = arrFive[i];
            if (curr > max)
                max = curr;
            if (curr < min)
                min = curr;
        }
    }

    public static boolean sumNum(int a, int b) { //1
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveNum(int a) { //2
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean negativeNum(int a) { //3
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printLine(String line, int a) { //4
        for (int i = 0; i < a; i++) {
            System.out.println(line);
        }
    }

    public static boolean leapYear(int year) { //4*
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] Array(int len, int initialValue) { //10
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static boolean checkBalance(int[] arr) { //10** По условию понял, что сравниваем именно суммы, т.е {10, 5, 5} будет false
        int[] sumLeft = new int[arr.length - 1];
        int[] sumRight = new int[arr.length - 1];
        int left = arr[0];
        int right = arr[arr.length - 1];
        boolean result = false;
        for (int i = 1; i < arr.length; i++) {
            left += arr[i];
            sumLeft[i - 1] = left;
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            right += arr[i];
            sumRight[i] = right;
        }
        for (int i = 0; i < sumLeft.length - 2; i++) {
            int currLeft = sumLeft[i];
            int currRight = sumRight[i + 2];
            if (currLeft == currRight) {
                result = true;
            }
        }
        return result;
    }

    public static void moveArr(int[] arr, int n) { //***
        int length = arr.length;
        if (n != 0) {
            if (n > length) {
                n = n % length;
            }
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    int memory = arr[0];
                    arr[0] = arr[length - 1];
                    for (int j = 1; j < length - 1; j++) {
                        arr[length - j] = arr[length - j - 1];
                    }
                    arr[1] = memory;
                }
            } else if (n < 0) {
                for (int i = 0; i > n ; i--) {
                    int memory = arr[length - 1];
                    arr[length - 1] = arr[0];
                    for (int j = 1; j < length; j++) {
                        arr[j - 1] = arr[j];
                    }
                    arr[length - 2] = memory;
                }
            }
        }
    }
}
