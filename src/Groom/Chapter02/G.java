package Groom.Chapter02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class G {
    public static final Scanner scanner = new Scanner(System.in);

    public static void bubbleSort(int[] data, int n)
    {
        int tmp = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for (int j = 0; j < n; j++) {
                if(data[i] < data[j]){
                    tmp = data[j];
                    data[j] = data[i];
                    data[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        bubbleSort(data, n);

        for(int i = 0 ; i < n ; i++)
        {
            if( i > 0 )
            {
                System.out.print(" ");
            }
            System.out.print(data[i]);
        }
    }

}