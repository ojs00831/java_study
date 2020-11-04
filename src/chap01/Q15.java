package chap01;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		triangleLB();
	}
	
	static void triangleLB() {		// 삼각형을 몇 단으로 출력할 것인지 입력받음.
		int n;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("이등변 삼각형을 출력합니다.");
		
		do {
			System.out.println("몇 단 삼각형입니까?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		triangleLB(n);				// 삼각형 그리기 진행.
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		triangleLU(n);				// 삼각형 그리기 진행.
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		triangleRU(n);				// 삼각형 그리기 진행.
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		triangleRB(n);				// 삼각형 그리기 진행.
	}
	
	static void triangleLB(int n) {		// 왼쪽 아래가 직각인 이등변 삼각형을 출력		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {		// 왼쪽 위가 직각인 이등변 삼각형을 출력		
		for(int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {		// 오른쪽 위가 직각인 이등변 삼각형을 출력		
		for(int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if(j <= i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {		// 오른쪽 아래가 직각인 이등변 삼각형을 출력		
		for(int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(j <= i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
