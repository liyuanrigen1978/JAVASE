package com.itheima.d1_collection_set;

/**
 * @author liyuan_start
 * @create 2022-07-09 14:39
 */
public class Techer implements Comparable<Techer> {
    private String name;
    private int age;
    private double higth;

    public Techer() {
    }

    public Techer(String name, int age, double higth) {
        this.name = name;
        this.age = age;
        this.higth = higth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHigth() {
        return higth;
    }

    public void setHigth(double higth) {
        this.higth = higth;
    }

    @Override
    public String toString() {
        return "Techer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", higth=" + higth +
                '}';
    }

    @Override
    public int compareTo(Techer o) {
        //return this.higth - o.higth;
        return Double.compare(this.higth,o.higth);
    }
}
