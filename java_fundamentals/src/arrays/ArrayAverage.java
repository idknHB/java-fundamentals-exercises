package arrays;

public class ArrayAverage {
    public static void main(String[] args) {

        double[] grades = {7.5, 8.0, 6.5, 9.0};
        double total = 0;

        for (double grade : grades) {
            total += grade;
        }

        double average = total / grades.length;
        System.out.println("Average: " + average);
    }
}

