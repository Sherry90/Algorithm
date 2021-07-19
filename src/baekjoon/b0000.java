package baekjoon;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

public class b0000 {
    public static final Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    int number = A*B*C;

    int[] data = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();

}
