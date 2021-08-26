package day18;

import java.io.Serializable;

public class User implements Serializable {
	
	private String id;
	private String pwd;
	private String name;
	
	public User() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pwd);
		System.out.println("이름 : " + name);
	}
}
