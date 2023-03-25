package org.example;

public class Wall {

//    public Wall(Double heightWall, Double lenRun){
//        super(heightWall,lenRun);
    //}
    //сверху

    static double heightWall = 3;

    public static double getheightWall() {
        return heightWall;
    }

    public void Wall(double lenWall){
        this.heightWall = lenWall;
    }

    public Wall(){

    }

//    @Override
//    public String getInfoDev() {
//        return String.format("Высота стены: %.0f", heightWall);
    //}

    public void SetWall(double lenWall) {
        this.heightWall = lenWall;
    }

    public double actionWall(){
//        System.out.println("olol" + lenWall);
        return heightWall;
    }
}
