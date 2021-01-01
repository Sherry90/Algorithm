package Baekjoon;
import java.util.*;
public class array {
	public static final int MAX_N = 1000;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		int[] data = new int[MAX_N];
		//
		n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		for(int i = n-1; i >= 0; i--){
			System.out.print(data[i]+" ");
		} //for
		sc.close();
  }
}