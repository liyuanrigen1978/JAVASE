package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author liyuan_start
 * @create 2022-07-06 1:51
 */
public class CollectionDemo01Exer {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);

        //1 获取迭代器 Iterator
        //2 next()是先取值，在往后移一位
        //[赵敏, 小昭, 素素, 灭绝]
        //  it
        Iterator<String> it =lists.iterator();
        //System.out.println(it.next());
        while(it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }



    }
}
