package Groom.Chapter01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class I {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 주어진 범위의 최소값의 위치를 반환하는 함수
     * @param data  데이터 배열
     * @param n     배열의 크기
     * @param begin 탐색 할 가장 첫(왼쪽) 인덱스
     * @param end   탐색 할 가장 마지막(오른쪽) 인덱스
     * @return  data[begin] ~ data[end] 중 가장 작은 원소의 인덱스
     */
    public static int getMinIndexInRange(int[] data, int n, int begin, int end)
    {
        int minIndex = begin;

        for (int i = begin; i <= end; i++) {
            if(data[minIndex] > data[i]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionSort(int[] data, int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            //주어진 범위에서 가장 작은 원소의 위치를 찾는다.
            int minIndex = getMinIndexInRange( data, n, i, n-1 );

            int tmp = data[minIndex];

            data[minIndex] = data[i];

            data[i] = tmp;


        }
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        selectionSort(data, n);

        for(int i = 0; i < n ; i ++)
        {
            if( i > 0 )
            {
                System.out.print(" ");
            }
            System.out.print(data[i]);
        }
    }

}