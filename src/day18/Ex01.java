package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File filePath = new File("C:/KG_IT/8_/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath, true);
		
		fos.write(100);
		
		String name = "반갑다";
		
		fos.write(name.getBytes());
	}

}
