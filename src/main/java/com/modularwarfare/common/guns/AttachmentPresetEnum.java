package com.modularwarfare.common.guns;


import com.google.gson.annotations.SerializedName;

public enum AttachmentPresetEnum {

    @SerializedName("倍镜") 倍镜("倍镜")/*原 sight */,
    @SerializedName("滑动装置") 滑动装置("滑动装置")/*原 slide */,
    @SerializedName("握柄") 握柄("握柄")/*原 grip */,
    @SerializedName("手电筒") 手电筒("手电筒")/*原 flashlight */,
    @SerializedName("挂件") 挂件("挂件")/*原 charm*/,
    @SerializedName("皮肤") 皮肤("皮肤")/*原 skin*/,
    @SerializedName("枪管") 枪管("枪管")/*原 barrel*/,
    @SerializedName("枪托") 枪托("枪托")/*原 stock*/;

    public String typeName;

    AttachmentPresetEnum(String typeName) {
        this.typeName = typeName;
    }

    public static AttachmentPresetEnum getAttachment(String typeName) {
        for (AttachmentPresetEnum attachmentEnum : values()) {
            if (attachmentEnum.typeName.equalsIgnoreCase(typeName)) {
                return attachmentEnum;
            }
        }
        return AttachmentPresetEnum.倍镜;
    }

    public String getName() {
        return this.typeName;
    }

}
