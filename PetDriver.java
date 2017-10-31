
/**
 * Write a description of class PetDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetDriver
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class PetDriver
     */
    public static void main()
    {
        Pet doug = new Pet("Doug", true);
        System.out.println(doug.getName());
        Pet mike = new Pet("Mike", true);
        System.out.println(doug.equals(mike));
        Pet.example();

        
    }

    
}
