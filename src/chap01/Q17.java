package chap01;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		int n;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�Ƕ�̵带 ����մϴ�.");
		
		do {
			System.out.println("�� �� �Ƕ�̵��Դϱ�?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// �Ƕ�̵带 �׸��� �Լ� ȣ��
		npira(n);
	}
	
	
	// �Ƕ�̵带 �׸��� �Լ�
	static void npira(int n) {
		
		// �Ƕ�̵带 �����ϴ� ����� �����Ʒ��� ������ �簢���� ���� �Ʒ��� ������ �簢���� ���ÿ� �׸��� �ȴ�.
		for(int i = 1; i <= n; i++) {			
			// ���� �Ʒ��� ������ �簢���� �׸�.
			for(int j = n; j >= 1; j--) {
				if(j < i) {
					System.out.printf("%1d", i);
				} else {
					System.out.print(' ');
				}
			}
			// ���� �Ʒ��� ������ �簢���� �׸�.
			for(int k = 1; k <= i; k++) {
				System.out.printf("%1d", i);
			}
				
		System.out.println();	
		}
	}

}
