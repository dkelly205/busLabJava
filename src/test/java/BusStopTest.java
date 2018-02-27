import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {


    BusStop braehead;
    Person person;

    @Before
    public void before(){
        braehead = new BusStop("Braehead");
        person = new Person();
    }

    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, braehead.numberInQueue());
    }

    @Test
    public void canAddPersonToQueue(){
        braehead.addPersonToQueue(person);
        assertEquals(1, braehead.numberInQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        braehead.addPersonToQueue(person);
        braehead.addPersonToQueue(person);
        braehead.addPersonToQueue(person);
        braehead.removePersonFromQueue();
        assertEquals(2, braehead.numberInQueue());


    }
}
