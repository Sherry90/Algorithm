package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b3052 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] data = new int[10];
        int[] remainder = new int[10];

        for (int i = 0 ; i < data.length ; i++ ){
            data[i] = scanner.nextInt();
        }

        Arrays.sort(data);

        for (int i = 0 ; i < data.length ; i++ ){
            remainder[i] = data[i] % 42;
        }
        Arrays.sort(remainder);

        int index = 1;

        for (int i = 0 ; i < data.length-1 ; i++ ){
            if(remainder[i] != remainder[i+1]) {
                index++;
            }
        }
        System.out.println(index);
    }
}
