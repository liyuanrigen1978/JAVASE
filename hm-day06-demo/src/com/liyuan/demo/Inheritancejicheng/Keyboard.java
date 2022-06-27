package com.liyuan.demo.Inheritancejicheng;

/**
 * @author liyuan_start
 * @create 2022-06-28 1:10
 */
public class Keyboard implements Usb {
    private String name;

    public Keyboard() {
    }

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void insert() {
        System.out.println(name + "设备连接了电脑！");
    }

    //这是键盘自己独有的输入功能
    public void input(){
        System.out.println(name + "打出了一段文字！");
    }

    @Override
    public void pullOut() {
        System.out.println(name + "设备从电脑安全的拔出了！");
    }
}
