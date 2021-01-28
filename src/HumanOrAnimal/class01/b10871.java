package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b10871 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int cut = scanner.nextInt();

        int[] data = new int[n];


        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (data[i] < cut) {
                System.out.print(data[i] + " ");
            }
        }
    }
}
