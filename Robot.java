package org.example;

public class Robot extends Creatures {

//    double jump = 1 + (Math.random() * 2);
//    double run = 1 + (Math.random() * 0.5);

    public Robot (Double jump, Double run,String name){
        super(jump, run,name);
    }

    @Override
    public void knowingMoving(){
        System.out.print("Walks like a robot\n");
    }



//    public void Robot (double jump, double run){
//        super.jump = jump;
//        this.run = run;
//    }
//
//    public void Robot (double jump){
//        super.jump = jump;
//    }
//
//    public void SetRun (double run){
//        super.run = run;
//    }
//    @Override
//    public String getInfo (){
//        return String.format("Высота прыжка робота: %.2f \nСкорость бега робота: %.2f",jump, run);
//    }
//
//    public Robot(){
//
//    }
//
//    @Override
//    public void actionJump(){
//        System.out.println("Робопрыжок " + jump);
//    }
//    @Override
//    public void actionRun(){
//        System.out.println("Бег по прямой!");
//    }
}
