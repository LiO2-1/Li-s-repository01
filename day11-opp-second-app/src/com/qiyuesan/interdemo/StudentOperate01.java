package com.qiyuesan.interdemo;

import java.util.ArrayList;

public class StudentOperate01 implements StudentOperate{

    @Override
    public void print1(ArrayList<Student> students) {
        System.out.println("======以下为班级信息=======");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名："+s.getName()+"，性别："+s.getSex()+"，成绩："+s.getScore());
        }
        System.out.println("========================");
    }

    @Override
    public void print2(ArrayList<Student> students) {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            sum += s.getScore();
        }
        System.out.println("平均成绩为："+sum / students.size());
    }
}
