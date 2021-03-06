package org.wpb.lms.entities;

import java.io.Serializable;
import java.net.URI;

public class Email implements Serializable {

	private static final long serialVersionUID = 1L;

	URI link;
	String email;
	String status;
	String emailid;
	String httpcode;
	String moreinfo;
	String developermessage;
	String statuscode;
	
	public Email() {
		//default constructor
	}
	public Email(String email, String status) {
		this.email = email;
		this.status = status;
	}

	public URI getLink() {
		return link;
	}

	public void setLink(URI link) {
		this.link = link;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getHttpcode() {
		return httpcode;
	}

	public void setHttpcode(String httpcode) {
		this.httpcode = httpcode;
	}

	public String getMoreinfo() {
		return moreinfo;
	}

	public void setMoreinfo(String moreinfo) {
		this.moreinfo = moreinfo;
	}

	public String getDevelopermessage() {
		return developermessage;
	}

	public void setDevelopermessage(String developermessage) {
		this.developermessage = developermessage;
	}

	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	public String toString() {
		return "<table style=\"width:100%\">"
				+ "<tr>"
				+ "<th>Email</th>"
				+ "<th>Status</th>"
				+ "<th>Email ID</th>"
				+ "</tr><tr>"
				+ "<td>" + getEmail() + "</td>"
				+ "<td>" + getStatus() + "</td>"
				+ "<td>" + getEmailid() + "</td>"
				+ "</tr>"
				+ "</table>";

//		return "Email::" + System.lineSeparator() + 
//				"-------" + System.lineSeparator() + 
//				"Email: " + getEmail() + ", " + System.lineSeparator() + 
//				"Status: " + getStatus() + ", " + System.lineSeparator() + 
//				"Emailid: " + getEmailid() + ", " + System.lineSeparator();
	}
	
	public String htmlPrint() {
		return "<table style=\"width:100%\">"
				+ "<tr>"
				+ "<th>Email</th>"
				+ "<th>Status</th>"
				+ "<th>Email ID</th>"
				+ "</tr><tr>"
				+ "<td>" + getEmail() + "</td>"
				+ "<td>" + getStatus() + "</td>"
				+ "<td>" + getEmailid() + "</td>"
				+ "</tr>"
				+ "</table>";
	}

}
