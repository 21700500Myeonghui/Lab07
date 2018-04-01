package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

public class YearToCentury {
	int year;
	int century;

	public YearToCentury() {
		year=0;
		century=0;
	}
	
	public void yearInput(int year)
	{
		this.year=year;
	}
	
	public void calculateCentury()
	{
		century=((year-1)/100)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		Scanner keyboard = new Scanner(System.in);
		
		YearToCentury ytc = new YearToCentury();
		
		System.out.println("year input:");
		year=keyboard.nextInt();
		
		ytc.yearInput(year);
		ytc.calculateCentury();
		
		System.out.println(ytc.year+" is "+ytc.century+" century");
		keyboard.close();
	}

}
