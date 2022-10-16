package com.example.demo;
import java.lang.Math;
import static java.lang.Thread.sleep;


public class Car implements Runnable{

    @Override
    public void run() {

        double speed =  (Math.random()*((1200-600)+1))+600;         //скорость
        int distance = 10000;                                       //дистанция
        double Passed_distance=0;                                   //пройденное растояние
        double time=0;                                              //прошедшее время
        double timer;                                               //отсавшееся время

        while (Passed_distance<distance){

            timer =  (distance-Passed_distance)/speed;              //Сколько времени до конца маршрута
            time++;
            Passed_distance = (speed * time);                       //Пройденное расстояние


            System.out.println("Текущая сткорость " + speed + " м/с");
            System.out.println("Время: " + time + " секунд");
            System.out.println("Пройденное расстояние " + Passed_distance + " метров");
            System.out.println("Времени до конца пути " + timer);
            System.out.println();



            try{
                sleep(1000);		                            //Приостанавливает поток на 1 секунду
            }catch(InterruptedException e){}

        }

        double Minustime = (Passed_distance-distance)/speed;        //Расчитывает на какой секунде машина проехала 10000 метр
        time=time-Minustime;

        System.out.println("Итоговое время: " + time + " секунды");
    }
}

