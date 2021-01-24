package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2753 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        if (n % 400 == 0){
            System.out.println("1");

        } else if(n % 4 == 0 && n % 100 != 0){
            System.out.println("1");
        } else
            System.out.println("0");
    }
}
