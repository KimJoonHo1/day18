package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\KG_IT\\8_\\test/aaa.txt");
		FileInputStream fis = new FileInputStream(file);
		while(true) {
			int res = fis.read();
			if(res < 0) {
				break;
			}
			System.out.println((char)res);
		}
	}

}
