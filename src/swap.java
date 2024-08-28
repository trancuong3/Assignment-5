import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong");
        int number = sc.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {

            numbers[i] = sc.nextInt();

        }

        for (int i = 0; i < numbers.length/2; i++) {


            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1-i];
            numbers[numbers.length - 1-i] =temp;
        }
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
