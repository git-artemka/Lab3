package enums;
public enum RoomStat {
    NORMAL("обычная"),
    CLEAR("чистой"),
    DIRTY("грязной");
    private final String roomStat;
    RoomStat(String roomStat) {
        this.roomStat = roomStat;
    }
    @Override
    public String toString(){
        return roomStat;
    }



}
