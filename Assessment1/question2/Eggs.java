package com.eggs;

import java.util.Scanner;

public class Eggs {

	int neggs;
	int gross, dozens, remaining;
	Scanner sc = new Scanner(System.in);

	public void noOfEggs() {
		
		System.out.println("Enter no of eggs U have");
		
		neggs = sc.nextInt();

		gross = neggs / 144;

		dozens = (neggs % 144) / 12;

		remaining = (neggs % 144) % 12;

		System.out.println("Your number of eggs is " + gross + " gross " + dozens + " dozen, and " + remaining);
	}

	public static void main(String[] args) {

		Eggs e = new Eggs();
		e.noOfEggs();
	}

}
