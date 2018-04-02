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

	String name;//Create String type Instance variable name
	double price;//Create double type Instance variable price
	int stars;//Create integer type Instance variable stars

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

	/**
	 * This is main method that starts our program
	 * @param args, String arrays, called args, can be received as the method's factor values
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chicken menu1 = new Chicken("Cheese_mustard",16000.00,5);//Instantiate of an object, initialization name to "Cheese_mustard", price to 16000.00, and stars to 5
		Chicken menu2 = new Chicken("Honey_mustard",16000.00,5);//Instantiate of an object, initialization name to "Honey_mustard", price to 16000.00, and stars to 5
		Chicken menu3 = new Chicken("Spicey_chicken",16000.00,1);//Instantiate of an object, initialization name to "Spicey_chicken", price to 16000.00, and stars to 1

		menu1.set_stars(3);//calling method set_stars(int stars) in menu1, Send 3 as value of the parameter at this time
		menu2.set_stars(4);//calling method set_stars(int stars) in menu2, Send 4 as value of the parameter at this time.
		menu3.set_stars(1);//calling method set_stars(int stars) in menu3, Send 1 as value of the parameter at this time.

		System.out.println(menu1.get_name()+"'s rating is "+menu1.get_stars());//Outputs "<the return value of method get_name() in menu1>'s rating is <the return value of method get_stars() in menu1>
		System.out.println(menu2.get_name()+"'s rating is "+menu2.get_stars());//Outputs "<the return value of method get_name() in menu2>'s rating is <the return value of method get_stars() in menu2>
		System.out.println(menu3.get_name()+"'s rating is "+menu3.get_stars());//Outputs "<the return value of method get_name() in menu3>'s rating is <the return value of method get_stars() in menu3>
	}

}
