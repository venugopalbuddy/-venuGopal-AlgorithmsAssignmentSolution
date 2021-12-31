package com.codingassign_2;

import java.util.Scanner;

public class SortingOperationsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SortingOperations sor = new SortingOperations();
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to Stockers!");
       System.out.println("Please be ready with the stock information");
       sor.userinput();
      // double arr[]=sor.ar;
       int w=1;
      while(w==1) {
    	System.out.println("                                        ");
    	System.out.println("Enter the operation that you want to perform :");
    	System.out.println("1. Display the companies stock prices in ascending order");
  		System.out.println("2. Display the companies stock prices in descending order");
  		System.out.println("3. Display the total no of companies for which stock prices rose today");
  		System.out.println("4. Display the total no of companies for which stock prices declined today");
  		System.out.println("5. Search a specific stock price");
  		System.out.println("6. press 0 to exit");
    	  int input = sc.nextInt();
    	  
    	  switch (input) {
    	  case 0: System.out.println("Exited successfully");w=2;break;
    	  case 1:double arr[]=sor.ar; System.out.println("Stock prices in ascending order are :");
    		     sor.ascmergesortimpl(arr, 0, arr.length-1); sor.displayValues(arr);break;
    	  case 2:double arr1[]=sor.ar; System.out.println("Stock prices in decending order are :");
    		     sor.decmergesortimpl(arr1, 0, arr1.length-1);sor.displayValues(arr1); ;break;
    	  case 3: sor.pricesRose();break;
    	  case 4: sor.pricesDeclined();break;
    	  case 5: sor.ifPresent();break;
    	  case 6: System.out.println("Exited successfully");w=2;break; 
    	  default: System.out.println("you have entered an in valid option");break;
    	  }
      }
	}

}
