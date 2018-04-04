package edu.handong.csee.java.lab07.prob3;//Instructs the Attendance class to be complied and stored in edu.handong.csee.java.lab07.prob3

/**
 * This class defines a Attendance object
 * The Attendance class has name, grade, id, absent members
 * The Attendance class has get_name(), get_grade(), get_id(), get_absent(), set_name(), set_id(), set_grade(),set_absent(), failorpass(), main() methods
 * This class has two constructors
 * @author Lee MyeongHui
 * @version java version "9.0.4" 
 *
 */
public class Attendance {
	private String name;//Create String type Instance variable name
	private int grade;//Create integer type Instance variable grade
	private String id;//Create String type Instance variable id
	private int absent;//Create integer type Instance variable absent

	/**
	 * This is constructor for initializing object
	 * constructor without parameter
	 */
	public Attendance()
	{
		name="NULL";//put a blank space in name
		grade=0;//put 0 in grade
		id="NULL";//put a blank space in id
		absent=0;//put 0 in absent
	}
	/**
	 * This is constructor for initializing object
	 * constructor with parameter
	 * @param name, it is String type
	 * @param grade,it is integer type
	 * @param id, it is String type
	 * @param absent, it is integer type
	 */
	public Attendance(String name, int grade, String id, int absent)
	{
		this.name=name;//put the parameter name into the member variable name, 'this' is a reference to the object itself
		this.grade=grade;//put the parameter grade into the member variable grade, 'this' is a reference to the object itself
		this.id=id;//put the parameter id into the member variable id, 'this' is a reference to the object itself
		this.absent=absent;//put the parameter absent into the member variable absent, 'this' is a reference to the object itself
	}
	/**
	 * This is a method for getting name
	 * @return Returns member variable name of the object to which the currently executing method belongs, it is String type
	 */
	public  String get_name()
	{
		return this.name;//Returns member variable name of the object to which the currently executing method belongs
	}

	/**
	 * This is a method for getting grade
	 * @return Returns member variable grade of the object to which the currently executing method belongs, it is integer type
	 */
	public int get_grade()
	{
		return this.grade;//Returns member variable grade of the object to which the currently executing method belongs
	}

	/**
	 * This is a method for getting id
	 * @return Returns member variable id of the object to which the currently executing method belongs, it is String type
	 */
	public String get_id()
	{
		return this.id;//Returns member variable id of the object to which the currently executing method belongs
	}
	/**
	 * This is a method for getting absent
	 * @return Returns member variable absent of the object to which the currently executing method belongs, it is integer type
	 */
	public int get_absent()
	{
		return this.absent;//Returns member variable absent of the object to which the currently executing method belongs
	}
	/**
	 * This is method for setting name
	 * @param name, it is String type
	 */
	public void set_name(String name)
	{
		this.name=name;//put the parameter name into the member variable name, 'this' is a reference to the object itself
	}
	/**
	 * This is method for setting grade
	 * @param grade, it is integer type
	 */
	public void set_grade(int grade)
	{
		this.grade=grade;//put the parameter grade into the member variable grade, 'this' is a reference to the object itself
	}
	/**
	 * This is method for setting id
	 * @param id, it is String type
	 */
	public void set_id(String id)
	{
		this.id=id;//put the parameter id into the member variable id, 'this' is a reference to the object itself
	}
	/**
	 * This is method for setting absent
	 * @param absent, it is integer type
	 */
	public void set_absent(int absent)
	{
		this.absent=absent;//put the parameter absent into the member variable absent, 'this' is a reference to the object itself
	}
	/**
	 * This is method for determining fail or pass
	 */
	public void failorpass()
	{
		if(absent>6)//If the value of the member variable absent is greater than 6
		{
			System.out.println("I'm sorry, "+name+". You failed this course");//Outputs "I'm sorry, <value of member variable name in the object to which the currently executing method belongs>. You failed this course"
			System.out.println(name+"-Number of absence: "+absent);//Outputs <value of member variable name in the object to which the currently executing method belongs>-Number of absence: value of member variable absent in the object to which the currently executing method belongs>"
		}
		else//If the member variable absent is less than or equal to 6
			System.out.println("We'll see about the grade "+name);//Outputs "We'll see about the grade <value of member variable name in the object to which the currently executing method belongs>" 
	}


}
