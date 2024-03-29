package Groom.JAVA.Chapter02;

import java.lang.*;
import java.util.*;


public class B {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 주어진 배열이 오름차순인지 검사하는 함수
     * @param data
     * @param n     데이터의 수
     * @return      data[0] ~ data[n-1]이 오름차순이라면 true, else false
     */
    public static boolean isOrdered(int[] data, int n)
    {
        boolean isTrue = true;

        for (int i = 1; i < n; i++) {
            if(data[i-1] > data[i]){
                isTrue = false;
                break;
            }

        }

        return isTrue;
    }


    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        boolean result = isOrdered(data, n);

        if(result)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
