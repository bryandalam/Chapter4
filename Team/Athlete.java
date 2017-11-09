package Team;



public class Athlete
{
    private String name;
    private int age;
    
    public Athlete(String nm, int ag)
    {
        // initialise instance variables
        this.name = nm;
        this.age = ag;
    }
    public boolean equals(Athlete other) {
      if (this.name.equals(other.name) && this.age == other.age) {
          return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        return "The athelete's name is " + name + " and they are " + age + " years old.";
    }

}
