package exception;

import people.Person;

public class PersonIsNotInHouse extends RuntimeException{
    public PersonIsNotInHouse(String message, Person person){
        super(person + message);
    }
}
