package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File filePath = new File("C:\\KG_IT\\8_\\test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scanner.next();
		
		Test05 t = new Test05();
		t.setName(name);
		
		oos.writeObject(t);
		oos.close();
	}

}
