package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b1920 {

    public static void main(String[] args) throws IOException {
        // 이분탐색이 뭔데 씨발
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(br.readLine());
        int[] arrayN = new int[n];
        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrayM = new int[m];
        for (int i = 0; i < arrayM.length; i++) {
            arrayM[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i < arrayM.length; i++) {
            count = 0;
            for (int j = 0; j < arrayM.length; j++) {
                if(arrayM[i] == arrayN[j]){
                    count++;
                }
            }
            if(count > 0){
                System.out.println(1);
            }
            else System.out.println(0);

        }

    }
}
