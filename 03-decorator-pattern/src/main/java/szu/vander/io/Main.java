package szu.vander.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
* @author : Vander Choi
* @date : 2018-04-19
* @description :
*/
public class Main {

	public static void main(String[] args) {
		InputStream inputStream;
		int c;
		try {
			inputStream = new FileInputStream("test.txt");
			inputStream = new BufferedInputStream(inputStream);
			inputStream = new LowcaseInputStream(inputStream);
			while((c = inputStream.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
