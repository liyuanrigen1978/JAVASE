package com.itheima.d6_singleinstance;

/**
 * @author liyuan_start
 * @create 2022-06-23 1:44
 */

//饿汉式
public class SinglePerson {
    //构造器私有
    private SinglePerson(){}

    //对外暴露一个接口
    public static SinglePerson instance = new SinglePerson();



}
