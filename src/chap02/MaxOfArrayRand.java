package chap02;

import java.util.Random;
import java.util.Scanner;

class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = stdIn.nextInt();					// 배열의 요소수 받음.
		
		int[] height = new int[num];				// 요소수가 num인 배열을 생성.
		
		System.out.println("키 값은 아래와 같습니다. ");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);		// 요소의 값을 난수로 결정. 0부터 89까지의 숫자중 난수 생성.
			System.out.println("height["+i+"] : " + height[i]);
		}
		
		System.out.println("최댓값은 "+ maxOf(height) + "입니다. ");

		stdIn.close();
		
	}
}
