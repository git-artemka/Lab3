package staff;

public class Blouse {
    private boolean isTear = false;
    private boolean inBlood = false;
    public void tear(){
        isTear = true;
        System.out.printf("%s порвалась\n",this);
    }
    public void getDirty(){
        inBlood = true;
        System.out.printf("%s в крови\n",this);
    }

    @Override
    public String toString(){
        return "Ёе блузка";
    }

    public void setTear(boolean tear) {
        isTear = tear;
    }

    public void setInBlood(boolean inBlood) {
        this.inBlood = inBlood;
    }
}
