package be.vdab.Ex101Time;

import java.util.Date;

public class Time {

    private long second;
    private long minute;
    private long hour;

    public Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;
    }

    public Time(long elapsedTime) {
        Date date = new Date(elapsedTime);
        long totalMilliseconds = date.getTime();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;
    }

    public Time(long second, long minute, long hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public long getSecond() {
        return second;
    }

    public long getMinute() {
        return minute;
    }

    public long getHour() {
        return hour;
    }

    public void setTime(long elapseTime) {
        second = (elapseTime / 1000) % 60;
        minute = (second / 60) % 60;
        hour = (minute / 60) % 24;
    }
}