package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2609 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void gcd(int a, int b) {
        int mod = a % b;
        int A = a;
        int B = b;
        while(mod > 0){
            a = b;
            b = mod;
            mod = a % b;
        }

        System.out.println(b);
        System.out.println(A*B/b);
    }

    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        gcd(a,b);
    }
}
