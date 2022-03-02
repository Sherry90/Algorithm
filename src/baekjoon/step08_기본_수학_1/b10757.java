package baekjoon.step08_기본_수학_1;

import java.math.BigInteger;
import java.util.Scanner;

public class b10757 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger b1 = new BigInteger(scanner.next());
        BigInteger b2 = new BigInteger(scanner.next());

        System.out.println(b1.add(b2));
    }
}
