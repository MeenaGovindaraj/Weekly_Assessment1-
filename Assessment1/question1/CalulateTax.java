package com.tax;

import java.util.Scanner;

class Tax
{
	double income;
	String gender;
	int year;
	double calTax=0;

	public void getTax()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Income:");
		income=s.nextDouble();
		System.out.println("Enter Gender");
		gender=s.next();
		System.out.println("Enter year");
		int year=s.nextInt();
		
		if(year==2011 || year==2012 ){
		if(gender.equals("women"))
		{
			if(income>0 && income<=190000)
				System.out.println("No Tax");
			else if(income>190001 && income<=500000){
				calTax=0.1*income;
				System.out.println("Tax:" +calTax);
			}
			else if(income>500001 && income<=800000){
				calTax=0.2*income;
				System.out.println("Tax:" +calTax);
			}
			else {
				calTax=0.3*income;
				System.out.println("Tax:" +calTax);
			}
		}
		}
		
		else{
		if(gender.equals("general") || gender.equals("women"))
		{
			if(income>0 && income<=180000)
				System.out.println("No Tax");
			else if(income>180001 && income<=500000){
				calTax=0.1*income;
				System.out.println("Tax:" +calTax);
			}
			else if(income>500001 && income<=800000){
				calTax=0.2*income;
				System.out.println("Tax:" +calTax);
			}
			else {
				calTax=0.3*income;
				System.out.println("Tax:" +calTax);
			}
			
		}
		}
		

		 
		
	}
}
public class CalulateTax {

	public static void main(String[] args) {
		
		Tax t=new Tax();
		t.getTax();

	}

}
