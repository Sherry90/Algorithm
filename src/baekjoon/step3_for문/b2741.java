package baekjoon.step3_for문;

import java.io.*;
import java.lang.*;

public class b2741 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N ; i++) {
            bw.write(i+"\n");

        }
        bw.close();

    }
}
