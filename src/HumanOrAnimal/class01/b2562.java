package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2562 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int data[] = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0 ; i < data.length ; i ++){
            data[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < data.length ; i ++){
            if(max < data[i]){
                max = data[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
