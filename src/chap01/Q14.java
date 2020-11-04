package chap01;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.println("단수 : ");
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
