package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1152 {
    public static final Scanner scanner = new Scanner(System.in);

    //The Curious Case of Benjamin Button

    public static void main(String[] args) {
        String string = scanner.nextLine();
        String[] stringArray;
        stringArray = string.split("");

        int count = 1;

        for (int i = 0 ; i < stringArray.length ; i++){
            if (stringArray[i].equals(" ")){
                count += 1;
            }

        }
        if (stringArray[0].equals(" ")){
            count -= 1;
        }
        if (stringArray[stringArray.length-1].equals(" ")){
            count -= 1;
        }


        System.out.println(count);

    }
}
