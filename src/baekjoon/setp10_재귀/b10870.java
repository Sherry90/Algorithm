package baekjoon.setp10_재귀;

import java.lang.*;
import java.util.*;

public class b10870 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        if(N == 0){
            System.out.println(N);
        }
        else if(N == 1){
            System.out.println(N);
        }
        else
        {
            int data[] = new int[N+1];

            data[0] = 0;
            data[1] = 1;

            for(int i = 2 ; i < data.length ; i ++){
                data[i] = data[i-1] + data[i-2];
            }

            System.out.println(data[N]);
        }

    }

}
