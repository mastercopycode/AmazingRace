/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

/**
 *
 * @author asus
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //   register();
     showRecord();
    }
    public static void showRecord(){
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2005, 5.0),
                                new Dog("VANGOI",1950,10),
                                new Cat("TOM", 1960, 10, " ><"),
                                new Cat("KITTY", 1960, 5.0, " <3"),
                                new Hamster("BUBI", 1960, 0.5)};
        System.out.println("The First Record of Racer: ");
        
        for (Pet pet : racer) {
            double tmp = pet.run();
            pet.showRecord(tmp);
            pet.setFirstRun(tmp);
        }
        for (int i = 0; i < racer.length-1; i++) {
            for (int j = i+1; j < racer.length; j++) {
                if(racer[i].getFirstRun()>racer[j].getFirstRun()){
                    Pet tmp = racer[i];
                    racer[i] = racer[j];
                    racer[j] = tmp;
                }
            }
        }
        System.out.println("The Final Record of Racer: ");
        for (Pet pet : racer) {
            pet.showRecord(pet.getFirstRun());
        }
        
    }
//    public static void playWithAnonymousClass(){
//        Pet QuaiThu = new Pet(name, 0, 0) {
//            @Override
//            public double run() {
//            }
//            
//            @Override
//            public void showRecord(double tmp) {
//            }
//        };
//    }
//    public static void register(){
//        Cat bubi = new Cat("BUBI", 1950, 5.5, " ><");
//        bubi.showRecord();
//        Dog bibu = new Dog("BIBU",1950, 10);
//        Pet bedo = new Dog("BETO", 1950, 6.0);
//        Pet kitty = new Cat("KITTY", 1990, 5.0, " ><");
//        
//        bedo.showRecord();
//        kitty.showRecord();
//        bibu.showRecord();
//        
//    }
    
}
