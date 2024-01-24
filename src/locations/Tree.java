package locations;

public class Tree {
    private int strength;
    public Tree(int x){
        strength = x;
    }
    public int getStrength(){
        return strength;
    }
    @Override
    public String toString(){
        return "деревa";
    }
}
