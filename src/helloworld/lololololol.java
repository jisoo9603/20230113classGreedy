package helloworld;

import java.util.Scanner;

public class lololololol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("1보다 작습니다");
		} else {
			for(int i = 1; i <= num; i++) {
				System.out.println(i);
			 if(i >= 50) {
				System.out.println("최대 출력은 50까지 입니다.");
				break;
			}
			
		}
			
		
		
		
	}

}
}