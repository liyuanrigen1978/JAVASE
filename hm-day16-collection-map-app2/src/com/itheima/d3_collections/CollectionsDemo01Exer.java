package com.itheima.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liyuan_start
 * @create 2022-07-09 18:25
 */
public class CollectionsDemo01Exer {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
//        lists.add("楚留香");
//        lists.add("胡铁花");
//        lists.add("张无忌");
//        lists.add("陆小凤");

        Collections.addAll(lists,"楚留香",
                                            "胡铁花",
                                            "张无忌",
                                            "陆小凤");
        System.out.println(lists);

        Collections.shuffle(lists);
        System.out.println(lists);

    }
}
