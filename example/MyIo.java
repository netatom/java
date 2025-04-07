package test;

import java.io.Console;

public class MyIo {
	public static void main(String[] args) {
		
		String id;
		char[] pwd;
		Console con = System.console();
		System.out.println("id는");
		
		id = con.readLine("id=");
		pwd = con.readPassword(); // pwd[0]번지에 입력된다
		System.out.println("input id: " + id);
		System.out.println("input password: " + new String(pwd));
		
		if(id.equals("oraclejava")) {
			if(new String(pwd).equals("1234")) {
				System.out.println("Login Success");
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("Id Error");
		}
	}
}
