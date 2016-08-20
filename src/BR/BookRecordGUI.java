package BR;


import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;

import javax.swing.*;

//this is where the interaction will take place
//I think I want a card layout with 1 welcome screen, 1 for fetching info, and 1 for entering info
public class BookRecordGUI extends JFrame{
	//instances
	JPanel welcome;
	JPanel enterNew;
	JPanel fetching;
	
	public BookRecordGUI(){
		//the basics
		super("Jana's Reading Record");
		setVisible(true);
		setLocation(100,100);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container god = this.getContentPane();
		god.setLayout(new CardLayout());
		//make my panels
		welcome = new JPanel();
		enterNew = new JPanel();
		fetching = new JPanel();
		
		setUpWelcomeFace(welcome);
		god.add(welcome);
	
		setUpEnterNewFace(enterNew);
		god.add(enterNew);
		
		setUpFetchingFace(fetching);
		god.add(fetching);
		
		welcome.setVisible(true);
		//somehow set it so the welcome part is what is showing...its already doing that
		
	}
	/**
	 * 
	 * @param a
	 */
	public void setUpWelcomeFace(Container a){
		a.setVisible(true);
		//a.setBackground(Color.BLUE);
		JLabel welMessage= new JLabel("Welcome to Jana's Reading record software!");
		a.add(welMessage);
		//I need buttons
		JLabel mes = new JLabel("Choose what you would like to do.");
		a.add(mes);
		JButton enterNewBook = new JButton("Enter a New Book");
		enterNewBook.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//switch the card view to enterNew panel
				a.setVisible(false);
				displayEnterNew();
			}
		});
		a.add(enterNewBook);
		JButton fetchRecords = new JButton("Fetch reading records");
		fetchRecords.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//switch the card view to fetching
				a.setVisible(false);
				displayFetching();
			}
		});
		a.add(fetchRecords);
		JButton exit1 = new JButton("Exit Program");
		exit1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		a.add(exit1);
	}
	/**
	 * 
	 * @param b
	 */
	public void setUpEnterNewFace(Container b){
		b.setVisible(true);
		JButton goToWelcome = new JButton("Home");
		goToWelcome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//switch the card view to enterNew panel
				b.setVisible(false);
				//setUpWelcomeFace(welcome);
				displayWelcome();
			}
		});
		b.add(goToWelcome);
		JLabel newBookMessage = new JLabel("Enter book information.");
		b.add(newBookMessage);
	}
	/**
	 * 
	 * @param c
	 */
	public void setUpFetchingFace(Container c){
		c.setVisible(true);
		
	}
	public void displayWelcome(){
		welcome.setVisible(true);
	}
	public void displayEnterNew(){
		enterNew.setVisible(true);
	}
	public void displayFetching(){
		fetching.setVisible(true);
	}
	
}
