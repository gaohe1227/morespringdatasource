package com.demo.model;

public class Users {
private String id;
private String name;
private String  password ;
private String password_salt;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassword_salt() {
	return password_salt;
}
public void setPassword_salt(String password_salt) {
	this.password_salt = password_salt;
}
}
