package chap01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		triangleLB();
	}
	
	static void triangleLB() {		// �ﰢ���� �� ������ ����� ������ �Է¹���.
		int n;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		triangleLB(n);				// �ﰢ�� �׸��� ����.
	}
	
	static void triangleLB(int n) {		// ���� �Ʒ��� ������ �̵ �ﰢ���� ���		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
