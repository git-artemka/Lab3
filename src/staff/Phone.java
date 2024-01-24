package staff;

import Interfaces.RandFunction;
import people.Person;

public class Phone {

    public void createConnection(Person from, Person to){
        while(!from.getOnCall()&&!to.getOnCall()) {
            System.out.print("Устанавливаем соединение...\n");
            RandFunction randFunction = x -> (int) (x*Math.random());
            if(randFunction.random(100)>=20){
                from.setOnCall(true);
                to.setOnCall(true);
                System.out.print("Соединение установлено\n");
            }
        }
    }
    public void endConnection(Person from, Person to){
        from.setOnCall(false);
        to.setOnCall(false);
        System.out.print("Соединение прервано\n");
    }

}
