package DEMO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022,2,3);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查寻的年月：");
        String currentDate = sc.next()+"-01";
        LocalDate endDate = LocalDate.parse(currentDate);
        LocalDate endDate1 = endDate;
        endDate = endDate.plusMonths(1).minusDays(1);

        List<Day> days = new ArrayList<>();
        while(!startDate.isAfter(endDate)){
            Day day = new Day(startDate);
            startDate = startDate.plusDays(1);
            days.add(day);
        }
        System.out.println(days);
        for (int i = 0; i < days.size(); i+=3 ) {
            days.get(i).setFlog(true);
        }
        for (int i = 0; i < days.size(); i++) {
            if(days.get(i).getData().isBefore(endDate1)){
                continue;
            }else{
                days.get(i).printInfo();
            }
        }

    }
}
