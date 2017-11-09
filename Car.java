

public class Car
{
    public String type;
    public int numWheels;

    
    public Car(String tpe, int whll)
    {
        this.type = tpe;
        this.numWheels = whll;
    }
    public String getName() {
        return this.type;
    }
    public String toString() {
        return "The the type of car is: " + this.type;
    }
    public boolean equals(Car other) {
        if(this.type.equals(other.type) && this.numWheels == other.numWheels) {
            return true;
        }
        else { 
            return false;
        }
    }

    
}

