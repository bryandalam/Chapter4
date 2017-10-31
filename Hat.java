

public class Hat
{
    private String brand;
    private int cost;
    
    public Hat(String brd, int ct)
    {
        this.brand = brd;
        this.cost = ct;
        
    }
    public String getBrand() {
        return this.brand;
    }
    public String toString() {
        return "The brand of hat is: " + brand;
    }
    

    
}
