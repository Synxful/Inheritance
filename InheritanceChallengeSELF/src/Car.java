public class Car extends Vehicle {

    private int wheels;
    private int steering;
    private int weight;
    private int size;

    public Car(int wheels, int steering, int weight, int size) {
        this.wheels = wheels;
        this.steering = steering;
        this.weight = weight;
        this.size = size;
    }

    // methods

    public void handSteering() {
        System.out.println("car.handSteering() called");
    }

    public void changingGears(int gear) {
        System.out.println("car.changingGears() called");
    }

    public void moving(int speed) {
        System.out.println("car.moving() called");
    }


    // getters

    public int getWheels() {
        return wheels;
    }

    public int getSteering() {
        return steering;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }
}
