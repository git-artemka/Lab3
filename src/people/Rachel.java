package people;

import Interfaces.Run;
import enums.EmotionalStat;
import enums.RelationType;
import exception.DreamIsNotNightmare;
import furniture.Bed;
import locations.Location;
import locations.Tree;
import mind.Mind;
import staff.Blouse;
import staff.Pain;
import staff.Tea;

public class Rachel extends Person implements Run {
    private final Mind mind;
    private final Blouse blouse;
    private final Pain pain;
    public Rachel () {
        super(RelationType.PROTAGONIST, 100);
        blouse = new Blouse();
        mind = new Mind(this);
        pain = new Pain();
    }
    public Mind getMind(){
        return mind;
    }
    public Pain getPain(){
        return pain;
    }
    public void takeZeldaToBed(Zelda zelda, Bed bed){
        bed.addPerson(zelda);
        System.out.printf("%s притащила %s в %s\n", this, RelationType.SISTER, bed);
        blouse.tear();
        pain.increase(10);
        setHp(61);
    }

    public void awake() throws DreamIsNotNightmare{
        System.out.print("У Рэчел ");
        int x = mind.generateDream().getHowScary();
        if(x>=75) {setEmotionalStat(EmotionalStat.SCARED);
            System.out.printf("Она %s и проснулась\n", EmotionalStat.SCARED);}
        else if(x>=50) {setEmotionalStat(EmotionalStat.TRAUMATIZED);
            System.out.printf("Ей стало %s и она проснулась\n", EmotionalStat.TRAUMATIZED);}
        else if (x>=20) {setEmotionalStat(EmotionalStat.ANXIOUS);
            System.out.printf("Ей стало %s и она проснулась\n", EmotionalStat.ANXIOUS);}
        else throw new DreamIsNotNightmare("Рейчел снится не страшный сон");
    }
    public void run(Location l1, Location l2){
        l1.deletePerson(this);
        l2.addPeople(this);
        System.out.printf("Выбежала на %s, зовя мать\n", l2);
    }
    public void smashIntoTree(Tree tree){
        setHp(getHp() - tree.getStrength());
        System.out.printf("%s ударилась об %s\n", this, tree);
        blouse.getDirty();
    }

    public void drinkTea(Tea tea){
        getMouth().getTongue().setAbleToSpeak(true);
        setEmotionalStat(EmotionalStat.CALM);
        System.out.printf("%s выпила %s, стала %s и смогла говорить\n", this, tea, this.getEmotionalStat());
    }
    public void changeBlouse(){
        blouse.setTear(false);
        blouse.setInBlood(false);
    }
    @Override
    public String toString(){
        return "Рэчел";
    }
}
