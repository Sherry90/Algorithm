package Groom.Chapter04;

import java.io.*;
import java.lang.*;
import java.util.*;

public class C {
    public static final Scanner scanner = new Scanner(System.in);

    public static void testCase(int caseIndex)
    {   //각 테스트케이스에 대하여
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 두 숫자의 최대 공약수와 최소 공배수를 계산한다
        long gcd =  MathUtil.getGCD(num1, num2);
        long lcm =  MathUtil.getLCM(num1, num2);

        // 정답을 출력한다
        System.out.printf("Case #%d:\n", caseIndex);
        System.out.printf("%d %d\n", gcd,lcm);
    }

    public static void main(String[] args) throws Exception {
        int caseSize = scanner.nextInt();

        for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
            testCase(caseIndex);
        }
    }

}

class MathUtil{

    /**
     * a와 b의 최대 공약수를 계산하는 함수
     *
     * @param a
     * @param b
     * @return
     */
    static long getGCD(long a, long b)
    {
        long min = a;
        long gcd = 0;
        if(a>b){
            min = b;
        } else {
            min = a;
        }

        for(long i = min ; i >= 1 ; i--){
            if(a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    /**
     * a와 b의 최소 공배수를 계산하는 함수
     *
     * @param a
     * @param b
     * @return
     */
    static long getLCM(long a, long b)
    {
        long max = 0;
        long lcm = a*b;
        if(a>b){
            max = a;
        } else {
            max = b;
        }

        for(long i = max ; i <= lcm ; i++){
            if(i % a == 0 && i % b == 0){
                lcm = i;
                break;
            }
        }
        return lcm;

    }
}