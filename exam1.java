package exam2;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner (System.in);


		System.out.print("첫번째 숫자를 입력하시오.");		
		int x = input.nextInt();
		System.out.print("두번째 숫자를 입력하시오.");
		int y = input.nextInt();



		System.out.println(x + " > " + y + " --- " + (x > y));
		System.out.println(x + " < " + y + " --- " + (x < y));
		System.out.println(x + " >= " + y + " --- " + (x >= y));
		System.out.println(x + " <= " + y + " --- " + (x <= y));	

		input.close();
	}

}
