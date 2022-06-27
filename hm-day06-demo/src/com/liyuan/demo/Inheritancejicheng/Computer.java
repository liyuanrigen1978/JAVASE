package com.liyuan.demo.Inheritancejicheng;

/**
 * @author liyuan_start
 * @create 2022-06-28 1:20
 */
public class Computer {

    public void startUsb(Usb usb){
        usb.insert();

        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }

        usb.pullOut();

    }


}
