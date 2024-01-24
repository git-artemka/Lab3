package locations;

import enums.RoomStat;
import exception.PersonIsNotInHouse;
import furniture.Box;
import people.Person;
import furniture.Bed;

import java.util.ArrayList;
import java.util.Collections;

public class House extends Location{
    private Room room;
    public House() {
        super("Дом Голдманов");
        room = new Room();
        System.out.println(this.getName());
    }
    public class Room {
        private final ArrayList<Person> peopleInRoom = new ArrayList<>();
        private RoomStat roomStat;
        private Bed bed;
        private Box box;
        public Room(){
            roomStat = RoomStat.NORMAL;
            bed = new Bed();
        }
        public void setRoomStat(RoomStat roomStat){
            this.roomStat = roomStat;
            System.out.printf("%s стала %s\n", this, roomStat);
        }

        public Bed getBed(){
            return bed;
        }
        public void addPeople(Person...p) {
            for(Person person : p){
                if(!getPeopleInLocation().contains(person)) throw new PersonIsNotInHouse("Человека нет в доме");
            }
            Collections.addAll(peopleInRoom, p);
        }
        public void deletePerson(Person person){
            peopleInRoom.remove(person);
        }
        public void deleteBed(){
            bed = null;
        }
        public void addBox(int amountOfThings){
            box = new Box(amountOfThings);
            System.out.printf("Осталась %s с %s вещей\n", box, amountOfThings);
        }
        @Override
        public String toString(){
            return "Комната";
        }
    }
    public class ToiletRoom{
        private boolean isExist = false;
        public ToiletRoom(){
            isExist = true;
            System.out.print(this);
        }
        @Override
        public String toString(){
            return " туалетную комнату\n";
        }
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
