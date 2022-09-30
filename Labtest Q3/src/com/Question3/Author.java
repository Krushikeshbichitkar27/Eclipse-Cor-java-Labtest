package com.Question3;

public class Author extends Book
{
	private  String authorName;
	private int lunchYear;
	private String publication;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String authorName, int lunchYear, String publication) {
		super();
		this.authorName = authorName;
		this.lunchYear = lunchYear;
		this.publication = publication;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getLunchYear() {
		return lunchYear;
	}
	public void setLunchYear(int lunchYear) {
		this.lunchYear = lunchYear;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", lunchYear=" + lunchYear + ", publication=" + publication + "]";
	}
	
	
	
}
