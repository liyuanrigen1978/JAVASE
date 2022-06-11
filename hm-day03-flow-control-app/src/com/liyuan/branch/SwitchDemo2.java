package com.liyuan.branch;


/*
执行流程：
    先执行表达式的值，拿着这个值去与case后的值进行匹配。
    匹配哪个case的值为true就执行哪个case，遇到break就跳出switch分支。
    如果case后的值都不匹配则执行default代码。

switch分支注意事项
    表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long。
    case给出的值不允许重复，且只能是字面量，不能是变量。
    不要忘记写break，否则会出现穿透现象。

switch的穿透性
    如果代码执行到没有写break的case块，执行完后将直接进入下一个case块执行代码（而且不会进行任何匹配），
    直到遇到break才跳出分支，这就是switch的穿透性。


 */


public class SwitchDemo2 {
    public static void main(String[] args) {
        // 目标：学会使用switch分支结构，理解流程
        // 周一：埋头苦干，解决bug                                  周五：今晚吃鸡
        // 周二：请求大牛程序员帮忙                             周六：与王婆介绍的小芳相亲
        // 周三：今晚啤酒、龙虾、小烧烤                              周日：郁郁寡欢、准备上班。
        // 周四： 主动帮助新来的女程序解决bug
        String weekday = "周二";
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干，解决bug ");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("郁郁寡欢、准备上班");
                break;
            default:
                System.out.println("数据有误！");
        }
    }
}
