package enums;

public enum EmotionalStat {
    NORMAL ("обчное"),
    CALM ("спокойная"),
    TRAUMATIZED ("очень тревожно"),
    ANXIOUS("тревожно"),
    SCARED ("испугалась"),
    HAPPY ("счастлива");
    private final String emotionalStat;
    EmotionalStat (String emotionalStat){
        this.emotionalStat = emotionalStat;
    }
    @Override
    public String toString(){
        return emotionalStat;
    }
}
