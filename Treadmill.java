package org.example;

public class Treadmill {

//    public Treadmill(Double heightWall, Double lenRun){
//        super(heightWall,lenRun);
//    }

    // сверху

    static double lenRun = 6;

    public double getLenRun(){
        return lenRun;
    }

    public void Treadmill (double lenRun){
        this.lenRun = lenRun;
    }

//    @Override
//    public String getInfoDev(){
//        return String.format("Длина дороги: %.0f", lenRun);
    //}
}
