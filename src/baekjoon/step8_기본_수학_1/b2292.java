package baekjoon.step8_기본_수학_1;

import java.lang.*;
import java.util.*;

public class b2292 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int pattern = 6;
        int count = 1;
        int range = 2;

        int N = scanner.nextInt();

        if(N == 1){
            count = 1;
        } else {
            while (N >= range){
                range = range + pattern * count;
                count++;
            }
        }

        System.out.println(count);
    }

}
