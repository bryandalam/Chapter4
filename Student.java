
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
   private int idNumber;
   private String name;
   private Student bestFriend;
   private Pet pete;
   private Hat g;
   
    
   public Student (int num, String nm) {
       this.idNumber = num;
       this.name = nm;
    }
   public String getName() {
       return this.name;
    }
    public int combineIDs() {
        return this.idNumber + bestFriend.idNumber;
    }
    public Student makeStudent() {
        Student joe = new Student(this.idNumber, bestFriend.name);
        return joe;
    }
    public String toString() {
        return "The student name is: " + this.name;
    }
}
