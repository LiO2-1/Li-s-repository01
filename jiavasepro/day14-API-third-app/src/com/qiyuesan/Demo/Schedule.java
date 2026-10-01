package com.qiyuesan.Demo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate today ;

    private boolean morning;
    private LocalTime mend;
    private LocalTime mstart;
    private int mTotalNumber;
    private int mAppointNumber;

    private boolean afternoon;

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalTime getMend() {
        return mend;
    }

    public void setMend(LocalTime mend) {
        this.mend = mend;
    }

    public LocalTime getMstart() {
        return mstart;
    }

    public void setMstart(LocalTime mstart) {
        this.mstart = mstart;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getAend() {
        return aend;
    }

    public void setAend(LocalTime aend) {
        this.aend = aend;
    }

    public LocalTime getAstart() {
        return astart;
    }

    public void setAstart(LocalTime astart) {
        this.astart = astart;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }

    private LocalTime aend;
    private LocalTime astart;
    private int aTotalNumber;
    private int aAppointNumber;
}
