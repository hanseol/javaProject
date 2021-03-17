package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutExample {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("C:/Temp/캡처.JPG");
		FileOutputStream fos = new FileOutputStream("C:/Temp/copy2.JPG");
		int data = 0;
		byte[] readBytes = new byte[100];
		while((data = fis.read(readBytes))!=-1) {
			fos.write(readBytes);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
		
		
		
		
	}
}
