package com.modularwarfare.common.guns;


import com.google.gson.annotations.SerializedName;

public enum AttachmentPresetEnum {

    @SerializedName("视野") 视野("视野"),
    @SerializedName("滑行") 滑行("滑行"),
    @SerializedName("握持") 握持("握持"),
    @SerializedName("手电筒") 手电筒("手电筒"),
    @SerializedName("魅力") 魅力("魅力"),
    @SerializedName("皮肤") 皮肤("皮肤"),
    @SerializedName("木桶") 木桶("木桶"),
    @SerializedName("库存") 库存("库存");



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
        return AttachmentPresetEnum.视野;
    }

    public String getName() {
        return this.typeName;
    }

}
