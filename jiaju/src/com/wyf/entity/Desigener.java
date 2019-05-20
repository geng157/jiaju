package com.wyf.entity;

public class Desigener {
private int desigenerId;
private String name;
private String zhiWei;
private String touXiang;
public int getDesigenerId() {
	return desigenerId;
}
public void setDesigenerId(int desigenerId) {
	this.desigenerId = desigenerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getZhiWei() {
	return zhiWei;
}
public void setZhiWei(String zhiWei) {
	this.zhiWei = zhiWei;
}
public String getTouXiang() {
	return touXiang;
}
public void setTouXiang(String touXiang) {
	this.touXiang = touXiang;
}
public Desigener(int desigenerId, String name, String zhiWei, String touXiang) {
	super();
	this.desigenerId = desigenerId;
	this.name = name;
	this.zhiWei = zhiWei;
	this.touXiang = touXiang;
}
public Desigener() {
	super();
}
@Override
public String toString() {
	return "Desigener [desigenerId=" + desigenerId + ", name=" + name
			+ ", zhiWei=" + zhiWei + ", touXiang=" + touXiang + "]";
}

}
