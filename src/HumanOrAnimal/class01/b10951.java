package HumanOrAnimal.class01;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while((s = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(s, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append('\n');
        }

        System.out.println(sb);
    }
}