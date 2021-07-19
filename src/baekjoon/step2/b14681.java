package baekjoon.step2;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b14681 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x > 0 && y > 0){
            System.out.println(1);
        } else if(x < 0 && y > 0){
            System.out.println(2);
        } else if(x < 0 && y < 0){
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
