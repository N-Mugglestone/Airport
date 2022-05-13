package airport.java.challenge;

import java.util.Random;

public class Weather {
Random random = new Random();
private final int upperbound = 101;
private int randomWeather = random.nextInt(upperbound);

public Weather(int randomWeather){
    this.randomWeather = randomWeather;
}

    public Weather() {

    }

    public String weatherGenerator(){
    if((randomWeather <= 20)){
        return "It is stormy";
    }else{
        return "It is sunny";
    }
}
}




//public class Weather {
//    public boolean isStormy(){
//        double w = Math.random();
//        return w <0.3;
//    }
//}
