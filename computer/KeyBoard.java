package com.lillanm.computer;


public class KeyBoard implements USB {

    private String name ;

    public KeyBoard(String name) {
        this.name = name;
    }

    public KeyBoard() {
    }

    @Override
    public void connect() {
        System.out.println(name+"成功链接了电脑~");
    }

    /*
    独有功能
     */
    public void keyDown(){
        System.out.println(name+"键盘发出了友好问候~");
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
