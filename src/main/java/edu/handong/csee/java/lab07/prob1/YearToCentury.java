package edu.handong.csee.java.lab07.prob1;//Instructs the YearToCentury class to be complied and stored in edu.handong.csee.java.lab07.prob1

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

/**
 * This class defines a YearToCentury object
 * The YearToCentury class has year, century members
 * The YearToCentury class has yearInput(), calculateCentury(), main() methods
 * this class has a constructor
 * @author Lee MyeongHui
 * @version java version "9.0.4" 
 */
public class YearToCentury{
	int year;//Create integer type Instance variable year
	int century;//Create integer type Instance variable century

	/**
	 * This is constructor for initializing object
	 * constructor without parameter
	 */
	public YearToCentury() {
		year=0;//put 0 in year
		century=0;//put 0 in century
	}

	/**
	 * This is a method to put the local variable year into the member variable year.
	 * @param year, it is integer type
	 */
	public void yearInput(int year)
	{
		this.year=year;//put the parameter year into the member variable year, 'this' is a reference to the object itself
	}

	/**
	 * This is a method for calculating century
	 */
	public void calculateCentury()
	{
		century=((year-1)/100)+1;//put value of the year that is a member variable minus one hundred times plus one in member variable century
	}

	/**
	 * This is main method that starts our program.
	 * @param args, String arrays, called args, can be received as the method's factor values.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;//Create integer type local variable year

		Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class

		YearToCentury ytc = new YearToCentury();//Instantiate of an object

		System.out.println("year input:");//Outputs the string literal "year input:"
		year=keyboard.nextInt();//Take one integer type from the keyboard and place it in the local variable year

		ytc.yearInput(year);//calling method yearInput(int year) in ytc
		ytc.calculateCentury();//calling method calculateCentury() in ytc

		System.out.println(ytc.year+" is "+ytc.century+" century");//Outputs "<the value of member variable year in ytc> is <the value of member variable century in ytc> century"
		keyboard.close();//Close Scanner object
	}

}
