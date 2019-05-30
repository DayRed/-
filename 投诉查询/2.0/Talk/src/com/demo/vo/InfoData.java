package com.demo.vo;

public class InfoData {
	private String city;
	private String county;
	private String name;
	private String handletimes;
	private String state;
	private String text;
	private String reflecttimes;
	private String source;
	private String company;
	private String replytimes;
	private String replytext;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHandletimes() {
		return handletimes;
	}
	public void setHandletimes(String handletimes) {
		this.handletimes = handletimes;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getReflecttimes() {
		return reflecttimes;
	}
	public void setReflecttimes(String reflecttimes) {
		this.reflecttimes = reflecttimes;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getReplytimes() {
		return replytimes;
	}
	public void setReplytimes(String replytimes) {
		this.replytimes = replytimes;
	}
	public String getReplytext() {
		return replytext;
	}
	public void setReplytext(String replytext) {
		this.replytext = replytext;
	}
	@Override
	public String toString() {
		return "InfoData [city=" + city + ", county=" + county + ", name="
				+ name + ", handletimes=" + handletimes + ", state=" + state
				+ ", text=" + text + ", reflecttimes=" + reflecttimes
				+ ", source=" + source + ", company=" + company
				+ ", replytimes=" + replytimes + ", replytext=" + replytext
				+ "]";
	}
}
