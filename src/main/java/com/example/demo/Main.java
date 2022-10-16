package com.example.demo;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        Thread myThread = new Thread(myCar);
        myThread.start();

       int fuel=60;
       while(fuel>0){
           System.out.println("Топливо"+ fuel +"%");
           fuel=fuel-10;
           try{
               sleep(1000);		//Приостанавливает поток на 1 секунду
           }catch(InterruptedException e){}
       }


        }

    }

