package Groom.Chapter01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class E {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 동아리 멤버들의 탑승 가능 여부를 출력하는 함수
     *
     * @param data 각 멤버들의 몸무게 data[0] ~ data[n-1]
     * @param n    멤버들의 수
     * @param p    놀이기구 탑승 가능 체중 제한
     * @param q    놀이기구 최대 하중
     */
    public static void solve(int[] data, int n, int p, int q)
    {
        int sumWeight = 0;
        int canPeople = 0;

        // 1. p초과자를 제외한 나머지 사람의 카운트, 무게합
        // 2. 무게합의 조건이 q를 넘지 않을 것

        //10
        //80
        //500
        //75 50 67 84 54 67 98 85 58 90

        for (int i = 0 ; i < n ; i++)
        {
            if (data[i] <= p) {
                sumWeight += data[i];
                canPeople++;
            }
        }
        if (sumWeight < q) {
            System.out.printf(canPeople+" "+sumWeight+"\n");
            System.out.println("YES");
        } else {
            System.out.printf(canPeople+" "+sumWeight+"\n");
            System.out.println("NO");
        }


    }


    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            data[i] = scanner.nextInt();
        }

        solve(data, n, p, q);
    }

}