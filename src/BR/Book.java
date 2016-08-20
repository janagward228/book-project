package BR;

import java.util.Calendar;

//the book class will define a book object
public class Book {
	//instances
	String title; //title
	String author; //author(s)
	int pages;//number of pages
	Calendar beginDate;//date begun I'm not sure how to set dates
	Calendar endDate;//date ended
	//media type
	public String mediaType;  //TODO: I think I might want to use an enum here bc I only want the types print and ebook
	
	//the constructor for all fields
	public Book(String title, String author, int pages, Calendar beginDate, Calendar endDate, String mediatype){
		this.title  = title;
		this.author = author;
		this.pages = pages;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.mediaType = mediatype;
	}
	//the constructor with only mandatory fields
	public Book(String title, String author, int pages){
			this.title  = title;
			this.author = author;
			this.pages = pages;
	}
	public String getTitle(String author){
		return title;
	}
	//TODO: Later you should add more getters and setters
	
	public String toString(){
		return "Title: "+title + "  Author: "+ author+"  Pages: "+pages+"  Began Reading: "+beginDate+"  Finished reading: "+ endDate+ "  Media type: "+mediaType;
	}
} 
