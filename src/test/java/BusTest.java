import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 5);
        person = new Person();
        busStop = new BusStop("braehead");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.numberOfPassengers());
    }

    @Test
    public void canNotAddPassengerOverCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.numberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void canPickUp(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.numberInQueue());
        bus.pickUp(busStop);
        assertEquals(1, bus.numberOfPassengers());
        assertEquals(0, busStop.numberInQueue());
    }




}
