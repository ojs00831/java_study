package chap02;

import java.util.Random;
import java.util.Scanner;

class Q3 {
	static int sumOf(int[] a) {
		System.out.println("�迭�� ��� ����� �հ踦 ���մϴ�.");
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			System.out.println("���� �հ� : "+ sum);
			System.out.println("�������� �� : "+ a[i]);
			sum += a[i];			
			System.out.println("�ջ� ���� ��� : "+ sum);
			System.out.println("--------------------");
		}
		System.out.println("============================");
		System.out.println("�ջ� ���� ��� : " + sum);
		System.out.println("============================");
		return sum;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();					
		
		int num = 1+rand.nextInt(100);
		System.out.println("�迭�� ��Ұ��� �������� �����մϴ�. : " + num);		
		
		System.out.println("�Է¹��� ��Ұ���ŭ�� �迭�� �����մϴ�.... ");
		int[] a = new int[num];
		
		System.out.println("�迭�� ������� ���� �������� �ֽ��ϴ�. ");
		for(int i = 0; i < a.length; i++ ) {			
			a[i] = rand.nextInt(100);
			System.out.println("a["+i+"] = "+ a[i]);
		}
		int arraySum = sumOf(a);
		System.out.println("�迭 ��Ұ����� �� ���� " + arraySum + " �Դϴ�. ");
	}

}
