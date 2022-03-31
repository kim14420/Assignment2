package exam2;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);

		System.out.print("첫번째 숫자를 입력하시오.");
		int x = input.nextInt();
		System.out.print("두번째 숫자를 입력하시오.");
		int y = input.nextInt();

		int nextx = x++;
		int nexty = --y;


		int z = nextx * nexty ;

		System.out.print(x + " ");
		System.out.print(nexty + " ");
		System.out.print(z);


		input.close();
	}

}
