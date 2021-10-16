package baekjoon.step05_1차원_배열;

import java.lang.*;
import java.util.*;

public class b1546 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        double avr = 0;
        double sum = 0;
        double max = data[0];

        for(int i = 0 ; i < n ; i++){
            sum += data[i];
            if (max<data[i]){
                max = data[i];
            }
        }
        avr = (sum/n);
        double cal = avr/max*100;

        System.out.println(cal);
    }
}
