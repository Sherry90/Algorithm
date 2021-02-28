package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1929 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int count = 0;


        int[] arr = new int[N-M+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+M;
        }

        if(M == 2 || M == 3){
            System.out.println(M);
        }
        if(N == 3){
            System.out.println(N);
        }

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 2; j <= i; j++) {
                count = 0;
                if(arr[i] % j == 0){
                    break;
                }
                else if (arr[i] % j != 0){
                    count++;
                }

            }

            if(count > 0){
                System.out.println(arr[i]);
            }

        }

    }
}
