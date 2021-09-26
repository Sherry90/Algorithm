package baekjoon.step5;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b4344 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++)
        {
            int n = scanner.nextInt();
            int data[] = new int[n];

            for (int j = 0; j < n; j++) {
                data[j] = scanner.nextInt();
            }

            int sum = 0;
            double avr = 0;
            double per = 0;

            for (int j = 0; j < n; j++) {
                sum += data[j];
            }
            avr = sum / n;

            for (int j = 0; j < n; j++) {
                if(data[j] > avr){
                    per++;
                }
            }

            per = per / n * 100;


            System.out.println(String.format("%.3f", per)+"%");


        }
    }
}
