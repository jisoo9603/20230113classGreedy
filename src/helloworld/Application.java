package helloworld;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			System.out.println("단수 입력");
			
			int dan = sc.nextInt();
			int su = sc.nextInt();
			
			int gugu[][] = new int[8][9];
			
			
			gugu[dan][su] = (dan ) * (su);
			System.out.println((dan) + " * " + (su) + " = " + gugu[dan][su]);
		
	}

}
