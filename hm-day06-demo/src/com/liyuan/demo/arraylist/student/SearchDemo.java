package com.liyuan.demo.arraylist.student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-18 18:49
 */

/*
① 定义Student类，定义ArrayList集合存储如上学生对象信息，并遍历展示出来。
② 提供一个方法，可以接收ArrayList集合，和要搜索的学号，返回搜索到的学生对象信息，并展示。
③ 使用死循环，让用户可以不停的搜索。
 */


public class SearchDemo {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        //① 定义Student类，定义ArrayList集合存储如上学生对象信息，并遍历展示出来。
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("20180302","叶孤城",23,"护理一班"));
        list.add(new Student("20180303","东方不败",23,"推拿二班"));
        list.add(new Student( "20180304","西门吹雪",26,"中药学四班"));
        list.add(new Student( "20180305","梅超风",26,"神经科2班"));

        System.out.println("学号\t\t\t\t名称\t\t\t\t\t年龄\t\t\t\t\t班级");
        for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i).getId() + "\t\t\t" + list.get(i).getName() + "\t\t\t"
                + list.get(i).getAge() + "\t\t\t" + list.get(i).getClassName());
        }

        while (true){
            System.out.println("请输入要查询的学生id：");
            String searchId = s.next();
            Student student = searchStudent(list, searchId);
            if(student != null){
                System.out.println(student.getId() + "\t\t\t" + student.getName() + "\t\t\t"
                        + student.getAge() + "\t\t\t" + student.getClassName());
            }else{
                System.out.println("此学号不存在！");
            }
        }



    }


    public static Student searchStudent(ArrayList<Student> students,String searchId){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getId().equals(searchId)){
                return s;
            }
        }
        return null;

    }


}
