package com.lyk.d4_static_attention;

public class Student {
    static String schoolName;//类变量
    double score;//实例变量

    //1.类方法中可以直接访问类的成员，不可直接访问实例成员
    public static  void printHelloWorld(){
        //注意：同一类中，访问类成员，可以省略类名不写
        Student.schoolName ="黑马";
        printHelloWorld2();

        System.out.println(score);//报错
        printPass();//报错的


    }
    //类方法
    public static void printHelloWorld2(){

    }

    //2.实例方法中既可以直接访问类成员，也可以直接访问实例成员
    //实例方法
    //3.实例方法中可以出现this关键字，类方法中不可以出现this关键字，因为this是获取当前对象，而类方法没有对象调用
    public void printPass(){
        schoolName = "黑马2";
        printHelloWorld2();

        System.out.println(score);
    }
}
