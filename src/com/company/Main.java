package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        //Дз
        //3. В методе main вызвать написанный метод 5 раз с различными входными данными
        //(аргументами) и распечатать результат в консоль.
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
       //5. При вызове метода, который формирует результат “можно ли идти гулять”
        //использовать генерирование случайного возраста с помощью метода
        //“generateRandomAge” test(23, 10); test(generateRandomAge(), 10);
        rez=  Walk(generateRandomAge(),24);
        System.out.println(rez);
    }


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
         //c. а если человеку больше 45 лет, то результат “Можно идти гулять”
        //формируется только тогда когда на улице температура в диапазоне от -10
        //до 25 градусов;
         if(age>45&&temperature>-10&&temperature<25){
                 return rezult;
         }
         //d. В остальных случаях метод должен возвращать результат - “Оставайтесь
         //дома”;
         else{
             return rezult2;
         }


    }
    //4. Написать метод в котором генерируется случайный возраст public static int
    //generateRandomAge(){........}
    public static int generateRandomAge(){
        Random random=new Random();
        int age;
        age=random.nextInt(5,35);
        return age;
    }

}
