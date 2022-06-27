package com.itheima.d6_singleinstance;

public class Test {
    public static void main(String[] args) {
//        SingleInstance1 s1 = new SingleInstance1();
//        SingleInstance1 s2 = new SingleInstance1();
//        SingleInstance1 s3 = new SingleInstance1();

//        SingleInstance1 s1 = SingleInstance1.instance;
//        SingleInstance1 s2 = SingleInstance1.instance;
//        SingleInstance1 s3 = SingleInstance1.instance;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s1 == s2);


        SinglePerson s1 = SinglePerson.instance;
        SinglePerson s2 = SinglePerson.instance;
        SinglePerson s3 = SinglePerson.instance;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s2);


    }
}