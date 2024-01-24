package exception;

public class PersonIsNotInHouse extends RuntimeException{
    public PersonIsNotInHouse(String message){
        super(message);
    }
}
