package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2798 {
    public static final Scanner scanner = new Scanner(System.in);

    static int search(int[] arr, int N, int M) {
        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if (M == temp) {
                        return temp;
                    }
                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
// 모든 순회를 마치면 result 리턴
        return result;
    }


    public static void main(String[] args) {
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] data = new int[N];

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }

        int result = search(data, N, M);
        System.out.println(result);


    }
}
