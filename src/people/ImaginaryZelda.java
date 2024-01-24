package people;

import enums.RelationType;
import staff.Meningit;

public class ImaginaryZelda extends Person{
    private Meningit meningit;
    public ImaginaryZelda() {
        super(RelationType.SISTER, 40);
        meningit = new Meningit(30);
    }
    public void sure(ImaginaryRachel imaginaryRachel){
        imaginaryRachel.enjoyDeath(this);
        System.out.printf("Что %s знает, что %s обрадовалась ее смерти\n", this, imaginaryRachel);
    }
    public void takeRevenge(ImaginaryRachel imaginaryRachel){
        imaginaryRachel.setHp(getHp());
        imaginaryRachel.setMeningit(meningit);
    }

    @Override
    public String toString(){
        return "Зельда";
    }
}


