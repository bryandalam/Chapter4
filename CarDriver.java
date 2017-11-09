

public class CarDriver
{
    
    public static void main(String[] args) 
    {
        Car myCar = new Car("Toyota", 4);
        Car yourCar = new Car("Toyota", 3);
        System.out.println(myCar);
        System.out.println(myCar.equals(yourCar));
        
    }

    
}
