package baekjoon.setp10_재귀;

import java.lang.*;
import java.util.*;

public class b10872 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        long Number = 1;

        for (int i = 1; i < N; i++) {
            Number += Number * i;
        }

        System.out.println(Number);
    }
}
