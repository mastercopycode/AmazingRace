/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Random;

/**
 *
 * @author asus
 */
public class Hamster extends Pet{
    public static final double MAX_SPEED = 10;

    public Hamster(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        Random x = new Random();
        return x.nextDouble()*MAX_SPEED;
    }
   
    public void showRecord(double tmp) {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%-5s|%4.1f|\n",
                                         "Hamster",name,yob,weight,"",tmp);
    }
    
    
}
