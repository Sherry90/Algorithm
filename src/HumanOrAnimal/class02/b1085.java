package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1085 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int X = Math.abs(x-0);
        int Y = Math.abs(y-0);
        int W = Math.abs(w-x);
        int H = Math.abs(h-y);

        int array[] = {X, Y, W, H};

        int min = array[1];

        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }

        System.out.println(min);

    }
}
