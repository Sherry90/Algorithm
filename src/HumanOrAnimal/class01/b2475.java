package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

public class b2475 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int n = scanner.nextInt();
        //String string = String.valueOf(n);

        String[] stringArray = new String[6];
        for (int i = 0 ; i < 6 ; i++){
            //stringArray[i] = string[i];
        }
        int number = 12345;
        int[] digits = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        //System.out.print( Arrays.toString(digits) );

        for (int i = 0 ; i < digits.length ; i++){
            System.out.println(digits[i]);
        }

    }
}
