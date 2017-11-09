
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    String name;
    int Score1;
    int Score2;
    int average;
    Scanner scan = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Please enter " + name + "'s grade for test 1");
        this.Score1 = scan.nextInt();
        System.out.println("Please enter " + name + "'s grade for test 2");
        this.Score2 = scan.nextInt();
        
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public int getAverage()
    {
        //add body of getAverage
        this.average = ((this.Score1 + this.Score2)/2);
        return this.average;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    public void getName() 
    {
        //add body of getName
        System.out.println("What is the student's name?");
        name = scan.next();
    }
        
    
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    public void printName() 
    {
        //add body of printName
        System.out.println(name);
    }
    public String toString() {
        return "Name: " + name + "\t" + "Test 1: " + Score1 + "\t" + "Test 2: " + Score2;
    }
}