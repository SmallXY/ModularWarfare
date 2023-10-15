package com.modularwarfare.client.input;

public enum KeyType {

    GunReload("重装枪", 0x13), // R
    ClientReload("重新加载客户端", 0x43), // F9
    DebugMode("调试模式", 0x44), // F10
    FireMode("射击模式", 0x2F), // V
    Inspect("检查", 0x31), // N
    GunUnload("卸载钥匙", 0x16), // U
    AddAttachment("附件模式", 0x32), // M
    Flashlight("手电筒", 0x23), // H
    Inventory("打开背包", 0x30), // B


    Left("左侧（附件模式）", 203), // H
    Right("右侧（附件模式）", 205), // H
    Up("上（附件模式）", 200), // H
    Down("下（附件模式）", 208); // H


    //Keyboard
    public String displayName;
    public int keyCode;

    KeyType(String displayName, int keyCode) {
        this.displayName = displayName;
        this.keyCode = keyCode;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
