package com.site.chatteste.config;

public class ObjMsg {

	private String user;
	private String msg;

	public ObjMsg() {
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return user + "   " + msg;
	}
}
