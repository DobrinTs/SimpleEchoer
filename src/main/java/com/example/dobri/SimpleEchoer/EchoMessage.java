package com.example.dobri.SimpleEchoer;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EchoMessage")
public class EchoMessage implements Serializable{

	private static final long serialVersionUID = 1L;
	private String user;
	private String text;
	
	
	
	public EchoMessage() {
		super();
	}

	public EchoMessage(String user, String text) {
		super();
		this.user = user;
		this.text = text;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
