package chap02;

import java.util.Scanner;

// �Է� ���� 10������ 2���� ~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��.

public class CardConvRev {
	
	// ������ x�� r ������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;		// ��ȯ ���� �ڸ� ��
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);		// r�� ���� �������� ����.
			x /= r;
		} while (x != 0);
		
		return digits;
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;			// ��ȯ�ϴ� ����
		int cd;			// ���
		int dno;		// ��ȯ ���� �ڸ���
		int retry;		// �ٽ� �ѹ�?
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = stdIn.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��?(2~26) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.println(cd + "�����δ� ");
			for(int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.println("�� �� �� �ұ��?(1.��/0.�ƴϿ�) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
	}

}

