package chap01;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		int n;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("피라미드를 출력합니다.");
		
		do {
			System.out.println("몇 단 피라미드입니까?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// 피라미드를 그리는 함수 호출
		npira(n);
	}
	
	
	// 피라미드를 그리는 함수
	static void npira(int n) {
		
		// 피라미드를 생성하는 방법은 우측아래가 직각인 사각형과 왼쪽 아래가 직각인 사각형을 동시에 그리면 된다.
		for(int i = 1; i <= n; i++) {			
			// 우측 아래가 직각인 사각형을 그림.
			for(int j = n; j >= 1; j--) {
				if(j < i) {
					System.out.printf("%1d", i);
				} else {
					System.out.print(' ');
				}
			}
			// 왼족 아래가 직각인 사각형을 그림.
			for(int k = 1; k <= i; k++) {
				System.out.printf("%1d", i);
			}
				
		System.out.println();	
		}
	}

}
