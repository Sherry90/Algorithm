package baekjoon.step8_기본_수학_1;

import java.lang.*;
import java.util.*;

public class b1712 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long A = scanner.nextInt();
        long B = scanner.nextInt();
        long C = scanner.nextInt();

        long count = 0;

        count = A / (C-B) +1 ;

        if(B >= C){
            count = -1;

        } else {
            count = A / (C-B) +1 ;
        }
        System.out.println(count);

    }

}

