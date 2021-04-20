package chap02;

import java.util.Scanner;

// 입력 받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타냄.

public class Q7 {
	
	// 정숫값 x를 r 진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;		// 변환 후의 자릿 수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);		// r로 나눈 나머지를 저장.
			x /= r;
			if(x != 0) {
				System.out.printf("%d |           %d .... %c %n",r, x, d[digits-1] );
				System.out.println("  +----------------");
			} else {
				System.out.printf("		     %d %n",x );
			}
		} while (x != 0);
		
		return digits;
		
	}
	
	// 정숫값 x를 r 진수로 변환하여 배열 d에 윗자리(!)부터 넣어두고 자릿수를 반환합니다.
	static int cardConvImp(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);		// r로 나눈 나머지를 저장.
			x /= r;
			
		} while (x != 0);

		char[] tmp = new char[32];
		for(int i = 0; i < digits; i++) {
			tmp[i] = d[digits-(i+1)];
		}
		
		d = tmp;
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;			// 변환하는 정수
		int cd;			// 기수
		int dno;		// 변환 후의 자릿수
		int dno_1;		// 변환 후의 자릿수
		int retry;		// 다시 한번?
		char[] cno = new char[32];
		char[] cno_1 = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("어떤 진수로 변환할까요?(2~26) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.println(cd + "진수로는 ");
			for(int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			dno_1 = cardConvImp(no, cd, cno_1);
			
			System.out.println(cd + "진수로는 ");
			for(int i = dno_1 - 1; i >= 0; i--) {
				System.out.print(cno_1[i]);
			}
			System.out.println("입니다.");
			
			
			System.out.println("한 번 더 할까요?(1.예/0.아니오) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
	}

}

