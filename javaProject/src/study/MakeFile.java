package study;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MakeFile {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/address.txt");
		FileWriter fw = new FileWriter(dir);
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		
		while (run) {

			System.out.print("name> ");
			String inputName = scn.nextLine();

			System.out.print("phone> ");
			String inputPhone = scn.nextLine();
			
			fw.write(inputName);
			fw.write(inputPhone);

		}

		fw.flush();
		fw.close();
		System.out.println("파일 저장이 끝났습니다.");

	}
}
