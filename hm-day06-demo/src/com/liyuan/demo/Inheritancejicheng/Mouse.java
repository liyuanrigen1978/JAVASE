package com.liyuan.demo.Inheritancejicheng;

/**
 * @author liyuan_start
 * @create 2022-06-28 1:10
 */
public class Mouse implements Usb {
    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void insert() {
        System.out.println(name + "设备连接了电脑！");
    }

    //这是鼠标自己独有的功能
    public void click(){
        System.out.println(name + "双击打开了一个文件！");
    }

    @Override
    public void pullOut() {
        System.out.println(name + "设备从电脑安全的拔出了！");
    }
}
