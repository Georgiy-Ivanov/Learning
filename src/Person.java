public class Person implements Rideable {
    Transport[] transports;

        public Person(){
    }

    public void drv(Transport transport){
            transport.ride();
    }

    @Override
    public void ride() {
        System.out.println("Well, the person just walking around.");
    }
}
