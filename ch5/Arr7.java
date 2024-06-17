package ch5;

import java.util.Scanner;

public class Arr7 {

	public static void main(String[] args) {
		//세 사람의 이름을 저장할 배열
		String[] name = new String[3];
		
		//세 사람의 국어,영어,수학,총점을 저장할 배열
		int[][] jumsu = new int[3][4];
		
		//세 사람의 평균을 저장할 배열
		float[] avg = new float[3];
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		
		Scanner sc = new Scanner(System.in);
		int i , j;
		
		for(i = 0; i < jumsu.length; i++) {
			System.out.println(i + "번째 사람의 정보 입력");
			
			//i번째 사람의 이름을 입력받는다.
			System.out.println(title[0] + "입력: ");
			name[i] = sc.next();
			
			//i번째 줄의 총점 칸을 0으로 초기화
			jumsu[i][3] = 0;
			
			//i번째 사람의 국영수 점수를 입력받고 총점을 구한다.
			for(j = 0; j < jumsu[i].length; j++) {
				System.out.println(title[j+1] + "점수입력: ");
				jumsu[i][j] = sc.nextInt();
				
				//입력받은 점수를 총점칸에 누적
				jumsu[i][3] += jumsu[i][j];
			}
			//i번째 사람의 평균을 계산하여 결과를 avg 배열에 저장
			avg[i] = (float) jumsu[i][3];
			System.out.println();
		}
		
		//결과 타이틀 출력
		for(i = 0; i < title.length; i++) {
			System.out.println(title[i] + "\t");
		}
		System.out.println();
		
		//결과 출력
		for(i = 0; i < jumsu.length; i++) {
			//i번째 사람의 이름 출력
			System.out.println(name[i] + "\t");
			//i번재 사람의 국,영,수,총점을 출력
			for(j = 0; j < jumsu[i].length; j++) {
				System.out.println(jumsu[i][j] + "\t");
			}
			//i번째 사람의 평균 출력
			System.out.print(avg[i] + "\n");
		}

	}

}
