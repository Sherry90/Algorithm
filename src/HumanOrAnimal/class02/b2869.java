package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2869 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        int l = 0;
        int day = 0;


        while (l < V){
            day++;
            l += A;
            if(l >= V){
                break;
            }
            l -= B;
        }


        System.out.println(day);
    }
}
