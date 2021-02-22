package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1920 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arrayM = new int[m];
        for (int i = 0; i < arrayM.length; i++) {
            arrayM[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arrayM.length; i++) {
            count = 0;
            for (int j = 0; j < arrayM.length; j++) {
                if(arrayM[i] == arrayN[j]){
                    count++;
                }
            }
            if(count > 0){
                System.out.println(1);
            }
            else System.out.println(0);

        }

    }
}
