package com.heb.commons.test;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
@ImportResource("SpringBeans.xml")
public class AddSubject {

	public static void main(String[] args) {
		
		
		SpringApplication.run(AddSubject.class, args);
		
		int x = 0;
		   String choiceMenu;
		   Subject[] Subjects = new Subject[10]; 
		   Book[] books = new Book[5]; 
		                                         
		   Scanner input = new Scanner (System.in);
		   do{
		       System.out.println("\t\t");
		       System.out.println("\t\ta. Add Subject\t1b. Add Book\tc. Delete Subjects\td. Delete Book\te. Search Subject\tf. Search Book\tg. Exit");
		       System.out.println("Enter a choice: ");
		       choiceMenu = input.next();

		       if (choiceMenu.trim().equals("a")){
		           if(x < 10) { //Able to add new Subject.
		               System.out.println("subjectId:");
		               long subjectId = input.nextInt();    		                                              
		               System.out.println("subtitle:");
		               String subtitle = input.next();
		               System.out.println("durationInHours:");
		               int durationInHours = input.nextInt();
		               System.out.println("references:");
		               String references = input.next();
		              

		               //Create the new Subject using the given inputs
		               Subject s = new Subject(subjectId, subtitle, durationInHours);

		               //Place in array
		               Subjects[x] = s;

		               //Increment x for next Subject placement
		               x++;
		           } else {  //Not able to add new Subject
		               System.out.println("Can't add new Subject, Subjects full");
		           }
		       }
		       else  if (choiceMenu.trim().equals("b")){
		           if(x < 10) { //Able to add new Subject.		        	   
		        	
		               System.out.println("bookId:");
		               long bookId = input.nextInt();    		                                              
		               System.out.println("title:");
		               String title = input.next();
		               System.out.println("price:");
		               double price = input.nextInt();
		               System.out.println("publishdate:");
		               String publishdate = input.next();		              
		               System.out.println("volume:");
		               Integer volume = input.nextInt();
		               //Create the new Subject using the given inputs
		               Book book = new Book(bookId, title, price, volume, LocalDate.parse(publishdate));

		               //Place in array
		               books[x] = book;

		               //Increment x for next Subject placement
		               x++;
		           } else {  //Not able to add new Subject
		               System.out.println("Can't add new Subject, Subjects full");
		           }
		       }
		       else if (choiceMenu.trim().equals("e")){
		           for (int i=0; i<x; i++) {
		               Subject s = Subjects[i];
		               System.out.println(s.subjectId + s.getSubtitle() + s.getDurationInHours());
		                                      
		           }
		       }
		       
		   } while (choiceMenu.trim().equals("g"));

		  
		   input.close();
	}
}
