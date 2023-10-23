/**
   A person is represented by the name and a birth year.
   You must enter the class name, instance variable(s), and constructor below
*/


public class Person{
	
//Vincent Macri
//CS 176
//Person
	
/**
      Returns the string representation of the object.
      @return a string representation of the object
*/
private String name;
private int birthYear;

	public Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
		
	}
	
    public String toString()
    {
       return "Person[name=" + name + ",birthYear=" + birthYear + "]";
    }
}