package staff;

public class Pain {
    private int power;
    public int getPower(){
        return power;
    }
    public void increase(int x){
        power += x;
    }
    public void decrease(){
        power = 0;
        System.out.print("Боль спала\n");
    }
}
