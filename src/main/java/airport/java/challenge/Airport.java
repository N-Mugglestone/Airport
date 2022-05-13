package airport.java.challenge;

import java.util.ArrayList;

public class Airport {

    public static int capacity = 10;
    public Weather weather;
    public ArrayList<String> hangar = new ArrayList<>();

    public Airport() {
        this.weather = new Weather();
//        this.capacity = capacity;
//        this.hangar = hangar;
    }

    public Airport(Weather weather, int capacity){
        this.weather = weather;
        Airport.capacity = capacity;
    }

    public int override(int newCapacity) {
        this.weather = new Weather();
        capacity = newCapacity;
        return capacity;
    }

    public Airport(int capacity){
        Airport.capacity = capacity;
    }


    public String land(String plane) {
       if(weather.weatherGenerator().equals("It is sunny"))
        if (this.hangar.contains(plane)) {
            return "This plane is in the hangar.";
        } else if (this.hangar.size() < capacity) {
            this.hangar.add(plane);
            return plane + " has landed.";
        } else {
            return "Hangar capacity reached, cannot land plane.";
        }else{
            return "Cannot land because weather is stormy";
       }
    }

    public String takeOff(String plane) {
        if(weather.weatherGenerator().equals("It is sunny"))
        if (this.hangar.contains(plane)) {
            this.hangar.remove(plane);
            return plane + " has left the airport.";
        } else {
            return "This plane is already in flight.";
        }else{
            return"Cannot take off because weather is stormy";
        }
    }

}
