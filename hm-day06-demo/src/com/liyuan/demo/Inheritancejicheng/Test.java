package com.liyuan.demo.Inheritancejicheng;

/**
 * @author liyuan_start
 * @create 2022-06-28 1:09
 */
public class Test {
    public static void main(String[] args) {
        //Usb usbMuose = new Mouse("华为鼠标");
        //Usb usbKeyboard = new Keyboard("苹果键盘");
        Computer c = new Computer();
        c.startUsb(new Mouse("华为鼠标"));
        System.out.println("**************************");
        c.startUsb(new Keyboard("苹果键盘"));



    }
}
