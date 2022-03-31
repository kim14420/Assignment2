package exam2;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);

		System.out.print("민수의 키와 몸무게를 입력하세요.");
		int x = input.nextInt();
		int z = input.nextInt();
		System.out.print("기영이의 키와 몸무게를 입력하세요.");
		int y = input.nextInt();
		int h = input.nextInt();

		System.out.print((x > y) && (z > h));



		input.close();
	}
}
