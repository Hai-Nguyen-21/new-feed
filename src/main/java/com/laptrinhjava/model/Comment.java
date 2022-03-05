package com.laptrinhjava.model;

public class Comment extends RootClass{
	private String content;
	private int id_user;
	private int id_new;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_new() {
		return id_new;
	}
	public void setId_new(int id_new) {
		this.id_new = id_new;
	}
	
	
}
