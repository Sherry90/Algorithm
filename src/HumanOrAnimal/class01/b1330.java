package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1330 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
