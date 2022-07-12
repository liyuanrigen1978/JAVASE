package com.itheima.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liyuan_start
 * @create 2022-07-09 18:35
 */
public class CollectionsDemo02Exer {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Collections.addAll(apples,new Apple("红富士", "红色", 9.9, 500),
                                  new Apple("青苹果", "绿色", 15.9, 300),
                                  new Apple("绿苹果", "青色", 29.9, 400),
                                  new Apple("黄苹果", "黄色", 9.8, 500));
        Collections.sort(apples);
        System.out.println(apples);

    }
}
