package Baekjoon;

import java.util.Scanner;

public class star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		for(int i=0;i<temp;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			} //for j
			System.out.println("");
		} // for i
	}
}
