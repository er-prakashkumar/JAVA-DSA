public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model,int noOfTyres, int noOfDoors, String transmissionType ){
        super(name,model,noOfTyres); // super() must be first statement in constructor body
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAC(){
        System.out.println("Ac started of "+ name);
    }
}