package com.lillanm.computer;

/**
    目标：USB设备模拟
    1.定义USB接口：接入  拔出
    2.定义2个USB的实现类：鼠标  键盘
    3.创建一个电脑对象，创建USB设备对象，安装启动
 */
public class Test {
    public static void main(String[] args) {
        //a.创建电脑对象
        Compute c = new Compute("lillanm电脑");
        c.Start();

        //创建鼠标对象，键盘对象
        USB usb = new KeyBoard("lillanm键盘");
        c.installUsb(usb);

        USB usb1 = new Mouse("lillanm鼠标");
        c.installUsb(usb1);
    }
}
