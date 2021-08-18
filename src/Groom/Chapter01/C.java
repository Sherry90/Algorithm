package Groom.Chapter01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class C {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 배열의 최대값을 계산하는 함수.
     *
     * @param data
     * @param n
     * @return data[0] ~ data[n-1]중 최대값.
     */
    public static int getMax(int[] data, int n) {
        int max = data[0];

        for (int i = 0; i < data.length; i++) {
            if(max < data[i]){
                max = data[i];
            }
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        int answer = getMax(data, n);

        System.out.println(answer);
    }

}