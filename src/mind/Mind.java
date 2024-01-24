package mind;

import enums.EmotionalStat;
import people.ImaginaryRachel;
import people.ImaginaryZelda;
import people.Rachel;

public class Mind {
    private final Rachel owner;
    private ImaginaryRachel imaginaryRachel;
    private ImaginaryZelda imaginaryZelda;
    public Mind(Rachel rachel){
        owner = rachel;
    }
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
   public void influence(){
        owner.setEmotionalStat(EmotionalStat.ANXIOUS);
        owner.getPain().increase(imaginaryRachel.getMeningit().getPower());
   }
   public void clear(){
       if(owner.getPain().getPower() == 0) {
            imaginaryZelda = null;
            imaginaryRachel = null;
            owner.setHp(100);
            owner.setEmotionalStat(EmotionalStat.NORMAL);
            owner.changeBlouse();
            System.out.printf("%s пришла в себя\n", owner);
       }
   }
   @Override
    public String toString(){
       return "Сознание";
   }
}

