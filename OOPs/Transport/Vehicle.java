public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    Vehicle(){
        this.model = "";
        this.name = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres){
        this.model = model;
        this.name = name;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.println("Engine is starting of "+name +" : "+model);
    }

    void stopEngine(){
        System.out.println("Engine is stoping of "+name +" : "+model);
    }
}