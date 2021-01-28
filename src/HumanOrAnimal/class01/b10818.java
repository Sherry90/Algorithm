package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b10818 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int[] data = new int[n];

        for (int i = 0 ; i < n ; i++){
            data[i] = scanner.nextInt();
        }

        int max = data[0];
        int min = data[0];

        for (int i = 0 ; i < n ; i++){
            if(max < data[i]){
                max = data[i];
            }
            if(min > data[i]){
                min = data[i];
            }
        }

        System.out.println(min+" "+max);

    }
}
