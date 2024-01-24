package people;
import Interfaces.Choke;
import enums.RelationType;
import enums.RoomStat;
import furniture.Bed;
import locations.House;

public class Zelda extends Person implements Choke {
    public Zelda() {
        super(RelationType.SISTER, 40);
    }
    public void choke(){
        getMouth().getTongue().setAbleToSpeak(false);
        System.out.printf("%s подавилась языком и ", this);

    }
    public void dieInRoom(House.Room room){
        choke();
        setHp(0);
        room.getBed().cleanBed();
        System.out.print("умерла\n");
        room.setRoomStat(RoomStat.DIRTY);
    }
    @Override
    public String toString () {
        return "Зельда";
    }
}
