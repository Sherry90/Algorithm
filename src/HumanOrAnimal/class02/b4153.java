package HumanOrAnimal.class02;

import java.lang.*;
import java.util.*;

public class b4153 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A*A+B*B == C*C || A*A ==B*B + C*C || A*A+C*C == B*B  ){
            System.out.println("right");
        } else if(A == 0 || B == 0 || C ==0){
        }
        else {
            System.out.println("wrong");
        }
    }
}
