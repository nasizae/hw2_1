package com.company;

import java.util.Random;

public class Main {


    public static String Walk(int age,int temperature){
        String rezult="Можно идти гулять";
        String rezult2="оставайтесь дома";
        //a. если возраст человека от 20 до 45 лет и температура на улице от -20 до 30
        //градусов, то возвращаемый результат - “Можно идти гулять”;
        if(age>20&&age<45&&temperature>-2&&temperature<25){
            return rezult;
        }

       //b. если же человеку меньше 20 лет и температура на улице в диапазоне от 0
       //до 28 градусов, то результат снова - “Можно идти гулять”;
         if(age<20&&temperature>0&&temperature<28){
             return rezult;
         }
         if(age>45){
             if(temperature>-10&&temperature<25){
                 return rezult;
             }
         }
         else{
             return rezult2;
         }
        return null;


    }
    public static int generateRandomAge(){
        Random random=new Random();
        int age;
        age=random.nextInt(10,35);
        return age;
    }
    public static void main(String[] args){
        //Дз
      String rez=  Walk(25,89);
        System.out.println(rez);
        rez=  Walk(25,20);
        System.out.println(rez);
        rez=  Walk(45,20);
        System.out.println(rez);
        rez=  Walk(30,45);
        System.out.println(rez);
        rez=  Walk(23,24);
        System.out.println(rez);
        //Дз на сообразительность
        System.out.println("---------------------------------------------------------------");
        rez=  Walk(generateRandomAge(),24);
        System.out.println(rez);
    }
}
