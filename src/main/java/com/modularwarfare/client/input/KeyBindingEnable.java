package com.modularwarfare.client.input;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.KeyModifier;

public class KeyBindingEnable extends KeyBinding {

    public KeyBindingEnable(KeyBinding keybinding) {
        super(keybinding.getKeyDescription(),
                keybinding.getKeyConflictContext(),
                keybinding.getKeyModifier(),
                keybinding.getKeyCode(),
                "CLASH 服务器");
    }

    public void setKeyModifierAndCode(KeyModifier keyModifier, int keyCode) {
        super.setKeyModifierAndCode(keyModifier, keyCode);
    }
}
