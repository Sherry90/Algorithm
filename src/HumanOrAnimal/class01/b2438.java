package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2438 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
