package com.wyf.entity;

public class LiuYan {
	private int liuYanId;
	private String name;
	private String phone;
	private String email;
	private String content;
	public int getLiuYanId() {
		return liuYanId;
	}
	public void setLiuYanId(int liuYanId) {
		this.liuYanId = liuYanId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LiuYan(int liuYanId, String name, String phone, String email,
			String content) {
		super();
		this.liuYanId = liuYanId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.content = content;
	}
	public LiuYan() {
		super();
	}
	@Override
	public String toString() {
		return "LiuYan [liuYanId=" + liuYanId + ", name=" + name + ", phone="
				+ phone + ", email=" + email + ", content=" + content + "]";
	}
	
}
