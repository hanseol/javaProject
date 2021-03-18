package io;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("id: ");
		String id = console.readLine(); //cmd에서 실행하기
		
		System.out.println("password: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("=============");
		System.out.println(id);
		System.out.println(strPassword);
	}
}
