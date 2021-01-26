public class Main {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.ride();
        bob.drv(new Car("red", "krugliy", "muscle_car", 4, 2));
        bob.drv(new Boat("white", "kvadratniy", "tyagach", 50));
        bob.drv(new Bicycle("blue", "pryamoi", "ne_gorniy"));
    }
}
