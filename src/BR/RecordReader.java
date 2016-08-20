package BR;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Actually reads in  and writes the record of books
 * So all the scanner stuff
 * 
 * @author Jana
 *
 */
public class RecordReader {
	//Lets see what do we need?
	//probably need to create the BookList Here
	BookList list;
	
	/**The constructor**/
	public RecordReader(){
		//make my list
		list = new BookList();
		File bookFile = new File("Books.csv");
		readRecordIn(bookFile);
		
		
		
	}
	
	public void readRecordIn(File bookFile){
		try {
			Scanner s = new Scanner(bookFile);
			if (s.hasNextLine()){
				Scanner line = new Scanner(s.nextLine());
				String splitBy = ",";
				line.useDelimiter(splitBy);
				//read in the title
				String booktitle = "";
				if(line.hasNext()){
					booktitle = line.next();
				}
				//read in the author
				String author = "";
				if(line.hasNext()){
					author = line.next();
				}
				//read in the number of pages
				int pages = 0;
				if(line.hasNextInt()){
					pages = line.nextInt();
				}
				Calendar begin;
				if(line.hasNext()){
					//begin = new Calendar();
				}
				//Book(String title, String author, int pages, Calendar beginDate, Calendar endDate, String mediatype){
				//Book book = new Book();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateRecord(){
		
	}
	
	
}
