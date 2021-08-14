package baekjoon.step3;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b11021 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());


        for(int i = 1 ; i <= N ; i++){
            st = new StringTokenizer(br.readLine()," ");

            bw.write("Case #"+i+": ");
            bw.write(Integer.parseInt(st.nextToken())
                    +Integer.parseInt(st.nextToken())+"\n");
        }

        bw.close();

    }
}
