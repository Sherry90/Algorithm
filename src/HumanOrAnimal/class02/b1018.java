package HumanOrAnimal.class02;

import java.util.Scanner;

public class b1018 {

    public static boolean[][] array;
    public static int min = 64;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        array = new boolean[N][M];
        scanner.nextLine();

        for (int i = 0 ; i < N ; i++){
            String string = scanner.nextLine().trim();

            for(int j = 0; j < M; j++){
                if (string.charAt(j) == 'W'){
                    array[i][j] = true;
                }

            }
        }

        int N_row = N -7;
        int M_col = M -7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i,j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;
        
        boolean TF = array[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = 0; j < end_y; j++) {

                if(array[i][y] != TF){
                    count++;
                }

                TF = (!TF);
            }

            TF = !TF;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);

    }
}
