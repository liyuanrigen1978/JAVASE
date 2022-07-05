package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author liyuan_start
 * @create 2022-07-06 1:09
 */

/*

Collection
    list 有序、可重复、有索引。
        1 ArrayList
        2 LinekdList

    set 添加的元素是无序、不重复、无索引
        1 HashSet: 无序、不重复、无索引；
        2 LinkedHashSet: 有序、不重复、无索引。
        3 TreeSet：按照大小默认升序排序、不重复、无索引。


 */


public class CollectionDemo1Exer {
    public static void main(String[] args) {
        //ArrayList有序、可重复、有索引。
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        //HashSet、无序、不重复、无索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);




    }
}
