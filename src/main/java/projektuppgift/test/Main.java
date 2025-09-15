package main.java.projektuppgift.test;

public class Main {

    public static void main(String[] args) {
        String[] words = {"Hello", "World", "!"};
        printArray(words);

        int[] numbers = {3, 7, 2, 9, 5};
        int maxNumber = findMax(numbers);
        System.out.println("Det största talet i arrayen är: " + maxNumber);

        double bigger = findBigger(4.5, 6.7);
        System.out.println("Det största double-talet är: " + bigger);

        printFullName("Ana", "Stevanovic");
    }

    public static void printArray(String[] array) {
        for (String item : array) {
            System.out.println(item);
        }
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static double findBigger(double a, double b) {
        return a > b ? a : b;
    }

    public static void printFullName(String firstName, String lastName) {
        System.out.println("Fullständigt namn: " + firstName + " " + lastName);
    }
}
