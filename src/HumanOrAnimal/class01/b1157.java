package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) -'A' ;
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}