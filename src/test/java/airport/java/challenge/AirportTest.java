package airport.java.challenge;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//weather conditions cause tests to fail occasionally

public class AirportTest {
    Airport airport;
    Plane mockedPlane1;
    Plane mockedPlane2;


    public static class PlaneTest{
        Plane plane;

        @Test
        public void testGetPlane(){
            plane = new Plane("Plane fire");
            assertEquals("Plane fire", plane.name);
        }
    }

    @Test
    public void testDefaultCapacity() {
        airport = new Airport();
        assertEquals( 10, Airport.capacity);
    }
//when running test alone, it passes. Not sure why.

    @Test
    public void testOverride() {
        airport = new Airport();
        assertEquals(20, airport.override(20));
    }

    @Test
    public void testLandPlane() {
        airport = new Airport();
        mockedPlane1 = mock(Plane.class);
        when(mockedPlane1.getName()).thenReturn("Plane 1");
        airport.land(mockedPlane1.getName());
        assertEquals(1, airport.hangar.size());
    }

    @Test
    public void testLandPlaneMessage() {
        airport = new Airport();
        mockedPlane1 = mock(Plane.class);
        when(mockedPlane1.getName()).thenReturn("Plane 1");
        assertEquals("Plane 1 has landed.", airport.land(mockedPlane1.getName()));
    }

    @Test
    public void testAlreadyLanded() {
        airport = new Airport();
        mockedPlane1 = mock(Plane.class);
        when(mockedPlane1.getName()).thenReturn("Plane 1");
        airport.land(mockedPlane1.getName());
        assertEquals("This plane is in the hangar.", airport.land(mockedPlane1.getName()));
    }

    @Test
    public void testCannotLandWhenFull() {
        airport = new Airport();
        airport.override(1);
        mockedPlane1 = mock(Plane.class);
        when(mockedPlane1.getName()).thenReturn("Plane 1");
        airport.land(mockedPlane1.getName());
        mockedPlane2 = mock(Plane.class);
        when(mockedPlane2.getName()).thenReturn("Plane 2");
        assertEquals("Hangar capacity reached, cannot land plane.", airport.land(mockedPlane2.getName()));
    }

    @Test
    public void testTakeOff() {
        airport = new Airport();
        mockedPlane1 = mock(Plane.class);
        when(mockedPlane1.getName()).thenReturn("Plane 1");
        airport.land(mockedPlane1.getName());
        airport.takeOff(mockedPlane1.getName());
        assertEquals(0, airport.hangar.size());
    }

    @Test
    public void testTakeOffMessage() {
        airport = new Airport();
        mockedPlane1 = mock(Plane.class);
        when(mockedPlane1.getName()).thenReturn("Plane 1");
        airport.land(mockedPlane1.getName());
        assertEquals("Plane 1 has left the airport.", airport.takeOff(mockedPlane1.getName()));
    }

    @Test
    public void testAlreadyTakenOff() {
        airport = new Airport();
        mockedPlane1 = mock(Plane.class);
        when(mockedPlane1.getName()).thenReturn("Plane 1");
        assertEquals("This plane is already in flight.", airport.takeOff(mockedPlane1.getName()));
    }

    @Test
    public void sunnyWeatherCondition(){
    airport = new Airport();
    Weather weather = new Weather(50);
    assertEquals(weather.weatherGenerator(), "It is sunny");
}

    @Test
    public void stormyWeatherConditions(){
        airport = new Airport();
        Weather weather = new Weather(15);
        assertEquals(weather.weatherGenerator(), "It is stormy");
    }
}