package LibraryWork;

public class Author
{
    private String name;
    private int age;
    public Author(String nm, int ag)
    {
        // initialise instance variables
        this.name = nm;
        this.age = ag;
        
    }
    public String toString() {
        return "The author's name is: " + name + " and their age is: " + age;
    }
        
    
}
