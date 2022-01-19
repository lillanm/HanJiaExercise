package com.lillanm.computer;


public class Mouse implements USB {

    private String name ;

    public Mouse(String name) {
        this.name = name;
    }

    public Mouse() {
    }

    @Override
    public void connect() {
        System.out.println(name+"成功链接了电脑~");
    }

    /*
    独有功能
     */
    public void DbClick(){
        System.out.println(name+"点击屏幕，一键三连~");
    }
    @Override
    public void unconnect() {
        System.out.println(name +"成功从电脑中拔出了~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
