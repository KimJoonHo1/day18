package day18;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\KG_IT\\8_\\test/aaa.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Test05 t =(Test05) ois.readObject();
		t.print();
	}

}
