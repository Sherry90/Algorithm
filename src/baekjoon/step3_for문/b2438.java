package baekjoon.step3_for문;

import java.io.*;
import java.lang.*;

public class b2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                bw.write("*");

            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
