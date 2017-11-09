
import java.util.Scanner;

public class TestNames
{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the first person's first name?");
    Name joe = new Name("Joe", "Mack", "Johnson");
    joe.getFirst();
    joe.getMiddle();
    joe.getLast();
    System.out.println(joe.firstMiddleLast());
    System.out.println(joe.lastFirstMiddle());
    
    
        
        
        
    }
}
