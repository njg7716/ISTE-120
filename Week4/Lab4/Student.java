/**
 * Student class ... model a single student
 * @author Pete Lutz
 * @version 1.0
 */
public class Student {
	// attributes of a Student
	private String firstName;
	private String lastName;
	private int studentId;
	private double gpa;
   
   /**
    * Student constructor.
    * @param _fName student's first name
    * @param _lName student's last name 
    * @param _id student's id number
    * @param _gpa students GPA
    */
	public Student(String _fName, String _lName, int _id, double _gpa) {
		firstName = _fName;
		lastName = _lName;
		studentId = _id;
		gpa = _gpa;
	}
   
   /**
    * getFirstName - Accessor for first name
    * @return the student's first name
    */
 	public String getFirstName() {
		return firstName;
	}
   
   /**
    * getLastName - Accessor for last name
    * @return the student's last name
    */
	public String getLastName() {
		return lastName;
	}
   
   /**
    * getId - Accessor for ID
    * @return the student's ID
    */
	public int getStudentId() {
		return studentId;
	}
   
   /**
    * getGpa - Accessor for gpa
    * @return the student's gpa
    */
	public double getGpa() {
		return gpa;
	}

   /**
    * setFirstName - Mutator for first name
    * @param the new first name
    */
	public void setFirstName(String _fName) {
		firstName = _fName;
	}
   
   /**
    * setLastName - Mutator for last name
    * @param the new last name
    */
	public void setLastName(String _lastName) {
		lastName = _lastName;
	}
   
   /**
    * setStudentId - Mutator for ID
    * @param the new ID
    */
	public void setStudentId(int _id) {
		studentId = _id;
	}
   
   /**
    * setGpa - Mutator for gpa
    * @param the new gpa
    */
	public void setGpa(double _gpa) {
		gpa = _gpa;
	}
   
   public String toString(){
      String s = lastName + ", " + firstName + "\nID: " + getStudentId() + " GPA: " + String.format("%6.2f", gpa);
      return s;
   }
}