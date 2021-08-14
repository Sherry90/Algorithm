package baekjoon;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

public class b0000 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int number = A*B*C;

        int[] data = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T ; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");

        }
        bw.close();
    }
}
