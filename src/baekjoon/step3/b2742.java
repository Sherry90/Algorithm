package baekjoon.step3;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2742 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = N; i >= 1; i--) {
            bw.write(i+"\n");

        }
        bw.close();
    }
}
