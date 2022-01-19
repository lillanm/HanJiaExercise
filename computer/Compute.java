package com.lillanm.computer;

public class Compute {
    private String name;

    public Compute(String name) {
        this.name = name;
    }

    public Compute() {
    }

    /*
    提供安装USB设备的入口
     */
    public void installUsb(USB usb){
        //多态：USB == 可能是鼠标，也可能是键盘
        usb.connect();
        if (usb instanceof KeyBoard){
            KeyBoard keyBoard =(KeyBoard) usb;
            keyBoard.keyDown();
        }else if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.DbClick();
        }

        usb.unconnect();
    }

    /*
    电脑启动程序
     */
    public void Start(){
        System.out.println(name+"电脑启动了~");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
