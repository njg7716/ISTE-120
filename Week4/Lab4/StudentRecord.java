
public class StudentRecord{
   private Student stu;
   private Address addr;
   
   public StudentRecord(Student stu, Address addr){
      this.stu = stu;
      this.addr = addr;
   }
   
   public StudentRecord(String _fName, String _lName, int _id, double _gpa, String street, String city, String state, int zip){
      this.stu = new Student(_fName, _lName, _id, _gpa);
      this.addr = new Address(street, city, state, zip);
   }
   
   public String toString(){
      String all = stu + "\n" + addr;
      return all;
   }
}