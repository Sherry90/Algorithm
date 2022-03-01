package baekjoon.step02_if문;

import java.util.Arrays;
import java.util.Scanner;

public class b2480 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] data = new int[3];
        int money = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }

        Arrays.sort(data);

        if(data[0] == data[1] && data[0] == data[2]){
            money = 10000 + data[0]*1000;
        }
        else if(data[0] == data[1]){
            money = 1000 + data[0]*100;
        }
        else if(data[1] == data[2]){
            money = 1000 + data[1]*100;
        }
        else if(data[0] == data[2]){
            money = 1000 + data[0]*100;
        }
        else {
            money = data[2]*100;
        }

        System.out.println(money);

    }
}
