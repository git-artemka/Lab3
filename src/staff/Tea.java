package staff;

import Interfaces.RandFunction;

public class Tea {
    private int temperature;
    public Tea(){

        RandFunction randFunction = x -> (int) (x + (100 - x) * Math.random());
        temperature = randFunction.random(20);
        while (temperature <= 70) {
            System.out.println("Чай заваривается. Температура: " + temperature);
            temperature = randFunction.random(temperature);

        }
        System.out.println("Чай заварен. Температура: " + temperature);
    }
    public String toString(){
        return "чай";
    }


}
