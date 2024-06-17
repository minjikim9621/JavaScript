package ch4;

public class Continue {

	public static void main(String[] args) {
		int i;
		for(i=0;i<11;i++) {
			if(i % 2 == 1) { //2로 나눴을 때 나머지가 0인,즉 홀수를 의미함(짝수는 i % 2 == 0)
				continue;
			}
			System.out.print(i + "\t");
		}

	}

}
