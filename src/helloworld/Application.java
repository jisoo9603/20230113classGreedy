package helloworld;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("id 입력 : ");
		String id = sc.nextLine();
		System.out.print("pwd 입력 : ");
		String pwd = sc.nextLine();
		System.out.print("name 입력 : ");
		String name = sc.nextLine();
		
		MemberDTO md = new MemberDTO(id, pwd, name);
		
		md.printInformation();
		
	}

}
