package org.example;

public abstract class Creatures {
    private Double jump;
    private Double run;

    private String name;

    public Creatures (Double jump, Double run,String name){
        this.jump = jump;
        this.run = run;
        this.name = name;
    }

    public Double getJump(){
        return jump;
    }

    public Double getRun(){
        return run;
    }

    public String getName(){
        return name;
    }

    public abstract void knowingMoving();



//    double jump;  ++
//    double run;   ++

//    public int getJump(){
//        return jump;
//    }
//
//    public void Creatures(int jump){
//        this.jump = jump;
//    }




//    public Creatures(){   ++
//
//    }

    /**
     *
     * @return метод, выводящий на экран консоли не ссылки полей, а сами значения. (создано во всех наследниках)
     */

//    public String getInfo (){     ++
//        return String.format("",jump);
//    }
//
//    public void getDouble(double jump){   +++
//        this.jump = jump;
//    }


    /**
     * Вывод прыжка на консоль
     * в наслдниках выведено через override
     */

//    public void actionJump(){ ++
//        System.out.println();
//    }


    /**
     * Вывод ,бега на консоль
     * в наслдниках выведено через override
     */

//    public void actionRun(){   ++
//        System.out.println();
//    }
}
