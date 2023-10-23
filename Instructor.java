/**
   An instructor is represented by a name, a birth year, and a salary.
   You must enter the class name, instance variable(s), and constructor below
*/
public class Instructor extends Person{
	//Vincent Macri
	//CS 176
	//Person
private int salary;

	public Instructor(String name, int birthYear, int salary) {
		super(name, birthYear);
		this.salary = salary;
	}
   /**
      Returns the string represention of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }
}