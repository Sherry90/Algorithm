package Baekjoon;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		temp = sc.nextInt();
		for (int i=0;i<temp;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	} // main
} // class
