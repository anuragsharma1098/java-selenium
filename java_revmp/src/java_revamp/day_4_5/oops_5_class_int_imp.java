package java_revamp.day_4_5;

public class oops_5_class_int_imp {
    public static void main(String[] args) {

        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
        Vehicle myTruck = new Truck();
        myTruck.start();
        myTruck.stop();
        Vehicle myEV = new EV();
        myEV.start();
        myEV.stop();

    }
}