package HumanOrAnimal.class02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class b2164 {
    public static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        for(int i = 0; i < N; i++) {
            if(queue.size() == 1) {
                System.out.println(queue.poll());
                break;
            }
            queue.poll();
            queue.add(queue.poll());
        }
    }
}