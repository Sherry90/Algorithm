package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b9498 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        if(n >= 90){
            System.out.println("A");
        } else if(n >= 80){
            System.out.println("B");
        } else if(n >= 70){
            System.out.println("C");
        } else if(n >= 60){
            System.out.println("D");
        } else
            System.out.println("F");
    }
}
