package Alsong;

import java.util.Scanner;
//입력한 값의 개수만큼 '*'를 표시하는 프로그램을 작성하기.마지막에는 줄바꿈 문자를 출력할 것.
//단,읽은 값이 1미만이면 줄바꿈 문자를 표시해서는 안된다.(즉,0보다 크다는 뜻)
public class Q3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?: ");
		int n = stdIn.nextInt();
		if(n > 0) {
			int i = 0;
			while(i < n) {
				System.out.print("*");
				i++;
			}
			System.out.println();
		}
	}

}
