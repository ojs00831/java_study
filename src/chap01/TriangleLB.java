package chap01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		triangleLB();
	}
	
	static void triangleLB() {		// 삼각형을 몇 단으로 출력할 것인지 입력받음.
		int n;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do {
			System.out.println("몇 단 삼각형입니까?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		triangleLB(n);				// 삼각형 그리기 진행.
	}
	
	static void triangleLB(int n) {		// 왼쪽 아래가 직각인 이등변 삼각형을 출력		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
