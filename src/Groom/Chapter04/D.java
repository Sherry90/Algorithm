package Groom.Chapter04;

import java.io.*;
import java.lang.*;
import java.util.*;

public class D {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 모든 수열이 동시에 최초의 원소를 만나는 최소 주기를 계산하는 함수
     *
     * @param n     수열의 수
     * @param sizes 각 순환 수열의 길이(주기)
     * @return
     */
    public static long getGlobalPeriod(int n, long[] sizes)
    {
        long globalPeriod =0;


        return globalPeriod;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt(); // 수열의 수
        long[] sizes = new long[n];  // 각 수열의 주기

        for(int i = 0 ; i < n ; i++)
        {
            sizes[i] = scanner.nextLong();
        }

        // 전체의 공통 주기만큼 이후에 다시 최초로 만나게 되므로
        long answer = 1 + getGlobalPeriod(n, sizes);

        // 정답을 출력한다
        System.out.println(answer);
    }

}


class MathUtil
{


    /**
     * 여러 숫자에 대한 공통 최소 공배수를 계산하는 함수
     * @param numbers
     * @return
     */
    public static long getLCM(long[] numbers)
    {

    }
}