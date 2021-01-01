package Baekjoon;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a*b*c;
		String re = Integer.toString(result);
		//System.out.println(re);
		for (int i=0 ; i <= 9 ; i++) {
			int count = 0;
			for (int j = 0 ; j<re.length(); j++) {
				int k = re.charAt(j);
				//System.out.println(k);
				if (i==k-48) {
					count++;
					//System.out.println(i);
				}
				
			}
			System.out.println(count);
		}
		sc.close();
	} // main
} // class
