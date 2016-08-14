package exam1;

import java.time.LocalDate;
import java.time.Month;

public class Q6 {
    String name;

    public Q6(String name1) {
        name = name1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int i : nums) {
            System.out.println(i);
        }

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30).plusMonths(-1).plusYears(20);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

    }
}
