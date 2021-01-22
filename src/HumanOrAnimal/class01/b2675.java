package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 입력 값 저장
        int index = sc.nextInt();

        // 테스트 케이스 개수만큼 반복
        for (int i = 0; i < index; i++) {
            // 반복 출력 횟수 저장
            int reqeat = sc.nextInt();
            // 반복 출력할 문자열 저장
            String str = sc.next();

            // 문자열 길이만큼 반복, 한글자씩 세분화 반복
            for (int j = 0; j < str.length(); j++) {
                // 반복 출력 횟수 만큼 반복
                for (int r = 0; r < reqeat; r++) {
                    System.out.print(str.charAt(j));
                }
            }
            // 줄바꿈
            System.out.println();
        }
    }
}