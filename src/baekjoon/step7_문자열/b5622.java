package baekjoon.step7_문자열;

import java.lang.*;
import java.util.*;

public class b5622 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String str = scanner.nextLine();

        String data[] = str.split("");

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if(data[i].equals("A")|| data[i].equals("B") || data[i].equals("C")){
                sum += 3;
            }
            else if(data[i].equals("D")|| data[i].equals("E") || data[i].equals("F")){
                sum += 4;
            }
            else if(data[i].equals("G")|| data[i].equals("H") || data[i].equals("I")){
                sum += 5;
            }
            else if(data[i].equals("J")|| data[i].equals("K") || data[i].equals("L")){
                sum += 6;
            }
            else if(data[i].equals("M")|| data[i].equals("N") || data[i].equals("O")){
                sum += 7;
            }
            else if(data[i].equals("P")|| data[i].equals("Q") || data[i].equals("R") || data[i].equals("S")){
                sum += 8;
            }
            else if(data[i].equals("T")|| data[i].equals("U") || data[i].equals("V")){
                sum += 9;
            }
            else if(data[i].equals("W")|| data[i].equals("X") || data[i].equals("Y") || data[i].equals("Z")){
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
