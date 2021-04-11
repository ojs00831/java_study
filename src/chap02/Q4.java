package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q4 {
	static void showArray(int[] a, String b) {
		
		for(int i = 0; i < a.length; i++ ) {
			System.out.println(b+"["+i+"] = " + a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("�迭 a ������ ���� ? : ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(99);
		}
		
		System.out.println("�迭 b�� ������ ���� ? : ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		for(int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(99);
		}
		
		System.out.println("�迭 a ���");
		showArray(a, "a");
		
		System.out.println("�迭 b ���");
		showArray(b, "b");
		
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �����մϴ�. ");
		a = new int[nb];
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
		
		System.out.println("�迭 a ���");
		showArray(a, "a");
		
		System.out.println("�迭 b ���");
		showArray(b, "b");
	}

}
