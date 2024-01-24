package staff;

import Interfaces.RandFunction;

public class Tea {
    public Tea(){
        RandFunction randFunction = x -> (int) (x + (100 - x) * Math.random());
        int temperature = randFunction.random(20);
        while (temperature <= 70) {
            System.out.printf("Чай заваривается. Температура: %s\n",temperature);
            temperature = randFunction.random(temperature);
        }
        System.out.println("Чай заварен. Температура: " + temperature);
    }
    public String toString(){
        return "чай";
    }


}
