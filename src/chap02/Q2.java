package chap02;

import java.util.Scanner;

// 61������ Q2
// ������ó�� �迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷��� �ۼ��ϼ���.
public class Q2 {
	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�.
	static void swap(int[] a, int idx1, int idx2) {
		System.out.println("\n\n���� �迭�� ���� : ");
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		System.out.println("���� �ٲ�� ��ġ : " + idx1 + "<==============> "+ idx2);
		System.out.println("���� �ٲ�� ��  : " + a[idx1] + "<==============> "+ a[idx2]
				);
		int t = a[idx1];
		System.out.println("a[idx1] �� ���� t�� �ֽ��ϴ�. t =  " + t);
		a[idx1] = a[idx2];
		System.out.println("a[idx2]�� ���� a[idx1]�� �ֽ��ϴ�. a[idx1] =  " + a[idx1]);
		a[idx2] = t;
		System.out.println("t�� ���� a[idx2]�� �ֽ��ϴ�. a[idx2] =  " + a[idx2]);
		
		System.out.println("\n�ٲ� ��� : ");
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
	}

	// �迭 ��� a�� ��Ҹ� �������� ����.
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];		//��Ҽ��� num�� �迭.
		
		for(int i = 0; i < num; i++) {
			System.out.println("x["+ i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("\n\n��Ҹ� �������� �����߽��ϴ�. ");
		for(int i = 0; i < num; i++) {
			System.out.println("x["+ i + "] = "+ x[i]);
		}
		
	}	
}
