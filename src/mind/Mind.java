package mind;

import enums.EmotionalStat;
import people.ImaginaryRachel;
import people.ImaginaryZelda;
import people.Rachel;

public class Mind {
    private ImaginaryRachel imaginaryRachel;
    private ImaginaryZelda imaginaryZelda;
   public Dream generateDream(){
       System.out.printf("%s создает сон\n", this);
       return new Dream();
   }
   public ImaginaryZelda createImaginaryZelda() {
       imaginaryZelda = new ImaginaryZelda();
       return imaginaryZelda;
   }
   public ImaginaryRachel createImaginaryRachel(){
       imaginaryRachel = new ImaginaryRachel();
       return imaginaryRachel;
   }
   public void influenceToRachel(Rachel rachel){
        rachel.setEmotionalStat(EmotionalStat.ANXIOUS);
        rachel.getPain().increase(imaginaryRachel.getMeningit().getPower());
   }
   public void clear(Rachel rachel){
       if(rachel.getPain().getPower() == 0) {
            imaginaryZelda = null;
            imaginaryRachel = null;
            rachel.setHp(100);
            rachel.setEmotionalStat(EmotionalStat.NORMAL);
            rachel.changeBlouse();
            System.out.printf("%s пришла в себя\n", rachel);
       }
   }
   @Override
    public String toString(){
       return "Сознание";
   }
}

