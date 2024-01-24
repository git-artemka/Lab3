package locations;

import enums.RoomStat;
import exception.PersonIsNotInHouse;
import furniture.Bed;
import furniture.Box;
import people.Person;

import java.util.ArrayList;
import java.util.Collections;

public class House extends Location{
    private Room room;
    public House() {
        super("Дом Голдманов");
        room = new Room();
        room.addBed();
        System.out.println(this.getName());
    }
    public class Room {
        private final ArrayList<Person> peopleInRoom = new ArrayList<>();
        private RoomStat roomStat;
        private Bed bed;
        private Box box;

        public Room(){
            roomStat = RoomStat.NORMAL;
        }
        public void addBed(){
            bed = new Bed();
        }
        public Bed getBed(){
            return bed;
        }
        public void setBox(Box box){
            this.box = box;
        }
        public void setRoomStat(RoomStat roomStat){
            this.roomStat = roomStat;
            System.out.printf("%s стала %s\n", this, roomStat);
        }

        public void addPeople(Person...p) {
            for(Person person : p){
                if(!getPeopleInLocation().contains(person)) throw new PersonIsNotInHouse(" нет в доме", person);
            }
            Collections.addAll(peopleInRoom, p);
        }
        public void deletePerson(Person person){
            peopleInRoom.remove(person);
        }
        public void deleteBed(){
            bed = null;
        }

        @Override
        public String toString(){
            return "Комната";
        }
    }
    Room toiletRoom = new Room(){
        public String toString(){
            return "Туалетная комната";
        }
    };
    public void createToiletRoom(){
        room = toiletRoom;
    }
    public Room getRoom(){
        return room;
    }
    @Override
    public void deletePerson(Person person){
        super.deletePerson(person);
        getRoom().deletePerson(person);
    }
}
