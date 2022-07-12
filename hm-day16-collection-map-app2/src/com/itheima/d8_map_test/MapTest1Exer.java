package com.itheima.d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author liyuan_start
 * @create 2022-07-13 1:13
 */
public class MapTest1Exer {
    public static void main(String[] args) {
        String[] selects = {"A" , "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 80 ; i++) {
            sb.append(selects[r.nextInt(selects.length)]);

        }
        System.out.println(sb);

        Map<Character,Integer> maps = new HashMap<>();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(maps.containsKey(ch)){
                maps.put(ch,maps.get(ch)+1);
            }else{
                maps.put(ch,1);
            }
        }

        System.out.println(maps);



    }
}
