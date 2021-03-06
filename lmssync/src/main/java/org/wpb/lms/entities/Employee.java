package org.wpb.lms.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Links links;
	private String usertype;
	private String siteid;
	private String employeeid;
	private String tsuserid;

	private String firstname;
	private List<Email> email = new ArrayList<Email>();
	private String username;
	private String status;
	private String lastname;
	private String userid;
	private String password;

	private String httpcode;
	private String moreinfo;
	private String developermessage;
	private String statuscode;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname.trim();
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype.trim();
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid.trim();
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid.trim();
	}

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username.trim();
	}

	/**
	 * Status is overloaded attribute: 1. For successful request, status
	 * indicates Active, Inactive or Offline 2. For failed request, status
	 * indicates HTTP error message
	 * 
	 * @return User Status (or) HTTP error message
	 */
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status.trim();
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname.trim();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password.trim();
	}

	@JsonIgnore
	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public String getTsuserid() {
		return tsuserid;
	}

	public void setTsuserid(String tsuserid) {
		this.tsuserid = tsuserid.trim();
	}

	public String toString() {
		return "Employee:: " + System.lineSeparator() + "-----------" + System.lineSeparator() + "Links: " + getLinks()
				+ ", " + System.lineSeparator() + "Usertype: " + getUsertype() + ", " + System.lineSeparator()
				+ "SiteID: " + getSiteid() + ", " + System.lineSeparator() + "EmployeeID: " + getEmployeeid() + ", "
				+ System.lineSeparator() + "FirstName: " + getFirstname() + ", " + System.lineSeparator() + "Email: "
				+ getEmail() + ", " + System.lineSeparator() + "Username: " + getUsername() + ", "
				+ System.lineSeparator() + "Status: " + getStatus() + ", " + System.lineSeparator() + "Lastname: "
				+ getLastname() + ", " + System.lineSeparator() + "Userid: " + getUserid() + ", "
				+ System.lineSeparator();
	}

	public String htmlPrint() {
		return "<table style=\"width:100%\">" + "<tr>" + "<th>User Type</th>" + "<th>Employee ID</th>"
				+ "<th>First Name</th>" + "<th>Last Name</th>" + "<th>User Name</th>" + "<th>Status</th>"
				+ "<th>User ID</th>" + "<th>Emails</th>" + "</tr><tr>" + "<td>" + getUsertype() + "</td>" + "<td>"
				+ getEmployeeid() + "</td>" + "<td>" + getFirstname() + "</td>" + "<td>" + getLastname() + "</td>"
				+ "<td>" + getUsername() + "</td>" + "<td>" + getStatus() + "</td>" + "<td>" + getUserid() + "</td>"
				+ "<td>" + getEmail() + "</td>" + "</tr>" + "</table>";
	}

	public String getHttpcode() {
		return httpcode;
	}

	public void setHttpcode(String httpcode) {
		this.httpcode = httpcode.trim();
	}

	public String getMoreinfo() {
		return moreinfo;
	}

	public void setMoreinfo(String moreinfo) {
		this.moreinfo = moreinfo.trim();
	}

	public String getDevelopermessage() {
		return developermessage;
	}

	public void setDevelopermessage(String developermessage) {
		this.developermessage = developermessage.trim();
	}

	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode.trim();
	}
}
