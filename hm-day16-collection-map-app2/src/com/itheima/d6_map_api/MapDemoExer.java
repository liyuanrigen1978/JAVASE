package com.itheima.d6_map_api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liyuan_start
 * @create 2022-07-12 1:19
 */
public class MapDemoExer {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("娃娃",20);
        maps.put("iphoneX",100);//  Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei",100);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);

//        maps.clear();
//        System.out.println(maps);

        System.out.println(maps.isEmpty());

        Integer value = maps.get("生活用品");
        System.out.println(value);

        System.out.println(maps.remove("iphoneX"));
        System.out.println(maps);

        System.out.println(maps.containsKey("娃娃"));

        System.out.println(maps.containsValue(100));

        Set<String> keys = maps.keySet();
        System.out.println(keys);

        Collection<Integer> values = maps.values();
        System.out.println(values);


    }
}
