package com.qiyuesan.interdemo;

import java.util.ArrayList;

public class StudentOperate02 implements StudentOperate{
    @Override
    public void print1(ArrayList<Student> students) {
        int s1 = 0;
        int s2 = 0;
        System.out.println("======以下为班级信息=======");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名："+s.getName()+"，性别："+s.getSex()+"，成绩："+s.getScore());
            if(s.getSex() == '男'){
                s1++;
            }else{
                s2++;
            }
        }
        System.out.println("男生人数为："+s1+"，女生人数为："+s2);
        System.out.println("========================");
    }

    @Override
    public void print2(ArrayList<Student> students) {
        double sum = 0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            sum += s.getScore();
            if(max < s.getScore()) max = s.getScore();
            if(min > s.getScore()) min = s.getScore();
        }
        sum -= max + min;
        System.out.println("平均成绩为："+sum / (students.size()-2));
    }
}
