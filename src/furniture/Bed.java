package furniture;

import people.Person;

public class Bed {
    private final Person[] seat = new Person[1];
    private boolean isWet;
    public void addPerson(Person person){
        seat[0] = person;
    }
    public void cleanBed(){
        seat[0] = null;
    }
    public void setIsWet(Boolean isWet){
        this.isWet = isWet;
    }
    @Override
    public String toString () {
        return "кровать";
    }


}
