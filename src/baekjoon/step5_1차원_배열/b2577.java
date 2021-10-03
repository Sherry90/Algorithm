package baekjoon.step5_1차원_배열;

import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

public class b2577 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int number = A*B*C;

        int[] data = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        int[] countArray = new int[10];

        for(int i = 0 ; i < 10 ; i ++){
            countArray[i] = 0;
        }

        for(int i = 0 ; i < 10 ; i ++){
            for(int j = 0 ; j < data.length ; j ++){
                if(i == data[j]){
                    countArray[i] += 1;
                }
            }
        }

        for(int i = 0 ; i < 10 ; i ++){
            System.out.println(countArray[i]);
        }
    }
}