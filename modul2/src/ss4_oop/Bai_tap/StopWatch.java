package ss4_oop.Bai_tap;

import javafx.scene.paint.Stop;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class StopWatch {
    private LocalTime startTime;

    private LocalTime endTime;

    public StopWatch(){
        this.startTime = LocalTime.now();

    }
    public StopWatch(LocalTime starTime, LocalTime endTime){
        this.startTime = starTime;
        this.endTime = endTime;
    }
    public void setStart(LocalTime startTime){
        this.startTime = startTime;
    }
    public void setStop(LocalTime endTime){
        this.endTime = endTime;
    }
    public LocalTime getStartTime(){
        return this.startTime;
    }
    public LocalTime getEndTime(){
        return this.endTime;
    }
    public int getElapsedTime(){
        int militime = ((endTime.getHour()-startTime.getHour())*3600+(endTime.getMinute()-startTime.getMinute())*60+(endTime.getSecond()-startTime.getSecond()*1000));
        return militime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch(LocalTime.now(),LocalTime.now());
        System.out.printf(stopWatch.getElapsedTime()+" ");
    }
}
