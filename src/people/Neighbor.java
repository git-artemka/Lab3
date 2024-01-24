package people;

import enums.RelationType;
import locations.Tree;

public class Neighbor extends Person {
    public Neighbor() {
        super(RelationType.NEIGHBOR, 100);
    }
    public void takeRachelFrom(Rachel rachel, Tree tree){
       rachel.getMouth().getTongue().setAbleToSpeak(false);
        System.out.printf("%s оторвала %s от %s. Та замолчала\n", RelationType.NEIGHBOR, rachel, tree);
    }
    public void callTo(Person to){
        phone.createConnection(this, to);
        phone.endConnection(this, to);
        System.out.printf("%s позвонила %s\n",RelationType.NEIGHBOR, to );

    }
    Connection phone = new Connection(){
        public void createConnection(Person from, Person to){
            from.setAtPhone(true);
            to.setAtPhone(true);
        }
        public void endConnection(Person from, Person to){
            from.setAtPhone(false);
            to.setAtPhone(false);
        }
    };

}
interface Connection{
    void createConnection(Person from, Person to);
    void endConnection(Person from, Person to);
}
