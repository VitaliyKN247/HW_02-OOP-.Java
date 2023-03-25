package org.example;

public class Cat extends Creatures {

//    double jump = 1 + (Math.random() * 2.4);
//    double run = 2 + (Math.random() * 1.5);

    public Cat (Double jump, Double run,String name){
        super(jump, run,name);
    }

    @Override
    public void knowingMoving(){
        System.out.print("Walks like a cat\n");
    }


//    public Cat (int jump, double run){
//        super.jump = jump;
//        super.run = run;
//    }
//
//    public Cat(){
//
//    }
//    @Override
//    public String getInfo (){
//        return String.format("Высота прыжка кота: %.2f \nСкорость бега кота: %.2f",jump, run);
//    }
//    @Override
//    public void actionJump(){
//        System.out.println("Тыгыдык!");
//    }
//
//    @Override
//    public void actionRun(){
//        System.out.println("Не могу, у меня лапки");
//    }
}
