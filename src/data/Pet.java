/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public  abstract class Pet {
    protected String name;
    protected int yob;
    protected double weight;
    protected double FirstRun;

    public double getFirstRun() {
        return FirstRun;
    }

    public void setFirstRun(double FirstRun) {
        this.FirstRun = FirstRun;
    }

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double run();
    public abstract void showRecord(double tmp);
         
}