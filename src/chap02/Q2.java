package chap02;

import java.util.Scanner;

// 61페이지 Q2
// 오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
public class Q2 {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈.
	static void swap(int[] a, int idx1, int idx2) {
		System.out.println("\n\n현재 배열의 상태 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		System.out.println("서로 바뀌는 위치 : " + idx1 + "<==============> "+ idx2);
		System.out.println("서로 바뀌는 값  : " + a[idx1] + "<==============> "+ a[idx2]
				);
		int t = a[idx1];
		System.out.println("a[idx1] 의 값을 t에 넣습니다. t =  " + t);
		a[idx1] = a[idx2];
		System.out.println("a[idx2]의 값을 a[idx1]에 넣습니다. a[idx1] =  " + a[idx1]);
		a[idx2] = t;
		System.out.println("t의 값을 a[idx2]에 넣습니다. a[idx2] =  " + a[idx2]);
		
		System.out.println("\n바뀐 결과 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
	}

	// 배열 요소 a의 요소를 역순으로 정렬.
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];		//요소수가 num인 배열.
		
		for(int i = 0; i < num; i++) {
			System.out.println("x["+ i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("\n\n요소를 역순으로 정렬했습니다. ");
		for(int i = 0; i < num; i++) {
			System.out.println("x["+ i + "] = "+ x[i]);
		}
		
	}	
}
