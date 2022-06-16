package com.liyuan.demo.shopcat1;

/**
 * @author liyuan_start
 * @create 2022-06-14 1:13
 */

/*


购物车模块模拟

需求
    模拟购物车模块的功能，需要实现添加商品到购物车中去，同时需要提供修改商品的
    购买数量，结算商品价格功能（请使用面向对象编程思想）。
分析
⚫ 购物车本身就是一个对象: 可以使用数组对象代表它。
⚫ 购物车中的每个商品都是一个对象。



 */


import java.util.Scanner;

/**
 需求：模拟购物车的功能。
 1、定义一个商品类：Article(属性：名称、价格)
 2、定义一个数组容器存储商品对象的，代表购物车对象。
 */


public class ShopCar {
    public static void main(String[] args) {

        Goods[] shopCar = new Goods[10];
        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("添加商品：add");
            System.out.println("查看商品：query");
            System.out.println("修改数量：update");
            System.out.println("结算价格：pay");
            System.out.println("请您选择要操作的功能：");
            String command = scan.next();
            switch(command){
                case "add":
                    add(shopCar);
                    break;
                case "query":
                    query(shopCar);
                    break;
                case "update":
                    update(shopCar);
                    break;
                case "pay":
                    pay(shopCar);
                    break;
            }
        }

        // 添加商品加入到购物车中去。
        // 查看购物车中的商品信息
        // 修改购物车中的商品信息
        // 付款

    }

    // 添加商品加入到购物车中去。
    public static void add(Goods[] shopCar){
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入商品的名称：");
        String name = sc.next();
        System.out.println("请您输入商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请您输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        Goods goods = new Goods(name,price,buyNumber);
//        goods.name = name;
//        goods.price=price;
//        goods.buyNumber=buyNumber;

        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i] == null){
                shopCar[i] = goods;
                break;
            }
        }
        System.out.println("商品添加成功！");
    }
    // 查看购物车中的商品信息
    public static void query(Goods[] shopCar){
        System.out.println("商品名称 \t商品价格 \t商品的购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods goods = shopCar[i];
            if(goods != null){
                System.out.println(goods.getName() +"\t\t" + goods.getPrice() + "\t\t\t"+ goods.getBuyNumber());
            }else{
                break;
            }
        }

    }
    // 修改购物车中的商品信息
    public static void update(Goods[] shopCar){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("请输入要修改的商品的名称");
            String name = scan.next();
            Goods goods = getGoodsByName(name,shopCar);

            if(goods != null){
                System.out.println("请修改数量");
                int buyNumber = scan.nextInt();
                goods.setBuyNumber(buyNumber);
                System.out.println("该商品的数量修改了");
                break;
            }else{
                System.out.println("购物车中没有该商品");
            }


        }


    }

    public static Goods getGoodsByName(String name, Goods[] shopCat){
        for (int i = 0; i < shopCat.length; i++) {
            Goods goods = shopCat[i];
            if(goods != null && goods.getName().equals(name)){
                return goods;
            }else{

            }
        }
        return null;
    }



    // 付款
    public static void pay(Goods[] shopCar){
        query(shopCar);
        double money = 0;

        
        for (int i = 0; i < shopCar.length; i++) {
            //Goods goods = shopCar[i];
            if(shopCar[i] != null){
                money += (shopCar[i].getPrice() * shopCar[i].getBuyNumber()) ;
            }else{
                break;
            }
        }
        System.out.println("您这次的购买金额是：" + money);
    }



}
