package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File filePath = new File("C:\\KG_IT\\8_\\test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(char i = '1'; i < '9'; i++) {
			// Thread.sleep(2000);
			// fos.write(i);
			bos.write(i);
		}
		bos.close();
		//bos.write('a');
		//bos.flush();
	}

}
