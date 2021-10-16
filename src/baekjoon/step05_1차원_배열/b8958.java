package baekjoon.step05_1차원_배열;

import java.lang.*;
import java.util.*;

public class b8958 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String arr[] = new String[scanner.nextInt()];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.next();
        }

        scanner.close();

        for(int i = 0 ; i < arr.length ; i++){

            int index = 0;
            int save = 0;

            for(int j = 0 ; j < arr[i].length() ; j++){

                if(arr[i].charAt(j) == 'O'){

                    index++;
                } else {
                    index = 0;
                }
                save += index;
            }
            System.out.println(save);
        }
    }
}
