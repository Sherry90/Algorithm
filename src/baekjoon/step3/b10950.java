package baekjoon.step3;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b10950 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int[] data = new int[2];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 2 ; j++){
                data[j] = scanner.nextInt();
            }
            System.out.println(data[0]+data[1]);
        }
    }
}
