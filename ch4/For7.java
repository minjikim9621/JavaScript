package ch4;

public class For7 {

	public static void main(String[] args) {
		int i , j;
		for(i=0;i<4;i++) { //삼각형의 세로 4줄
			for(j=1;j<=i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
