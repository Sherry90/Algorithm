package baekjoon.step03_for문;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;

        for(int i = 1 ; i <= N ; i++){
            st = new StringTokenizer(br.readLine()," ");

            bw.write("Case #"+i+": ");

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write(A+" + "+B+" = ");
            bw.write(A+B+"\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
