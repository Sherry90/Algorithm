package baekjoon.step4_while문;

import java.lang.*;
import java.util.*;

public class b10952 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        while(true){

            int A=scanner.nextInt();
            int B=scanner.nextInt();

            if(A==0 && B==0){
                scanner.close();
                break;
            }
            System.out.println(A+B);
        }
    }
}
