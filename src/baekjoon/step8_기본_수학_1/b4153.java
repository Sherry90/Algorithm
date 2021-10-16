package baekjoon.step8_기본_수학_1;

import java.lang.*;
import java.util.*;

public class b4153 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            if(A == 0 && B == 0 && C ==0){
                break;
            }

            int data[] = {A,B,C};

            Arrays.sort(data);

            if(data[0]*data[0] + data[1]*data[1] == data[2]*data[2]){
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }

}
