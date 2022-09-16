package IfElse_switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marksheet {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println("Enter the marks:");
        Scanner num = new Scanner(System.in);
        List<Integer> marks = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            marks.add(num.nextInt());
        }

        marks.forEach(m -> {
            if (m >= 44)
                count++;
        });
        if (count == 5) {
            System.out.println("congratulations you passed");
        } else if (count >= 4) {
            System.out.println("atkt");

        } else {
            System.out.println("fail");
        }
        num.close();

    }
}
