package staff;

import enums.Times;

public class Time {
    private Times time;
    public Time(Times time){
        this.time = time;
    }

    public void setTime(Times time) {
        System.out.printf("Наступила %s\n", time);
        this.time = time;
    }
}
