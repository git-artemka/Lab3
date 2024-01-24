import enums.EmotionalStat;
import enums.*;
import exception.DreamIsNotNightmare;
import locations.House;
import locations.Street;
import people.*;
import staff.Time;

public class Main{
    public static void main (String[] args){
        Time time = new Time(Times.DAY);
        House house = new House();
        Street street = new Street();
        Rachel rachel = new Rachel();
        Zelda zelda = new Zelda();
        DoriGoldman doriGoldman = new DoriGoldman();
        Father father = new Father();
        house.addPeople(rachel, zelda, doriGoldman, father);

        house.getRoom().addPeople(zelda, rachel);
        rachel.takeZeldaToBed(zelda, house.getRoom().getBed());
        house.getRoom().deletePerson(rachel);
        zelda.dieInRoom(house.getRoom());

        father.cleanRoom(house.getRoom());
        doriGoldman.changeRoom(house);
        time.setTime(Times.NIGHT);


        while(rachel.getEmotionalStat()== EmotionalStat.NORMAL){
            try{ rachel.awake();
            } catch (DreamIsNotNightmare exception) {
            System.out.printf(exception.getMessage());}
        }

        rachel.run(house, street);
        doriGoldman.hear(rachel.getMouth().speak("Мама мне страшно!"));
        rachel.smashIntoTree(street.getTree());

        rachel.getMouth().speak("Зельда умерла!");
        Neighbor neighbor = new Neighbor();
        neighbor.takeRachelFrom(rachel, street.getTree());

        Doctor doctor = new Doctor();

        neighbor.callTo(doctor);
        neighbor.callTo(doriGoldman);
        house.addPeople(rachel);
        doctor.goToHouse(house);


        rachel.drinkTea(doctor.makeTea());
        doctor.givePillTo(rachel, 2);

        ImaginaryZelda imaginaryZelda = rachel.getMind().createImaginaryZelda();
        ImaginaryRachel imaginaryRachel = rachel.getMind().createImaginaryRachel();
        house.addPeople(imaginaryRachel, imaginaryZelda);
        imaginaryRachel.sure(imaginaryZelda);
        imaginaryZelda.sure(imaginaryRachel);
        imaginaryRachel.run(house, street);
        street.deletePerson(imaginaryRachel);
        house.addPeople(imaginaryRachel);
        imaginaryRachel.becomeMonster();

        rachel.getMind().influenceToRachel(rachel);
        doctor.convince(rachel);
        doriGoldman.convince(rachel);
        rachel.getPain().decrease();
        rachel.getMind().clear(rachel);

    }
}
