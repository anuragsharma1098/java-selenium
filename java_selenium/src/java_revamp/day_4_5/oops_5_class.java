package java_revamp.day_4_5;

interface Vehicle {
    void start();
    void stop();
}   
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}
class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
}
class EV implements Vehicle {
    @Override
    public void start() {
        System.out.println("EV started");
    }

    @Override
    public void stop() {
        System.out.println("EV stopped");
    }
}
