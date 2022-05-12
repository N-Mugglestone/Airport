package airport.java.challenge;

import java.util.ArrayList;

public class Airport {
int capacity = 10;
ArrayList<String> hangar = new ArrayList<>();

public Airport(){
    this.capacity = capacity;
    this.hangar = hangar;
}
    public int override(int newCapacity) {
        this.capacity = newCapacity;
        return this.capacity;
    }

    public String land(String plane) {
        if (this.hangar.contains(plane)) {
            return "This plane is in the hanger.";
        } else if (this.hangar.size() < this.capacity) {
            this.hangar.add(plane);
            return plane + " has landed.";
        } else {
            return "Hanger capacity reached, cannot land plane.";
        }
    }

    public String takeOff(String plane) {
        if (this.hangar.contains(plane)) {
            this.hangar.remove(plane);
            return plane + " has left the airport.";
        } else {
            return "This plane is already in flight.";
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
