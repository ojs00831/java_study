package chap01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("a�� �� : ");
		a = stdIn.nextInt();
		
		do {
			System.out.println("b�� �� : ");
			b = stdIn.nextInt();
			
			if ( a >= b ) {
				System.out.println("a���� ū ���� �Է��ϼ���! ");
			}
			
		} while( a >= b ); 
		
		int sum = 0;
		
		sum = minus(a, b);
		
		System.out.println("b - a�� " + sum + "�Դϴ�. ");
	}
	
	static int minus(int a, int b) {
		return b - a;
	}

}
