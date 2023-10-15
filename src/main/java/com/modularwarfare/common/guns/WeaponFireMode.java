package com.modularwarfare.common.guns;


import com.google.gson.annotations.SerializedName;

public enum WeaponFireMode {

    /**
     * SemiAutomatic fire mode
     */
    @SerializedName("半自动")
    半自动,

    /**
     * Fully automatic fire mode
     */
    @SerializedName("全自动")
    全自动,

    /**
     * Burst of shots fire mode
     */
    @SerializedName("爆发")
    爆发;

    public static WeaponFireMode fromString(String modeName) {
        for (WeaponFireMode fireMode : values()) {
            if (fireMode.name().equalsIgnoreCase(modeName)) {
                return fireMode;
            }
        }
        return null;
    }

}
