package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			FileInputStream fis = null;
			File file = null;
			StringBuilder path = new StringBuilder();
			path.append("C:\\KG_IT\\8_\\test\\user");
			
			System.out.println("1.회원 검색 2.회원 등록 3.종료");
			int sel;
			System.out.print(">>>> ");
			try {
				sel = Integer.parseInt(scanner.nextLine());
			} catch(Exception e) {
				System.out.println("정수를 입력해 주세요.");
				continue;
			}
			
			if(sel == 1) {
				System.out.print("검색할 회원 아이디 입력 : ");
				String selectId = scanner.next();
				
				path.append("/" + selectId);
				file = new File(path.toString());
				
				try {
					fis = new FileInputStream(file);
					BufferedInputStream bis = new BufferedInputStream(fis);
					ObjectInputStream ois = new ObjectInputStream(bis);
					
					User user = (User) ois.readObject();
					user.print();
					ois.close();
				} catch(FileNotFoundException e) {
					System.out.println("없는 회원입니다.");
				} finally {
					scanner.nextLine();
				}
				
			} 
			else if(sel == 2) {
				System.out.print("아이디 입력 : ");
				String id = scanner.next();
				
				path.append("/" + id);
				
				file = new File(path.toString());
				try {
					fis = new FileInputStream(file);
					System.out.println("이미 가입된 회원입니다.");
					fis.close();
				} catch(FileNotFoundException e) {
					System.out.print("비밀번호 입력 : ");
					String pw = scanner.next();
					System.out.print("이름 입력 : ");
					String name = scanner.next();
		
					
					User user = new User();
					user.setId(id);
					user.setPwd(pw);
					user.setName(name);
				
					FileOutputStream fos = new FileOutputStream(file);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos);
					
					oos.writeObject(user);
					System.out.println("회원 등록이 완성되었습니다 !");
					oos.close();

				} finally {
					scanner.nextLine();
				}
				
			}
			else if(sel == 3) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else {
				System.out.println("잘못된 입력으로 종료합니다.");
				System.exit(1);
			}
			
		}
		
	}

}
