package ch5;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		int i , sum = 0;
		float avg;
		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5명의 수학 점수를 입력하십시오");
		for(i = 0; i < jumsu.length; i++) { //(i = 0인 이유는 배열의 시작 번지가 0이기 때문)
			jumsu[i] = sc.nextInt();
		}//총점 구하기
		for(i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}//평균 구하기
		avg = (float) sum / 5; //소수점을 표현하기 위해서 강제 형변환(double로 사용해도 됨)
		System.out.println("총점 = " + sum + ", 평균 = " + avg);
	}
}
