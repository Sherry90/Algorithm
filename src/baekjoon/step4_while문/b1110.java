package baekjoon.step4_while문;

import java.lang.*;
import java.util.*;

public class b1110 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.close();
        int cycles = 0;

        int value = 0; // 몫
        int remainder = 0; // 나머지

        int number= N; // 새로운 수

        while (true) {
            value = number / 10;
            remainder = number % 10;

            number = remainder*10 + (value+remainder)%10;
            cycles++;

            if(N == number){
                System.out.println(cycles);
                break;
            }

        }

    }
}
