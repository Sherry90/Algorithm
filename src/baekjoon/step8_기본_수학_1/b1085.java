package baekjoon.step8_기본_수학_1;

import java.lang.*;
import java.util.*;

public class b1085 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int dx = w - x;
        int dy = h - y;

        int data[] = {x,y,dx,dy};

        int di = x;

        for (int i = 0; i < data.length; i++) {
            if(di > data[i]){
                di = data[i];
            }
        }

        System.out.println(di);
    }
}
