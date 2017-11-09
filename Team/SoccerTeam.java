package Team;



public class SoccerTeam
{
   public static void main(String[] args) {
    Team soccer = new Team("Soccer", 25);
    Athlete joe = new Athlete("Joe", 23);
    Athlete ike = new Athlete("Ike", 911);
    soccer.addTeam(0, joe);
    soccer.addTeam(1, ike);
    System.out.println(soccer);
    System.out.println(joe.equals(ike));
    
   }
}

