package chap02;

import java.util.Random;
import java.util.Scanner;

class Q3 {
	static int sumOf(int[] a) {
		System.out.println("배열의 모든 요소의 합계를 구합니다.");
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			System.out.println("현재 합계 : "+ sum);
			System.out.println("더해지는 값 : "+ a[i]);
			sum += a[i];			
			System.out.println("합산 진행 결과 : "+ sum);
			System.out.println("--------------------");
		}
		System.out.println("============================");
		System.out.println("합산 최종 결과 : " + sum);
		System.out.println("============================");
		return sum;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();					
		
		int num = 1+rand.nextInt(100);
		System.out.println("배열의 요소값을 무작위로 생성합니다. : " + num);		
		
		System.out.println("입력받은 요소값만큼의 배열을 생성합니다.... ");
		int[] a = new int[num];
		
		System.out.println("배열의 구성요소 값을 무작위로 넣습니다. ");
		for(int i = 0; i < a.length; i++ ) {			
			a[i] = rand.nextInt(100);
			System.out.println("a["+i+"] = "+ a[i]);
		}
		int arraySum = sumOf(a);
		System.out.println("배열 요소값들의 총 합은 " + arraySum + " 입니다. ");
	}

}
