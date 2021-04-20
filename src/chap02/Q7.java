package chap02;

import java.util.Scanner;

// �Է� ���� 10������ 2���� ~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��.

public class Q7 {
	
	// ������ x�� r ������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;		// ��ȯ ���� �ڸ� ��
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);		// r�� ���� �������� ����.
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
	
	// ������ x�� r ������ ��ȯ�Ͽ� �迭 d�� ���ڸ�(!)���� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	static int cardConvImp(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);		// r�� ���� �������� ����.
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
		
		int no;			// ��ȯ�ϴ� ����
		int cd;			// ���
		int dno;		// ��ȯ ���� �ڸ���
		int dno_1;		// ��ȯ ���� �ڸ���
		int retry;		// �ٽ� �ѹ�?
		char[] cno = new char[32];
		char[] cno_1 = new char[32];
		
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
			
			dno_1 = cardConvImp(no, cd, cno_1);
			
			System.out.println(cd + "�����δ� ");
			for(int i = dno_1 - 1; i >= 0; i--) {
				System.out.print(cno_1[i]);
			}
			System.out.println("�Դϴ�.");
			
			
			System.out.println("�� �� �� �ұ��?(1.��/0.�ƴϿ�) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
	}

}

