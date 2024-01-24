package furniture;

import people.Person;
import people.Zelda;

public class Bed {
    private Person[] seat = new Person[1];
    private boolean isWet;
    public void addPerson(Person person){
        seat[0] = person;
    }
    public void setIsWet(Boolean b){
        isWet = b;
    }
    @Override
    public String toString () {
        return "кровать";
    }
}
