package baekjoon.step02_if문;

import java.util.Scanner;

public class b2525 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int hr = scanner.nextInt();
        int mm = scanner.nextInt();
        int cook = scanner.nextInt();

        mm += cook;

        if(mm >= 60){
            hr += mm / 60;
            mm %= 60;
        }

        if(hr >= 24){
            hr -= 24;
        }

        System.out.print(hr+" "+mm);
    }
}
