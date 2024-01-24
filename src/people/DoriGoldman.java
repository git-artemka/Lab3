package people;

import Interfaces.Convince;
import enums.RelationType;
import locations.House;

import java.util.Objects;

public class DoriGoldman extends Person implements Convince {
    public DoriGoldman() {
        super(RelationType.PARENT, 100);
    }
    public void changeRoom(House house){
        house.getRoom().addPeople(this);
        house.createToiletRoom();
        house.getRoom().deletePerson(this);
        System.out.printf("%s устроила тут %s\n", this, house.getRoom());

    }
    public void hear(String phrase){
        if(Objects.equals(phrase, phrase.toUpperCase())) System.out.print("Мама услышала");
        else System.out.println("Мама не услышала");
    }
    @Override
    public String toString(){
       return "Дори Голдмэн";
    }

}
