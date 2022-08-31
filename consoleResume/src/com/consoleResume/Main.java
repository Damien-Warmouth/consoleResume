package com.consoleResume;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		// consoleAscii consoleAscii = new consoleAscii();

		AboutMe about = new AboutMe();
		about.Start();
	}
}

class AboutMe{
	
	public void Start()  throws IOException, InterruptedException  {
		// Start of application
		System.out.println("\r\n");
		System.out.println("Welcome to my console resume programmed in Core Java!\r\n");
		System.out.println("\r\n");
		System.out.println("=======================================================\r\n");
		System.out.println("THIS WAS MADE WITH WINDOWS COMMAND PROMPT USAGE IN MIND\r\n");
		System.out.println("=======================================================\r\n");
		System.out.println("PLEASE FULLSCREEN THE CONSOLE\r\n");
		System.out.println("=======================================================\r\n");
		System.out.println("\r\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("To get started please press Y");
		String y = scanner.nextLine();	
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		do {
			
			if(y.equalsIgnoreCase("Y")) {
				
				char options = '\0';
				
				System.out.println("My name is Damien Warmouth.\r\n");
				System.out.println("What would you like to know?\r\n");
				Scanner x = new Scanner(System.in);
				String text = "I would like to find a career that will allow me the opportunity to continue growing and developing skills within the Software Development field. I am a self starter with an excellent work ethic, looking for a position where I can apply all my skills in a Full Stack Development setting and be an proficient and efficient asset to the company."
						+"I started working with computers when I was around 7 and started building my own around 13, with already having the knowledge and experience directly putting me into a Vice Presidential role in the Archeology and Astronomy Club at my high school in my Sophomore year. In that year I was Co-leading and managing an Underwater Robotics project with a team of 7."
						+"During a hiatus of hardware oriented skill development after High School I started diving into a less hardware focused projects onto a more of a software focused skill developmental period where I am currently at in life after completing an Apprentice Now Internship learning to develop with a Full Stack Java concentrated environment."
						+"Now, I am looking for a position to fulfill the desire of furthering my programming skills and knowledge and to provide for my family and friends."
						+"Please feel free to reach out with any questions about me or how I might be an asset to your company";
				
				do {
					
					System.out.println("A: About Me");
					System.out.println("B: Job History");
					System.out.println("C: Skills");
					System.out.println("D: Education");
					System.out.println("E: Links");
					System.out.println("F: Ascii Self-portrait\r\n");
					System.out.println("==============================================================");
					System.out.println("Please enter a letter according to the menu to see information.");
					System.out.println("==============================================================");
					options = x.next().charAt(0);
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("\r\n");
					
							switch(options) {
							case 'A' :
							case 'a' :
								
								//FIXME: Using MVN word-wrap dependency. Not yet working.
								System.out.println(WordWrap.from(text).maxWidth(100).wrap());
								
								System.out.println("IS WILLING TO RELOCATE: True\r\n");
								System.out.println("==============================================================");
								break;
								
							case 'B':
							case 'b':
								System.out.println("POSITION: Apprentice Now Java Full Stack Internship\r\n"
										+ "COMPANY NAME: Apprentice Now\r\n"
										+ "LENGTH: Jun 2022 - Aug 2022 · 3 mos\r\n"
										+ "LOCATION: Dothan, Alabama, United States\r\n"
										+ "JOB DESCRIPTION: Learned multiple skills in Core Java, SQL, HTML/CSS/JS, MongoDB, Spring Boot + MORE\r\n");
								System.out.println("=========================================================================================================================");
								System.out.println("POSITION: Billing Officer\r\n"
										+ "COMPANY NAME: OfficeMax · FULL-TIME\r\n"
										+ "LENGTH: Mar 2020 - Nov 2018 · 1yr 4mos\r\n"
										+ "LOCATION: Dothan, Alabama, United States\r\n"
										+ "JOB DESCRIPTION: · Data entry for clients medical and insurance information in Microsoft Excel.\r\n"
														 + "· Billed clients for service and their insurance information\r\n"
														 + "· Posted and balanced amounts in job's specific program along with Microsoft Excel\r\n"
														 + "· Learned and utilized medical codes\r\n"
														 + "· 1 year+ of Data Entry Experience\r\n"
														 + "· Help customers check in to see the doctor and out\r\n"
														 + "· Answered customers questions about specifics with their medical health, insurance, and general asked questions about the company.\r\n");
								System.out.println("=========================================================================================================================");
								System.out.println("POSITION: Retail Floor Assistant\r\n"
										+ "COMPANY NAME: OfficeMax · PART-TIME\r\n"
										+ "LENGTH: Aug 2018 - Nov 2018 · 4 mos\r\n"
										+ "LOCATION: Dothan, Alabama, United States\r\n"
										+ "JOB DESCRIPTION: I stocked products, cleaned the store, helped customers with whatever they needed, then sometimes checked the customers out.\r\n");
								break;
							
							case 'C':
							case 'c':
								System.out.println("\r\n "
										+ "PROGRAMMING\r\n "
										+ "================================================\r\n "
										+ "· HTML - ★★☆☆☆\r\n "
										+ "· Cascading Style Sheets (CSS) - ★☆☆☆☆\r\n "
										+ "· Core Java - ★☆☆☆☆\r\n "
										+ "· JavaScript - ★☆☆☆☆\r\n "
										+ "· Spring Boot - ★☆☆☆☆\r\n "
										+ "· Spring Framework - ★☆☆☆☆\r\n "
										+ "· NoSQL - ★☆☆☆☆\r\n "
										+ "· MongoDB - ★☆☆☆☆\r\n "
										+ "· AngularJS - ★☆☆☆☆\r\n "
										+ "· React.js - ★☆☆☆☆\r\n "
										+ "· Git - ★☆☆☆☆\r\n "
										+ "· GitHub - ★☆☆☆☆\r\n "
										+ "· TypeScript - ★☆☆☆☆\r\n "
										+ "· JSON - ★☆☆☆☆\r\n "
										+ "· MySQL - ★☆☆☆☆\r\n "
										+ "· SQL - ★☆☆☆☆\r\n "
										+ "· jQuery - ★☆☆☆☆\r\n "										
										+ "· AJAX - ★☆☆☆☆\r\n "
										+ "================================================\r\n"
										+ "\r\n"
										+ "\r\n"
										+ "\r\n "
										+ "OTHER SKILLS\r\n "
										+ "================================================\r\n "
										+ "· High Level Of Accuracy - ★★★☆☆\r\n "
										+ "· Customer Service - ★★★★☆\r\n "
										+ "· Data Entry - ★★★☆☆\r\n "
										+ "· Client Billing - ★★★☆☆\r\n "
										+ "· Microsoft Office - ★★★★★\r\n "
										+ "· E-invoicing - ★☆☆☆☆\r\n "
										+ "· Billing Process - ★☆☆☆☆\r\n "
										+ "· Medical Billing - ★☆☆☆☆\r\n "
										+ "· Medical Coding - ★☆☆☆☆\r\n "
										+ "· Cash Management - ★★★★☆\r\n "
										+ "· Accounts Payable - ★★☆☆☆\r\n "
										+ "· Accounts Receivable (AR) - ★★★☆☆\r\n "
										+ "· Microsoft Excel - ★★☆☆☆\r\n "
										+ "· Invoicing - ★☆☆☆☆\r\n "
										+ "· Health Insurance - ★☆☆☆☆"
										);
								System.out.println("==============================================================\r\n");
								break;
							case 'D':
							case 'd':
								
								System.out.println("\r\n "
										+"-----------------------------------------------------\r\n "
										+"Woz U\r\n "
										+"Java Full Stack Certification, Computer Science\r\n "
										+"Jun 2022 - Aug 2022\r\n "
										+"-----------------------------------------------------\r\n "
										+"Wallace Community College\r\n "
										+"Uncompleted Associates Degree, Computer Science\r\n "
										+"Aug 2015 - May 2017\r\n "
										+"-----------------------------------------------------\r\n "
										+"Dale County High School\r\n "
										+"Aug 2013 - Mar 2017\r\n "
										+"-----------------------------------------------------\r\n ");
								System.out.println("==============================================================\r\n");

								break;
								
							case 'E':
							case 'e':
								break;
								
							case 'F':
							case 'f':
								consoleAscii ascii = new consoleAscii();
								ascii.methoConsoleAscii();
								System.out.println("\r\n");
								System.out.println("==============================================================\r\n");
								break;
							
							default:
								System.out.println("That is not a valid option. Please try again!");
								break;
							
							}
						}while(options != 'G' || options != 'g');
				
			}
			else if(!y.equalsIgnoreCase("Y")){
				System.out.println("You did not press 'Y'\r\n");
				System.out.println("If you want to proceed press 'Y' if not, press 'N' to close the application.");
				y = scanner.nextLine();
				
			}
			
			else if(!y.equalsIgnoreCase("N") || !y.equalsIgnoreCase("Y")){
				System.out.println("Please choose 'Y' or 'N'");
				y = scanner.nextLine();
			}
			else if(y.equalsIgnoreCase("N")){
				break;
			}
		}while(!y.equalsIgnoreCase("N"));
	}
}