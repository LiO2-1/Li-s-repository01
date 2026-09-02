package com.qiyuesan.Object02;

public class Users implements Cloneable{
    private int id;
    private String name;
    private double[] scores;

    public Users() {}

    public Users(int id, String name, double[] scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Users u2 = (Users) super.clone();
        u2.scores = u2.scores.clone();
        return u2;
    }

}
