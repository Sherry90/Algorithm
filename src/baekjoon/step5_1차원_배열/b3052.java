package baekjoon.step5_1차원_배열;

import java.lang.*;
import java.util.*;

public class b3052 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int data[] = new int[10];

        int calculated[] = new int[10];

        int count = 1;

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }

        for (int i = 0; i < data.length; i++) {
            calculated[i] = data[i] % 42;
        }
        Arrays.sort(calculated);

        for (int i = 1; i < data.length; i++) {
            if(calculated[i-1] != calculated[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
