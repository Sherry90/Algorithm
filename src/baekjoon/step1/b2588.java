package baekjoon.step1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

public class b2588 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] data = Stream.of(String.valueOf(B).split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println(data[2] * A);
        System.out.println(data[1] * A);
        System.out.println(data[0] * A);
        System.out.println(A*B);

    }
}
