package com.codingassign_2;

import java.util.Scanner;

public class SortingOperations {
	
	double[] ar;
	boolean ar1[];
	int n;// n is the no of companies.
	boolean status;
	int count1=0,count2=0;
	Scanner sc = new Scanner(System.in);
	
	public void displayValues(double array[]) {
		for (double A:array) {
			System.out.print(A+" ");
		}
		System.out.println();
	}
	
	public void ascmerge(double arr[],int low,int mid,int high) {
		int len1 =mid-low+1;
		int len2 = high-mid;
		double leftarr[]=new double[len1];
		double rightarr[]=new double[len2];
		for(int i=0;i<len1;i++) {
			leftarr[i]=arr[low+i];
		}
		for(int j=0;j<len2;j++) {
			rightarr[j]=arr[mid+1+j];
		}
		int i,j,k;
		i=0;j=0;k=low;
	    while (i<len1 && j<len2) {
	    	if (leftarr[i]<=rightarr[j]) {
	    		arr[k]=leftarr[i];
	    		i++;
	    	}
	    	else {
	    		arr[k]=rightarr[j];
	    		j++;
	    	}
	    	k++;
	    }
	    while(i<len1) {
	    	arr[k]=leftarr[i];
	    	i++;k++;
	    }
	    while(j<len2) {
	    	arr[k]=rightarr[j];
	    	j++;k++;
	    }
	}
	public void decmerge(double arr[],int low,int mid,int high) {
		int len1 =mid-low+1;
		int len2 = high-mid;
		double leftarr[]=new double[len1];
		double rightarr[]=new double[len2];
		for(int i=0;i<len1;i++) {
			leftarr[i]=arr[low+i];
		}
		for(int j=0;j<len2;j++) {
			rightarr[j]=arr[mid+1+j];
		}
		int i,j,k;
		i=0;j=0;k=low;
	    while (i<len1 && j<len2) {
	    	if (leftarr[i]>=rightarr[j]) {
	    		arr[k]=leftarr[i];
	    		i++;
	    	}
	    	else {
	    		arr[k]=rightarr[j];
	    		j++;
	    	}
	    	k++;
	    }
	    while(i<len1) {
	    	arr[k]=leftarr[i];
	    	i++;k++;
	    }
	    while(j<len2) {
	    	arr[k]=rightarr[j];
	    	j++;k++;
	    }
	}
	public void ascmergesortimpl(double arr[],int l, int h) {
		if(l<h) {
			int	mid = (l+h)/2;
			ascmergesortimpl(arr,l,mid);
			ascmergesortimpl(arr,mid+1,h);
			ascmerge(arr,l,mid,h);
			}
		
	}
	public void decmergesortimpl(double arr[],int l, int h) {
		if(l<h) {
			int	mid = (l+h)/2;
			decmergesortimpl(arr,l,mid);
			decmergesortimpl(arr,mid+1,h);
			decmerge(arr,l,mid,h);
			}
		
	}
	public void userinput() {
		System.out.println("Please input the stock information now.");
		System.out.println("Please enter for how many companies you want to enter the stock info.");
		n=sc.nextInt();
		ar = new double[n];
		ar1 = new boolean[n];
		for (int i=0;i<n;i++) {
			int j=i+1;
			System.out.println("Enter current stock price of the company "+j);
			ar[i]=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			System.out.println("Please enter 'true' or 'false' only.");
			boolean r = sc.nextBoolean();
			ar1[i]=r;
			if(r==true) {
				count1++;
			}
			else if (r==false) {
				count2++;
			}
			else {
				System.out.println("please enter a correct value.");
				i--;
			}
		}
	}
	public void pricesRose() {

		System.out.println("Total no of companies whose stock price rose today : "+count1);
	}
	public void pricesDeclined() {
		
		System.out.println("Total no of companies whose stock price declined today : "+count2);
	}
	public void ifPresent() {
		System.out.println("enter a key value");
	    status=false;
		double d =sc.nextDouble();
		for (int i=0;i<ar.length-1;i++) {
			if(d==ar[i]) {
				status = true;
			}
		}
		if (status==true) {
			System.out.println("Stock of value "+d+" is present.");
		}
		else {
			System.out.println("Value not found.");
		}
	}
	
	
}
