package school.lesson5;

public class First<T> { // Задание 1

    private T[] nums;

    public First(T[] nums) {
        this.nums = nums;
    }

    public T[] getNums() {
        return nums;
    }

    public void setNums(T[] nums) {
        this.nums = nums;
    }

    public void changeArr(int firstIndex, int secondIndex) {
        T one = getNums()[firstIndex];
        T two = getNums()[secondIndex];
        getNums()[firstIndex] = two;
        getNums()[secondIndex] = one;
    }

    public static void main(String[] args) {
        First<Integer> nums = new First<>(new Integer[] {5, 20, 30, 40});
        nums.changeArr(0, 3);
        for (int i = 0; i < nums.getNums().length; i++) {
            System.out.print(nums.getNums()[i] + " ");
        }
    }
}