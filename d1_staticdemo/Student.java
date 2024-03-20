package com.lyk.d1_staticdemo;

public class Student {
    //类变量，加上static时类变量,
    //会被类的全部对象共享
    static String name;
    //实例变量（对象的变量）
    //属于每个对象，必须用对象访问
    int age;
}
