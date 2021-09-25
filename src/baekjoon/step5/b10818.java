package baekjoon.step5;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b10818 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();

        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = scanner.nextInt();
        }

        int Min = data[0];
        int Max = 0;

        for (int i = 0; i < N; i++) {
            if(data[i] < Min){
                Min = data[i];
            }
            if(data[i] > Max){
                Max = data[i];
            }
        }
        System.out.println(Min+" "+Max);

    }
}
