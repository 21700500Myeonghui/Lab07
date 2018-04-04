package edu.handong.csee.java.lab07.prob2;//Instructs the Chicken class to be complied and stored in edu.handong.csee.java.lab07.prob2

/**
 * This class defines a Chicken object
 * The Chicken class has name, price, stars members
 * The Chicken class has get_name(), get_price(), get_stars(), set_name(), set_price(), set_stars(), main() methods
 * The Chicken class has two constructor
 * @author Lee MyeongHui
 * @version java version "9.0.4" 
 *
 */
public class Chicken {

	private String name;//Create String type Instance variable name
	private double price;//Create double type Instance variable price
	private int stars;//Create integer type Instance variable stars

	/**
	 * This is constructor for initializing object
	 * constructor without parameter
	 */
	public Chicken () 
	{
		name="";//put a blank space in name
		price=0.0;//put 0.0 in price 
		stars=0;//put 0 in stars
	}

	/**
	 * This is constructor for initializing object
	 * constructor with parameter
	 * @param name, it is String type
	 * @param price, it is double type
	 * @param stars, it is integer type
	 */
	public Chicken(String name, double price, int stars)
	{
		this.name=name;//put the parameter name into the member variable name, 'this' is a reference to the object itself
		this.price=price;//put the parameter price into the member variable price, 'this' is a reference to the object itself
		this.stars=stars;//put the parameter stars into the member variable stars, 'this' is a reference to the object itself
	}

	/**
	 * This is a method for getting name
	 * @return Returns member variable name of the object to which the currently executing method belongs, it is String type
	 */
	public String get_name()
	{
		return this.name;//Returns member variable name of the object to which the currently executing method belongs
	}

	/**
	 * This is a method for getting price
	 * @return Returns member variable price of the object to which the currently executing method belongs, it is a double type
	 */
	public double get_price()
	{
		return this.price;//Returns member variable price of the object to which the currently executing method belongs
	}
	/**
	 * This is a method for getting stars
	 * @return Returns member variable stars of the object to which the currently executing method belongs, it is integer type
	 */
	public int get_stars()
	{
		return this.stars;//Returns member variable stars of the object to which the currently executing method belongs
	}
	/**
	 * This is a method for setting name
	 * @param name, it is String type
	 */
	public void set_name(String name)
	{
		this.name=name;//put the parameter name into the member variable name, 'this' is a reference to the object itself
	}

	/**
	 * This is a method for setting price
	 * @param price, it is double type
	 */
	public void set_price(double price)
	{
		this.price=price;//put the parameter price into the member variable price, 'this' is a reference to the object itself
	}

	/**
	 * This is a method for setting stars
	 * @param stars, it is integer type
	 */
	public void set_stars(int stars)
	{
		this.stars=stars;//put the parameter stars into the member variable stars, 'this' is a reference to the object itself
	}

}
