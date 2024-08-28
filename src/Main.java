import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many days temperature");
        int days = sc.nextInt();
        int sum = 0;
        int temp;
        int count = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("enter temps of days" + " " + (i + 1));
            temp = sc.nextInt();
            sum += temp;
            list.add(temp);

        }
        double average = (double) sum / days;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > average) {
                count++;
            }
        }
        System.out.println("average temp = " + String.format("%.1f", average));
        System.out.println();
        System.out.println(count + " " + "days above average");
        System.out.println("Temperatures:" + list);
        sort(list);
        System.out.println("Two coldest days:" + list.get(0) + " " + list.get(1));
        System.out.println("Two hottest days:" + list.get(list.size() - 1) + " " + list.get(list.size() - 2));

    }
}