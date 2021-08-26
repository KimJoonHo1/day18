package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\KG_IT\\8_\\test\\abcd1234/test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		
		System.out.print("나이 입력 : ");
		String age = scanner.next();
		
		System.out.print("주소 입력 : ");
		String addr = scanner.next();
		
		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
		
	}

}
