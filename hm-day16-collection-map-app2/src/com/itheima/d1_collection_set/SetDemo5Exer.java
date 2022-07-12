package com.itheima.d1_collection_set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author liyuan_start
 * @create 2022-07-09 14:15
 */
public class SetDemo5Exer {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);


        Set<Techer> setTechers = new TreeSet<>();
        setTechers.add(new Techer("老师1",33,178.3));
        setTechers.add(new Techer("老师2",23,191.3));
        setTechers.add(new Techer("老师3",45,168.3));
        System.out.println(setTechers);

    }
}
