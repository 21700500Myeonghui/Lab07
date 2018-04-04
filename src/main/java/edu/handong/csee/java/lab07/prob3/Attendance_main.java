package edu.handong.csee.java.lab07.prob3;//Instructs the Attendance class to be complied and stored in edu.handong.csee.java.lab07.prob3

import java.util.Random;//importing a package, java.util.Random. A package is a kind of external objects created by other developer

/**
 * This class defines a Attendance_main object
 * The  Attendance_main class has main() methods
 * @author Lee MyeongHui
 * @version java version "9.0.4"
 *
 */
public class Attendance_main {

	/**
	 * This is main method that starts our program
	 * @param args, String arrays, called args, can be received as the method's factor values
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Attendance studentA = new Attendance ();//Instantiate of an object
		Attendance studentB = new Attendance ();//Instantiate of an object
		Attendance studentC = new Attendance ("Lucas",1,"21833222", 0);//Instantiate of an object, initialization name to "Lucas", grade to 1, and id to 21833222, and absent to 0 
		Attendance studentD = new Attendance ("Martha",2,"21733444", 0);//Instantiate of an object, initialization name to "Martha", grade to 2, and id to 21733444, and absent to 0

		studentA.set_name("Jess");//calling method set_name(String name) in studentA, Send 'Jess' as value of the parameter at this time
		studentA.set_grade(4);//calling method set_grade(int grade) in studentA, Send 4 as value of the parameter at this time
		studentA.set_id("21400999");//calling method set_id(String id) in studentA, Send '21400999' as value of the parameter at this time
		studentA.set_absent(0);//calling method set_absent(int absent) in studentA, Send 0 as value of the parameter at this time

		studentB.set_name("Kent");//calling method set_name(String name) in studentB, Send 'Kent' as value of the parameter at this time
		studentB.set_grade(2);//calling method set_grade(int grade) in studentB, Send 2 as value of the parameter at this time
		studentB.set_id("21700111");//calling method set_id(String id) in studentB, Send '21700111' as value of the parameter at this time
		studentB.set_absent(0);//calling method set_absent(int absent) in studentB, Send 0 as value of the parameter at this time



		Random randomGen = new Random();//Create an object of the Random class

		studentA.set_absent(randomGen.nextInt(10));//Create random number from 0 to 10, calling method set_absent(int absent) in studentA, Send the random number as value of the parameter at this time 
		studentB.set_absent(randomGen.nextInt(10));//Create random number from 0 to 10, calling method set_absent(int absent) in studentB, Send the random number as value of the parameter at this time 
		studentC.set_absent(randomGen.nextInt(10));//Create random number from 0 to 10, calling method set_absent(int absent) in studentC, Send the random number as value of the parameter at this time 
		studentD.set_absent(randomGen.nextInt(10));//Create random number from 0 to 10, calling method set_absent(int absent) in studentD, Send the random number as value of the parameter at this time 

		studentA.failorpass();//calling method failorpass() in studentA
		studentB.failorpass();//calling method failorpass() in studentB
		studentC.failorpass();//calling method failorpass() in studentC
		studentD.failorpass();//calling method failorpass() in studentD


	}

}
