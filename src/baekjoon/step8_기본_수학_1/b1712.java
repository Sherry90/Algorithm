package baekjoon.step8_기본_수학_1;

import java.lang.*;
import java.util.*;

public class b1712 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int A = scanner.nextInt();	// 불변 비용
        int B = scanner.nextInt();	// 가변 비용
        int C = scanner.nextInt(); 	// 상품 가격

        int counter = 0;

        if (C <= B) {
            counter = -1;
        }
        else {
            counter = (A/(C-B))+1;
        }
        System.out.println(counter);
    }

}

