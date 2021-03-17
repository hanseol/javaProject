package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		int data = 0;
		char[] readChars = new char[100];
		FileReader fr = new FileReader("C:\\Dev\\git\\javaProject\\javaProject\\src\\io\\FileExample.java");
		FileWriter fw = new FileWriter("c:/Temp/Dir/file3.txt");
		
		
		while((data = fr.read(readChars))!=-1){
			String readLines = new String(readChars,0,data); //new String(readChars)
			fw.write(readLines);
			fw.flush();
		}
		fw.close();
		fr.close();
		System.out.println("end/...");
	}
}
