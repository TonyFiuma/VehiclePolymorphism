public class Car extends Vehicle implements ISalable{
    @Override
    public void accelerate(){
        System.out.println("The car accelerates");
    }

    @Override
    public void brake(){
        System.out.println("The car brakes");
    }

    @Override
    public double price(){
        return 18000;
    }
}
