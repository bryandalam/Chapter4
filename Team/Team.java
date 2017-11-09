package Team;



public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    Athlete[] players;
    
    public Team(String nme, int size)
    {
        // initialise instance variables
        this.teamName = nme;
        this.players = new Athlete[size];
    }
    public void addTeam(int index, Athlete a) {
        players[index] = a;
    }
    public String toString() {
        String output = "The team " + teamName + " has the following athletes:\n";
        for(Athlete a : players) {
            output += a + "\n";
        }
        return output;
    }

    
}
