package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1259 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            String N = scanner.next();
            if(N.equals("0")) System.exit(0);

            String[] arr = new String[N.length()];
            String[] arr2 = new String[N.length()];

            for (int i = 0; i < N.length(); i++) arr[i] = N.substring(i,i+1);

            for (int i = 0; i < N.length(); i++) {
                arr2[i] = arr[N.length()-1-i];
            }

            int count = 0;
            for (int i = 0; i < N.length(); i++) {
                if(arr[i].equals(arr2[i])) count++;
            }

            if(count==N.length()) System.out.println("yes");
            else System.out.println("no");

        }
    }
}
