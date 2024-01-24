package enums;

public enum Times {
        DAY("день"),
        NIGHT("ночь");
        private final String time;
        Times(String time){
            this.time = time;
        }
    @Override
    public String toString(){
        return time;
    }
    }

