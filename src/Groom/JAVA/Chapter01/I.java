package Groom.JAVA.Chapter01;

import java.lang.*;
import java.util.*;

public class I {
    public static final Scanner scanner = new Scanner(System.in);

    public static void selectionSort(int[] data, int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            int index = i;
            for (int j = i ; j < n ; j++)
            {
                if (data[index] > data[j]){
                    index = j;
                }
            }

            int tmp = data[index];
            data[index] = data[i];
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
