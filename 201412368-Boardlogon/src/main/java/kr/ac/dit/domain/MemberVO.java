package kr.ac.dit.domain;

import java.sql.Timestamp;

public class MemberVO { //데이터베이스 테이블을 대표
	private String id;
	 private String pwd;
	 private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
