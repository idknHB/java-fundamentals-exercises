package arrays;

public class ArraySearch {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int search = 30;
        boolean found = false;

        for (int number : numbers) {
            if (number == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found.");
        }
    }
}

