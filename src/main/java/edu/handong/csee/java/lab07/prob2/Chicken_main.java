package edu.handong.csee.java.lab07.prob2;//Instructs the Chicken class to be complied and stored in edu.handong.csee.java.lab07.prob2

/**
 * This class defines a Chicken_main object
 * The Chicken_main class has main() methods
 * @author LeeMyeonghui
 * @version java version "9.0.4"
 */
public class Chicken_main {

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
