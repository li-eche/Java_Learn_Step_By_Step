package com.lyk.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        //通过“类名.类变量”的方式去引用name
        Student.name ="李一库";

        //对象.类变量(不推荐)
        Student s1 = new Student();
        s1.name = "马冬梅";

        Student s2 =new Student();
        s2.name ="秋雅";

        System.out.println(s1.name);//秋雅

        //2.实例变量的用法，属于每个对象的变量
        s1.age =23;
        s2.age =18;
        System.out.println();
    }
}
