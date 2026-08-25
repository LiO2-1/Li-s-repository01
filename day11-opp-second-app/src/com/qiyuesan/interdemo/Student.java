package com.qiyuesan.interdemo;

public class Student {
    private char sex;
    private String name;
    private double score;

    public Student(char sex, String name, double score) {
        this.sex = sex;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
