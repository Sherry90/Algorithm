package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2920 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] input = new int[8];

        for(int i = 0 ; i < input.length ; i++){
            input[i] = scanner.nextInt();
        }

        String cal = "";

        for(int i = 0 ; i < input.length-1 ; i++){
            if(input[i+1] == input[i]+1){
                cal = "ascending";
            } else if(input[i+1] == input[i]-1){
                cal = "descending";
            } else {
                cal = "mixed";
                break;
            }

        }
        System.out.println(cal);
    }
}
