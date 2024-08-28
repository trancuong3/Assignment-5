public class average {
    public static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double avg = average(numbers);
        System.out.println("Average: " + avg);
    }
}
