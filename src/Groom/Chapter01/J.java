package Groom.Chapter01;

import java.io.*;
import java.lang.*;
import java.util.*;


public class J {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 1부터 N까지의 자연수의 합을 계산하는 함수
     * @param i
     * @return
     */
    public static int getRangeSumFromOne(int i) {
        int sum = 0;
        for (int j = 1 ; j <= i ; j++){
            for (int k = 1 ; k <= j ; k++){
                sum += k;
            }
        }
        return sum;
    }


    public static long getAnswer(int N)
    {
        int getAnswer = 0;

        getAnswer = getRangeSumFromOne(N);

        return getAnswer;
    }


    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();

        long answer = getAnswer(n);

        System.out.println(answer);
    }

}
