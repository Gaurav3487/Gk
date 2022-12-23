package com.test.atm;

import java.util.Scanner;

public class Atm {
	
	
	
		
		
		public static void main(String[]args) {
			 System.out.println("Welcome to Axis Bank Atm");
			  Scanner scanner= new Scanner(System.in);
			  
			  System.out.println("Select option");
			  System.out.println("1.  Cash withdrawl");
			  System.out.println("2.  Check balance");
			  System.out.println("3. Deposit money");
			  System.out.println("4. Pin change");
			  int op=scanner.nextInt();
			  System.out.println("You selected option" +op);
			  
			  switch(op) {
			  
			  case 1:
				  AtmMethods am= new AtmMethods();
				  am.withdrawAmount();
			  break;
			  
			  case 2:
				  AtmMethods am1= new AtmMethods();
				  am1.checkBalance();
				  break;
				  
			  case 3:
				  AtmMethods am2= new AtmMethods();
				  am2.depositMoney();
				  
			  case 4:
				  AtmMethods am3= new AtmMethods();
				  am3.pinChange();
			  }
			
			
		}}
	 