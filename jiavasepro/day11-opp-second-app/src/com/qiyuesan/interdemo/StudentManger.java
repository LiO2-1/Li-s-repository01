package com.qiyuesan.interdemo;

import java.util.ArrayList;

public class StudentManger {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperate studentOperate = new StudentOperate02();

    public StudentManger(){
        students.add(new Student('男',"李国兴",99));
        students.add(new Student('男',"崔民航",98));
        students.add(new Student('女',"姚力煜",100));
        students.add(new Student('女',"杨乐欣",100));
    }
    public void printAll(){
        studentOperate.print1(students);
    }

    public void printScore(){
        studentOperate.print2(students);
    }

}
