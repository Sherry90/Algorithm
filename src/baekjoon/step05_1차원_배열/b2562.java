package baekjoon.step05_1차원_배열;

import java.lang.*;
import java.util.*;

public class b2562 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] data = new int[9];

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }

        int Max = data[0];
        int index = 0;

        for (int i = 0; i < data.length; i++) {
            if(data[i] > Max){
                Max = data[i];
                index = i;
            }
        }
        System.out.println(Max);
        System.out.println(index+1);

    }
}
