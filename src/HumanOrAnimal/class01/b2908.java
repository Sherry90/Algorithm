package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2908 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String a = scanner.next();
        String b = scanner.next();
        String tmp;

        String[] aArray;
        String[] bArray;

        aArray = a.split("");
        bArray = b.split("");

        tmp = aArray[0];
        aArray[0] = aArray[2];
        aArray[2] = tmp;

        tmp = bArray[0];
        bArray[0] = bArray[2];
        bArray[2] = tmp;

        String A = aArray[0]+aArray[1]+aArray[2];
        String B = bArray[0]+bArray[1]+bArray[2];

        int AA = Integer.parseInt(A);
        int BB = Integer.parseInt(B);

        if(AA > BB){
            System.out.println(AA);
        } else {
            System.out.println(BB);
        }
    }
}
