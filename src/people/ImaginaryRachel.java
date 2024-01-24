package people;

import Interfaces.Choke;
import Interfaces.Run;
import enums.EmotionalStat;
import enums.RelationType;
import furniture.Bed;
import locations.Location;
import staff.Meningit;

public class ImaginaryRachel extends Person implements Run, Choke {
    private Meningit meningit;
    public ImaginaryRachel() {
        super(RelationType.PROTAGONIST, 100);
    }
    public void setMeningit(Meningit meningit){
        this.meningit = meningit;
    }
    public Meningit getMeningit(){
        return meningit;
    }
    public void sure(ImaginaryZelda imaginaryZelda){
        imaginaryZelda.takeRevenge(this);
        System.out.printf("%s была уверена, что %s ей мстит\n", this, imaginaryZelda);
    }
    public void enjoyDeath(ImaginaryZelda imaginaryZelda){
        imaginaryZelda.setHp(0);
        setEmotionalStat(EmotionalStat.HAPPY);
    }
    public void run(Location l1, Location l2){
        l1.deletePerson(this);
        l2.addPeople(this);
        System.out.printf("Что она выбежала на %s, смеясь\n", l2);
    }
    public void becomeMonster(){
        meningit.effect(this);
        Bed bed = new Bed();
        bed.addPerson(this);
        System.out.printf("И теперь она уляжется в %s и превратиться в монстра\n", bed);
        pee(bed);
        choke();
        setHp(0);
        bed.cleanBed();
        System.out.print("И умрет\n");
    }
    public void pee(Bed bed){
        bed.setIsWet(true);
        System.out.printf("Будет мочиться в %s\n", bed);
    }
    public void choke(){
        getMouth().getTongue().setAbleToSpeak(false);
        System.out.printf("Подавиться %s\n", getMouth().getTongue());
    }

    @Override
    public String toString(){
        return "Рэчел";
    }


}
