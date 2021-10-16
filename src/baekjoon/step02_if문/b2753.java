package baekjoon.step02_if문;

import java.lang.*;
import java.util.*;

public class b2753 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(1);
        } else if(year % 4 == 0 && year % 400 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
