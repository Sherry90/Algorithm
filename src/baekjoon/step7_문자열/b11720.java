package baekjoon.step7_문자열;

import java.lang.*;
import java.util.*;

public class b11720 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        String str = scanner.next();
        scanner.close();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += str.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}
