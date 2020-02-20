
public class TestStudentRecord{
   
   public static void main(String[] args){
      Student barbStu = new Student("Barbara", "Bluestone", 23686, 2.8);
      Address barbAddr = new Address("Main St.", "Any Town", "NY", 14539);
      StudentRecord barb = new StudentRecord(barbStu, barbAddr);
      StudentRecord mat = new StudentRecord("Matthew", "Broerick", 39872, 3.5, "34 Worsted Pl", "NoPlaceVille", "UT", 29873);
      System.out.println(barb + "\n");
      System.out.println(mat);
   }
}