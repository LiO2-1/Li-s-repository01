package DEMO;

import java.time.LocalDate;

public class Day {
    private LocalDate data;
    private boolean flog;

    public Day() {
    }

    public Day(LocalDate data) {
        this.data = data;
    }

    public Day(LocalDate data, boolean flog) {
        this.data = data;
        this.flog = flog;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isFlog() {
        return flog;
    }

    public void setFlog(boolean flog) {
        this.flog = flog;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public void printInfo(){
        System.out.println(data+(flog ? "[周末]" : " "));
    }
}
