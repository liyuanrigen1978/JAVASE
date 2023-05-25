package com.itheima.d3_collection_traversal;
import java.util.ArrayList;
import java.util.Collection;

/**
     目标：Collection集合的遍历方式。

     什么是遍历? 为什么开发中要遍历？
     遍历就是一个一个的把容器中的元素访问一遍。
     开发中经常要统计元素的总和，找最值，找出某个数据然后干掉等等业务都需要遍历。

     Collection集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
     Collection集合的遍历方式有三种:
         （1）迭代器。
         （2）foreach(增强for循环)。
         （3）JDK 1.8开始之后的新技术Lambda表达式。
     c.JDK 1.8开始之后的新技术Lambda表达式。
 */
public class CollectionDemo03Exer {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("殷素素");
        lists.add("周芷若");
        System.out.println(lists);


//       1
//        lists.forEach(new Consumer<String>(){
//
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });


//       2
        lists.forEach(s-> System.out.println(s));
    }
}