package chap02;

import java.util.Random;
import java.util.Scanner;

// 56페이지 연습문제.
// 키뿐만이 아니라 사람수도 난수로 생성하도록 실습 2-5를 수정하여 프로그램을 작성하세요.
class Q1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다. ");
		int num = 1+ rand.nextInt(100);
		System.out.println("사람 수를 자동으로 구성합니다. : 총 "+num+"명");
		
		int[] height = new int[num];					// num수크기 만큼의 배열 생성.
		
		System.out.println("키 값은 아래와 같습니다. ");
		for(int i = 0; i < height.length; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.println("height["+i+"] = "+ height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + " 입니다. ");
		
		stdIn.close();
	}

}
