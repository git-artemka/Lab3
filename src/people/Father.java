package people;

import enums.RelationType;
import enums.RoomStat;
import furniture.Bed;
import furniture.Box;
import locations.House;

public class Father extends Person {
    public Father() {
        super(RelationType.PARENT, 100);
    }
    public void addBox(int amountOfThings, House.Room room){
        Box box = new Box(amountOfThings);
        room.setBox(box);
        System.out.printf("Осталась %s с %s вещей\n", box, amountOfThings);
    }
    public void cleanRoom(House.Room room){
        room.addPeople(this);
        System.out.printf("%s вычистил и продезинфицировал %s\n",this, room);
        room.setRoomStat(RoomStat.CLEAR);
        room.deleteBed();
        addBox(0, room);
        room.deletePerson(this);
    }

    public String toString(){
        return "Отец";
    }
}
