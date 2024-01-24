package people;

import Interfaces.Convince;
import enums.RelationType;
import locations.House;
import staff.Aspirin;
import staff.Tea;

public class Doctor extends Person implements Convince {
    public Doctor() {
        super(RelationType.DOCTOR, 100);
    }
    public Tea makeTea(){
        System.out.printf("%s делает чай\n", this);
        return new Tea();
    }
    public void givePillTo(Person person, int countOfPills){
        Aspirin apspirin = new Aspirin(20);
        for (int i = 0; i < countOfPills; i++){
            person.setHp(person.getHp() + apspirin.getPower());
        }
        System.out.printf("%s дает аспирин %s. HP: %s\n", this, person, person.getHp());
    }

    @Override
    public String toString(){
        return String.valueOf(RelationType.DOCTOR);
    }


}
