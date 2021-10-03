package baekjoon.step3_for문;

import java.lang.*;
import java.util.*;


public class b2739 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(N+" * "+i+" = "+N*i);
        }
    }
}
