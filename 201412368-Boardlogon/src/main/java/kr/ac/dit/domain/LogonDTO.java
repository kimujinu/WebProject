package kr.ac.dit.domain;

import java.sql.Timestamp;

public class LogonDTO { //데이터베이스 테이블을 대표
	private String id;
	 private String pwd;
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
}
