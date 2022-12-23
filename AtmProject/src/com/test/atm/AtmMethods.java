package com.test.atm;

import java.util.Scanner;

public class AtmMethods {
	
	public void withdrawAmount() {
	int	currentBalance=10000;
	int pin=1234;
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Enter Pin");
	int enteredpin=scanner.nextInt();
	if(pin==enteredpin) {

		System.out.println("Enter amount ");
		int amount=scanner.nextInt();
	if(amount> currentBalance) {
		
		throw new InsufficientBalanceException("Insufficient Balance");
	} else {
		currentBalance= currentBalance -amount;
		System.out.println("your Remaining Balance is :" +currentBalance);
		
		System.out.println("Withdrawl successful");
	}		
	
		
		
	}
	}
	
	
	public void  checkBalance() {
	      int currentBalance=10000;
	      int pin=1234;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter pin");
		int Enteredpin=scanner.nextInt();
		if(pin==Enteredpin) {
			System.out.println("Your current Balance is :" +currentBalance);
			
		}else {
			throw new InvalidPinException("invalid pin");
		}
		
		
	
	
	}
	    public void depositMoney() {
	    	int currentBalance=10000;
	    	int pin=1234;
	    	Scanner scanner= new Scanner(System.in);
	    	
	    	
	    	
	    	System.out.println("Enter pin");
	    	int enteredpin=scanner.nextInt();
	    	
	    	if(pin==enteredpin) {
	    		System.out.println("Enter amount to be deposited");
		    	int depositamount= scanner.nextInt();
		    	
		    	System.out.println("Total amount :" + (currentBalance+depositamount));
	    		
	    	}else {
	    		
	    		throw new InvalidPinException("invalid pin");
	    	}
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    public void pinChange() {
	    	int pin=1234;
	    	System.out.println("Do you want to change your pin");
	    	System.out.println("Enter pin");
	    	Scanner scanner= new Scanner(System.in);
	    	int enteredpin=scanner.nextInt();
	    	if(pin==enteredpin) {
	    System.out.println("Enter the new pin");
	    int newpin=scanner.nextInt();
	    	
	    
	    System.out.println("your pin change suceessfully");
	    System.out.println("your new pin is :" +newpin);
	    }
	    }
	    public static void main(String[]args) {
	    	AtmMethods am= new AtmMethods();
	    	am.withdrawAmount();
	    	
	    }
	}


