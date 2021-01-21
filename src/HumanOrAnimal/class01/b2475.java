package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2475 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            cnt += Math.pow(scanner.nextInt(),2);
        }
        System.out.println(cnt % 10);
    }
}
