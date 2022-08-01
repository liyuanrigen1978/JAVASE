package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liyuan_start
 * @create 2022-07-29 10:04
 */
public class StreamTestExer {
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        Collections.addAll(names, "张三丰","张无忌","周芷若","赵敏","张强");
        System.out.println(names);

//        // 1、从集合中找出姓张的放到新集合
//        List<String> zhangList = new ArrayList<>();
//        for (String name : names) {
//            if(name.startsWith("张")){
//                zhangList.add(name);
//            }
//        }
//        System.out.println(zhangList);
//
//        List<String> zhangThreeList= new ArrayList<>();
//        for (String name : zhangList) {
//            if(name.length() == 3){
//                zhangThreeList.add(name);
//            }
//        }
//        System.out.println(zhangThreeList);

        names.stream().filter(s -> s.startsWith("张")).
                       filter(s -> s.length() == 3).
                       forEach(s -> System.out.println(s));

    }

}
