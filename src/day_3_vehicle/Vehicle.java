package day_3_vehicle;

public class Vehicle {
    public String steering;
    public int gear;
    public int speed;
    Vehicle(String steering, int gear, int speed){
        this.steering = steering;
        this.gear = gear;
        this.speed = speed;
    }
    public String printInfo(){
        return "Steering: " + steering + "\r\nGear: " + gear + "\r\nSpeed: " + speed;
    }
}

class Car extends Vehicle {
    public String type;
    public Car(String steering, int gear, int speed, String type){
        super(steering, gear, speed);
        this.type = type;
    }
    public String printInfo(){
        return super.printInfo() + "\r\nType: " + type;
    }
}

class Cabriolet extends Car {
    public boolean roofOn;
    public Cabriolet(String steering, int gear, int speed, String type, boolean roofOn){
        super(steering, gear, speed, type);
        this.roofOn = roofOn;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\r\nIs the roof on? - " + roofOn;
    }

    public static void main(String[] args){
        Vehicle myCar = new Cabriolet("forward", 5, 90, "cabriolet", false);
        System.out.println(myCar.printInfo());
    }
}
