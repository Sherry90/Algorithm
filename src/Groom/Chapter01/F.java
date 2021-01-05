package Groom.Chapter01;

import java.io.*;
import java.lang.*;
import java.util.*;


public class F {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 배열에서 특정 원소의 위치를 찾는 함수
     * @param data 중복 없는 정수 배열 data[0] ~ data[n-1]
     * @param n    배열의 크기 n
     * @param m    배열에서 찾고자 하는 원소
     * @return     원소가 존재한다면 인덱스를, 존재하지 않으면 -1을 반환한다.
     */
    public static int findIndex(int[] data, int n, int m)
    {
        for (int i = 0 ; i < n ; i++)
        {
            if (m == data[i]){
                return i;
            }
        }
        return -1;
    } // 27분
    //https://edu.goorm.io/learn/lecture/554/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%95%B4%EA%B2%B0%EA%B8%B0%EB%B2%95-%EC%9E%85%EB%AC%B8/lesson/1251267/%EC%9E%84%EC%8B%9C-1e-1j-%ED%95%B4%EC%84%A4%EA%B0%95%EC%9D%98

    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i  ++)
        {
            data[i] = scanner.nextInt();
        }

        int answer = findIndex(data, n, m);

        System.out.println(answer);
    }
}
