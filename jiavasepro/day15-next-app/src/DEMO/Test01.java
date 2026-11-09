package DEMO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01 {
    public static List<People> peoples = new ArrayList<>();
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 100; i++) {
            int code = r.nextInt(200)+1;
            if (fix(code)){
                i--;
            }else{
                People p = new People(code,i);
                peoples.add(p);
            }
        }
        System.out.println(peoples);

        while (peoples.size() > 1) {
            List<People> luckPeoples = new ArrayList<>();
            for (int i = 1; i < peoples.size(); i+=2) {
                People p = peoples.get(i);
                luckPeoples.add(p);
            }
            peoples = luckPeoples;
        }
        People luckPeople = peoples.get(0);
        System.out.println(luckPeople);
    }

    public static boolean fix(int code){
        for (People people : peoples) {
            if(people.getCode() == code){
                return true;
            }
        }
        return false;
    }
}
