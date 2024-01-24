package people;

import enums.EmotionalStat;
import enums.PhysicalStat;
import enums.RelationType;
import locations.Location;

import java.util.Objects;

public abstract class Person {
    private final RelationType relationType;
    private PhysicalStat physicalStat;
    private double hp;
    private EmotionalStat emotionalStat = EmotionalStat.NORMAL;
    private final Mouth mouth;
    private Location location;
    private boolean onCall;
    public Person(RelationType relationType, double hp){
        this.relationType = relationType;
        setHp(hp);
        mouth = new Mouth();
    }
    public void setHp(double hp){
        this.hp = hp;
        if (hp>=60) setPhysicalStat(PhysicalStat.HEALTHY);
        else if (hp==0) setPhysicalStat(PhysicalStat.DEAD);
        else setPhysicalStat(PhysicalStat.ILL);
    }
    private void setPhysicalStat(PhysicalStat stat){
        physicalStat = stat;
        if (stat == PhysicalStat.DEAD) getLocation().deletePerson(this);
    }
    public void setLocation(Location location){
        this.location = location;
    }
    public void setEmotionalStat(EmotionalStat stat){
        emotionalStat = stat;
    }
    public void setOnCall(boolean onCall){
        this.onCall = onCall;
    }
    public double getHp(){
        return hp;
    }
    public Location getLocation(){
        return location;
    }
    public EmotionalStat getEmotionalStat(){
        return emotionalStat;
    }
    public Mouth getMouth(){
        return mouth;
    }
    public boolean getOnCall(){
        return onCall;
    }
    public class Mouth {
        private final Tongue tongue;
        public Mouth(){
            tongue = new Tongue();
        }
        public Tongue getTongue(){
            return tongue;
        }
        public class Tongue{
            private boolean isAbleToSpeak = true;
            public void setAbleToSpeak(boolean b){
                isAbleToSpeak = b;
            }

            @Override
            public String toString(){
                return "языком";
            }
        }
        public String speak(String phrase){
            if (tongue.isAbleToSpeak) {
                System.out.printf("%s сказала''%s''\n", this.person(), phrase);
                return phrase;}
            return null;
        }
        public Person person(){
            return Person.this;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(physicalStat, person.physicalStat) &&
                Objects.equals(emotionalStat, person.emotionalStat) &&
                Objects.equals(relationType, person.relationType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(physicalStat, emotionalStat, relationType);
    }
}
