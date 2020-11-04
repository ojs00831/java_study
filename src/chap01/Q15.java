package chap01;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		triangleLB();
	}
	
	static void triangleLB() {		// �ﰢ���� �� ������ ����� ������ �Է¹���.
		int n;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleLB(n);				// �ﰢ�� �׸��� ����.
		
		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleLU(n);				// �ﰢ�� �׸��� ����.
		
		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleRU(n);				// �ﰢ�� �׸��� ����.
		
		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleRB(n);				// �ﰢ�� �׸��� ����.
	}
	
	static void triangleLB(int n) {		// ���� �Ʒ��� ������ �̵ �ﰢ���� ���		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {		// ���� ���� ������ �̵ �ﰢ���� ���		
		for(int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {		// ������ ���� ������ �̵ �ﰢ���� ���		
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
	
	static void triangleRB(int n) {		// ������ �Ʒ��� ������ �̵ �ﰢ���� ���		
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
