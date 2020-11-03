package chap01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("양의 정수를 입력해주세요.");
		
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();			
		} while (n <= 0);
		
		int length = 0;
		length = (int)(Math.log10(n)+1);
		
		System.out.println("그 수는 " + length + "자리입니다.");
	}

}
