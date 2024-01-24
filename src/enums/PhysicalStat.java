package enums;

public enum PhysicalStat {
    HEALTHY("здорова"),
    DEAD("мертва"),
    ILL("больна");
    private final String physicalStat;
    PhysicalStat(String physicalStat) {
        this.physicalStat = physicalStat;
    }

    @Override
    public String toString(){
        return physicalStat;
    }
}
