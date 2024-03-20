package com.lyk.d2_static_method;

public class Test {
    public static void main(String[] args) {
        //类方法，可以用类名与对象调用，
        Student.printHelloWorld();

        Student s = new Student();
        s.printHelloWorld();

        //2.实例方法的用法
        //对象.实例方法
        s.prinPass();
//        Student.printPass();
    }
}
