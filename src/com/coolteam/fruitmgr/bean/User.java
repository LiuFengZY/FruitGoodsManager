package com.coolteam.fruitmgr.bean;

public class User {
    int userid;
    String username;
    String userpwd;
    
    public int getUserId() {
    	return this.userid;
    }
    
    public void setUserId(int id) {
    	this.userid = id;
    }
    
    public String getUserName() {
    	return this.username;
    }
    
    public void setUserName(String name) {
    	this.username = name;
    }
    
    public String getUserPwd() {
    	return this.userpwd;
    }
    
    public void setUserPwd(String pwd) {
    	this.userpwd = pwd;
    }
}
