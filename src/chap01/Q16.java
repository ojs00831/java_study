package chap01;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		spira();
	}
	
	static void spira() {
		int n;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�Ƕ�̵带 ����մϴ�.");
		
		do {
			System.out.println("�� �� �Ƕ�̵��Դϱ�?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// �Ƕ�̵带 �����ϴ� ����� �����Ʒ��� ������ �簢���� ���� �Ʒ��� ������ �簢���� ���ÿ� �׸��� �ȴ�.
		for(int i = 1; i <= n; i++) {			
			// ���� �Ʒ��� ������ �簢���� �׸�.
			for(int j = n; j >= 1; j--) {
				if(j < i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			// ���� �Ʒ��� ������ �簢���� �׸�.
			for(int k = 1; k <= i; k++) {
				System.out.print('*');
			}
				
		System.out.println();	
		}
	}

}
