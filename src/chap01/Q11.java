package chap01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� ������ �Է����ּ���.");
		
		do {
			System.out.println("n�� �� : ");
			n = stdIn.nextInt();			
		} while (n <= 0);
		
		int length = 0;
		length = (int)(Math.log10(n)+1);
		
		System.out.println("�� ���� " + length + "�ڸ��Դϴ�.");
	}

}
