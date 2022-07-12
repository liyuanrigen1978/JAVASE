package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liyuan_start
 * @create 2022-07-12 1:31
 */
public class MapDemo01Exer {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        // 1.添加元素: 无序，不重复，无索引。
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);

        Set<String> keys = maps.keySet();
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + " ---> " + value);
        }

    }

}
