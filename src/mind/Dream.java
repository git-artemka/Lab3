package mind;

import Interfaces.RandFunction;

public class Dream {
    private final int howScary;
    public Dream(){
        RandFunction randFunction =  x -> (int) (x*Math.random());
        howScary = randFunction.random(100);
    }
    public int getHowScary(){
        return howScary;
    }
}
