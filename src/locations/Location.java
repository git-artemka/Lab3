package locations;

import people.Person;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Location {
    private final String name;
    private final ArrayList<Person> peopleInLocation = new ArrayList<>();
    public Location(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public ArrayList<Person> getPeopleInLocation(){
        return peopleInLocation;
    }
    public void addPeople(Person...p){
        Collections.addAll(peopleInLocation, p);
        for(Person person:p){
            person.setLocation(this);
        }
    }
    public void deletePerson(Person person){
        peopleInLocation.remove(person);
        person.setLocation(null);
    }
}
