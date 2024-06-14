// Define a class Engine with attributes horsePower and type. Define a class car
// with attributes make, model, and an engine object. Implement methods to display 
// car details, including engine specifications


class Engine{
    int horsePower;
    String type;

    public Engine(int horsePower, String type){
        this.horsePower = horsePower;
        this.type = type;
    }
    public void displayEngineDetails(){
        System.out.println("HorsePower: "+ this.horsePower);
        System.out.println("Type: "+ this.type);
    }
}
class Car{
    Engine eng;
    String make;
    String model;

    public Car(String make, String model, Engine eng){
        this.make = make;
        this.model = model;
        this.eng = eng;
    }
    
    public void displayInfo() {
        System.out.println("Car Make: "+ this.make);
        System.out.println("Car Model: "+ this.model);
        eng.displayEngineDetails();
    }
}
public class Solution2 {
    public static void main(String[] args) {
        Engine eng1 = new Engine(580, "Gasoline");
        Car car1 = new Car("Toyota", "Supra", eng1);
        car1.displayInfo();
    }
}
