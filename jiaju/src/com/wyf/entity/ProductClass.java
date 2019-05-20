package com.wyf.entity;

public class ProductClass {
private int classId;
private String className;
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public ProductClass(int classId, String className) {
	super();
	this.classId = classId;
	this.className = className;
}
public ProductClass() {
	super();
}
@Override
public String toString() {
	return "ProductClass [classId=" + classId + ", className=" + className
			+ "]";
}

}
