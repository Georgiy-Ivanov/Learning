public class Boat extends Transport{
    private int MAX_SPEED;
    public Boat(String color, String kakoirul, String type, int MAX_SPEED) {
        super(color, kakoirul, type);
        this.MAX_SPEED = MAX_SPEED;
    }
    @Override
    public void ride() {
        System.out.println("Driver is driving a boat right now");
    }
}

