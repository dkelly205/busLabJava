import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }



    public int numberOfPassengers(){
        return passengers.size();
    }

    public void addPassenger(Person person){
        if (numberOfPassengers() < capacity) {
            this.passengers.add(person);
        }
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        this.passengers.add(busStop.removePersonFromQueue());
    }


//    could also do it this way instead of having an add passenger and pickup method
//    public void addPassenger(BusStop busStop) {
//        if (numberOfPassengers() < capacity) {
//            this.passengers.add(busStop.removePersonFromQueue());
//        }
//    }

}
