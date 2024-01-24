package Interfaces;

import people.Rachel;

public interface Convince {
     default void convince(Rachel rachel){
          if (rachel.getPain().getPower() > 0) System.out.printf("Никому переубедить %s не удалось\n", rachel);
     };
}
