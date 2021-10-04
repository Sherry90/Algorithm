package baekjoon.step8_기본_수학_1;

import java.lang.*;
import java.util.*;

public class b2869 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        scanner.close();

        long number = 0;
        long count = 0;

        while(true){
            number = number + A;
            count++;
            if(V <= number){
                break;
            }
            number = number - B;
        }
        System.out.println(count);
    }
}
