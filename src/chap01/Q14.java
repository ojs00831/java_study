package chap01;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		System.out.println("�ܼ� : ");
		int no;
		no = stdIn.nextInt();
		
		for(int i = 1; i <= no; i ++) {
			for(int j = 1; j <= no; j++) {
				System.out.printf("%1s", "*");
			}
			System.out.println();
		}
	}

}
