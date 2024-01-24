package people;

import enums.RelationType;
import enums.RoomStat;
import locations.House;

public class Father extends Person {
    public Father() {
        super(RelationType.PARENT, 100);
    }
    public void cleanRoom(House.Room room){
        room.addPeople(this);
        System.out.printf("%s вычистил и продезинфицировал %s\n",this, room);
        room.setRoomStat(RoomStat.CLEAR);
        room.deleteBed();
        room.addBox(0);
        room.deletePerson(this);
    }

    public String toString(){
        return "Отец";
    }
}
