package baekjoon.step2;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2884 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int HH = scanner.nextInt();
        int MM = scanner.nextInt();

        if(MM < 45){
            HH--;
            MM += 15;
            if(HH < 0) {
                HH = 23;
            }
            System.out.println(HH + " " + MM);
        } else {
            System.out.println(HH + " " + (MM-45));
        }
    }
}
