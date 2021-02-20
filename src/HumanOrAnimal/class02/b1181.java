package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1181 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 및 사전순 정렬
        int n = Integer.parseInt(br.readLine());
        String array[] = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = br.readLine();
        }
        Arrays.sort(array);

        // 글자 크기에 따른 정렬
        String tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[j-1].length() > array[j].length()){
                    tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        // 출력시 중복제거
        System.out.println(array[0]);

        for (int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i-1])){
                System.out.println(array[i]);
            }
        }
    }
}
