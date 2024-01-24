package people;

import enums.RelationType;
import locations.House;
import locations.Tree;
import staff.Phone;

public class Neighbor extends Person {
    public Neighbor() {
        super(RelationType.NEIGHBOR, 100);
    }
    public void takeRachelFrom(Rachel rachel, Tree tree, House house){
       rachel.getMouth().getTongue().setAbleToSpeak(false);
       house.addPeople(this, rachel);
       System.out.printf("%s оторвала %s от %s. Та замолчала\n", RelationType.NEIGHBOR, rachel, tree);
    }
    public void callTo(Person person){
        Phone phone = new Phone();
        phone.createConnection(this, person);
        phone.endConnection(this, person);
        System.out.printf("%s позвонила %s\n",RelationType.NEIGHBOR, person);
        getLocation().addPeople(person);
    }

}

