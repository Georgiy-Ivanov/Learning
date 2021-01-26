public class Car extends Transport{
    int skolkokoles, skolkodverei;

    public Car(String color, String kakoirul, String type, int skolkokoles, int skolkodverei) {
        super(color, kakoirul, type);
        this.skolkodverei = skolkodverei;
        this.skolkokoles = skolkokoles;
    }

    @Override
    public void ride() {
        System.out.println("Driver is driving a car right now");
    }
}