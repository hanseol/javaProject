package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in; //바이트입력스트림
		
		//문자입력스트림으로 변환
		Reader reader = new InputStreamReader(is); 
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=reader.read(cbuf))!=-1) { //매개값이 없는경우엔 값을 읽어오지만 매개값이 있으면(char타입의 배열) 크기를 반환.
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}
}
