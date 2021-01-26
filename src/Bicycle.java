public class Bicycle extends Transport{
    public Bicycle(String color, String kakoirul, String type) {
        super(color, kakoirul, type);
    }

    @Override
    public void ride()  {
        System.out.println("Driver is driving a bicycle right now");
    }

    }

