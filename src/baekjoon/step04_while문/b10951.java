package baekjoon.step04_while문;

import java.lang.*;
import java.util.*;

public class b10951 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        while(scanner.hasNextInt()){

            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(a+b);

        }
        scanner.close();
    }
}
