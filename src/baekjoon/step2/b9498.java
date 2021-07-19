package baekjoon.step2;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b9498 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int point = scanner.nextInt();

        if(point >= 90){
            System.out.println("A");
        } else if(point >= 80) {
            System.out.println("B");
        } else if(point >= 70){
            System.out.println("C");
        } else if(point >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
