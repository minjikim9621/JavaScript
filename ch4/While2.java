package ch4;

public class While2 {

	public static void main(String[] args) {
		int i = 0, sum = 0;
		//짝수의 합
		while (i <=100) {
			sum += i;
			i += 2;
		}
		System.out.println("sum = " + sum);
	}

}
