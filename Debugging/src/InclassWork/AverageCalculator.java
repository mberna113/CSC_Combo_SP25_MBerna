package InclassWork;


public class AverageCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }

}
