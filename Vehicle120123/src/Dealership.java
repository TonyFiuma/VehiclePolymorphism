

public class Dealership{
    private final ISalable[] inventory;
    public Dealership(){
        inventory = new ISalable[2];
        inventory[0] = new Car();
        inventory[1] = new Motorcycle();
    }

    public void priceList(){
        for(ISalable single:inventory){
            System.out.println("Price: "+single.price());
        }
    }
}
