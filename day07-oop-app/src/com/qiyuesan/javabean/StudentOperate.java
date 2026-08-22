package com.qiyuesan.javabean;

public class StudentOperate {
    private Student student;
    //通过有参数构造器来赋值
    public StudentOperate(Student student){
        this.student = student;
    }

    public void scorePass(){
        if(student.getScore() >= 60){
            System.out.println(student.getName()+"及格");
        }else {
            System.out.println(student.getName()+"不及格");
        }
    }
}
