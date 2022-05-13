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




/*
constructor to make a plane object with a unique name

create a 'hangar' array that holds each object plane
 - give the array a default capacity that can be overridden if needed

create another array for 'in flight' planes

once capacity reached, prevent new objects being added to the array and send an error message

allow plane object to be removed from the array(hangar) and confirm that the array no longer holds the object
-give a message that the plane is no longer in the hanger array

two part
- check 'hangar' array for plane object before trying to remove it to the 'in flight' array. - If not there send a message.
- check 'in flight' array for plane object, if not there do not give the order to land the plane

make random number generator for weather conditions, if 'stormy' no plane objects can more arrays
- print message of weather conditions

landed planes can only be in the hangar. There are only two conditions, in the hanger or in flight.

*/


//    public String Weather(){
//        if (weather.isStormy()){
//            return "Cannot land or take off in stormy weather";
//            System.exit(0);
//        } else {
//            return "Weather is sunny, do as you wish. No crashing though";
//        }
//    }
