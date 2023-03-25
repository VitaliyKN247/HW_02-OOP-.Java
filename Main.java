package org.example;

/*
1)Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса.
Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // создал массив с 3 наследниками с данными внутри
        Creatures [] arr_1 = new Creatures[3];

        arr_1[0] = new People(1 + (Math.random() * 0.8), 2 + (Math.random() * 1.6),"Участник People");
        arr_1[1] = new Robot(1 + (Math.random() * 2), 1 + (Math.random() * 0.5),"Участник Robot");
        arr_1[2] = new Cat(1 + (Math.random() * 2.4), 2 + (Math.random() * 1.5),"Участник Cat");

//        int attempts = 3;  переменная с попытками

        System.out.println(Treadmill.lenRun);

        for (int i = 0; i < arr_1.length; i++) {
            System.out.println(arr_1[i].getJump());
//            for (int j = 0; j < attempts; j++) {
// хотел сделать по 3 попытки у участников, но для разного рандома скорее всего надо было выводить отдельный метод, что не указано в условиях задачи :)
                if (arr_1[i].getJump() > Wall.getheightWall())
                    System.out.println("Участник " + arr_1[i].getName() + " успешно прошел испытание на стене!");
                else System.out.println(arr_1[i].getName() + " не прошел испытание на стене");
            if (arr_1[i].getRun() > Treadmill.lenRun)
                System.out.println("Участник " + arr_1[i].getName() + " успешно прошел испытание на беговой дорожке!");
            else System.out.println(arr_1[i].getName() + " не прошел испытание на беговой дорожке");
//            }
        }

        // массив из двух устройств (стена и беговая дорожка)
//        Devicies [] arr_2 = new Devicies[2];
//        arr_2[0] = new Treadmill(6.0, 3.0);
//        arr_2[1] = new Wall(3.0, 6.0);


        /*
        закончил на создании стены и беговой дорожки. обозанчил в них данные
        через простое ветвление могу выводить данные по каждому классу о прохождении препятсвия
        необходимо сделать массив с участниками и заставить по очереди проходить через препятствие (+)
        включить рандом прыжка и бега для прохождения препятствий (+)
        определить значения в массив всех наследников класса (через getInfo они выводятся, но нужно выводить отдельные значения)
        (как дополнительно если останется время вывести их по местам выигрыша)
         */
//        People people = new People();+++
//        Cat cat = new Cat();
//        Robot robot = new Robot();
//        Wall wall = new Wall();
//        Treadmill machine = new Treadmill();


//   +++     Creatures [] arrayCreat = new Creatures[] {people, robot, cat}; // массив из всех наследников класса "Существа"
////        arrayCreat [0] = new Creatures();
////        arrayCreat [1] = new People();
////        arrayCreat [2] = new Robot();
////        arrayCreat [3] = new Cat();
//        Devicies [] arrayDev = new Devicies[] {wall, machine};


/*
цикл по выводу значений всех наследников
 */
//        for (int i = 0; i < arrayCreat.length; i++) {
////            System.out.println(arrayDev[i].getInfoDev());
//            for (int j = 1; j <arrayDev.length ; j++) {
//                if (arrayCreat[i].getInfo() > arrayDev[i].getInfoDev()){
//                    System.out.println("Участник прошел испытание");
//                } else {
//                    System.out.println("Неудача");
//                }
//            }
//        }





//        people.actionJump();
//        cat.actionJump();
//        robot.actionJump();
//        creatures.actionJump();
//        wall.actionWall();
/*
проверка на длину беговой дорожки и скорости робота
 */
//        if(machine.lenRun > robot.run){
//            System.out.println("No");
//        } else {
//            System.out.println("Yes");
//        }

    }
}