public class Motorcycle extends Vehicle implements ISalable{
    @Override
    public void accelerate(){
        System.out.println("The motorcycle accelerates");
    }

    @Override
    public void brake(){
        System.out.println("The motorcycle brakes");
    }

    @Override
    public double price(){
        return 10000;
    }
}
