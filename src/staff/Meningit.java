package staff;

import people.Person;

public class Meningit {
    private final int power;
    public Meningit(int x){
        power = x;
    }
    public int getPower(){
        return power;
    }
    public void effect(Person person){
        person.setHp(person.getHp()-power);
        System.out.printf("Она передала %s свой менингит\n", person);
    }

}
