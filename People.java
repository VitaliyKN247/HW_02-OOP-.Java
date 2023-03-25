package org.example;


public class People extends Creatures {

    public People(double jump, double run, String name){
        super(jump, run, name);
    }


    @Override
    public void knowingMoving(){
        System.out.print("Walks\n");
    }


//    double jump = 1 + (Math.random() * 0.8);
//    double run = 2 + (Math.random() * 1.6);
//
//
//
//    public People(double jump, double run) {
//        super.jump = jump;
//        super.run = run;
//    }
//
//    public People() {
//
//    }
//
//    //    @Override
//    public String getInfo() {
//        return String.format("Высота прыжка человека: %.2f \nСкорость бега человека: %.2f", jump, run);
//    }
//    @Override
//    public void getDouble(double jump){
//        this.jump = jump;
//    }
//
//    @Override
//    public void actionJump() {
//        System.out.println("Прыжок как у Усейн Болта");
//    }
//
//    @Override
//    public void actionRun() {
//        System.out.println("Стандартная пробежка");
//    }
}
