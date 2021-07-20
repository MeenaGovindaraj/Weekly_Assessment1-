package com.assess4;

import java.util.Scanner;

import material.Accessories;
import material.Laptops;
import stock.Inventory;

public class Order {
	

	public void placeOrder(int i,int q)
	{
		if(i==1){
		if(Accessories.quantity> Accessories.lowOrderLevelQuantity && Accessories.quantity>q){
			
			System.out.println("**Invoice for Accessories**");
			System.out.println("The price for about "+q+" Accessories is:"+q*Accessories.getPrice());
			Accessories.quantity=Accessories.quantity-q;
		}
		else
			System.out.println("RequestForMaterial");
		}
		else if(i==2)
		{
			if(Laptops.quantity> Laptops.lowOrderLevelQuantity && Laptops.quantity>q){
				
				System.out.println("**Invoice for Laptops**");
				System.out.println("The price for about "+q+" Accessories is:"+q*Laptops.getprice());
				}
			else
				System.out.println("RequestForMaterial");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Order o=new Order();
		
		Accessories a[]=new Accessories[10];
		
		for(int i=0;i<10;i++)
			a[i]=new Accessories(i);
		
		System.out.println();
		System.out.println("Enter the Ur order option:"
				+ "\n1.Accessories"
				+ "\n2.Laptops"
				+ "\n3. Exit");
		int or=sc.nextInt();
		if(or==3){
			System.out.println("Exit!");
			System.exit(0);
		}
		System.out.println("enter the Quantity");
		int q=sc.nextInt();
		o.placeOrder(or,q);


		Inventory.quantity=0;
		
		Laptops L[]=new Laptops[5];
		for(int i=0;i<5;i++)
			L[i]=new Laptops(i);
		
		System.out.println();
		System.out.println("Enter the Ur order option:"
				+ "\n1.Accessories"
				+ "\n2.Laptops");
		or=sc.nextInt();
		System.out.println("enter the Quantity");
		q=sc.nextInt();
		o.placeOrder(or,q);
		
		
		
		
	}
}
