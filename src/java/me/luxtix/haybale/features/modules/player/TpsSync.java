package me.luxtix.haybale.features.modules.player;

import me.luxtix.haybale.features.modules.Module;
import me.luxtix.haybale.features.setting.Setting;

public class TpsSync
        extends Module {
    private static TpsSync INSTANCE = new TpsSync();
    public Setting<Boolean> mining = this.register(new Setting<Boolean>("Mining", true));
    public Setting<Boolean> attack = this.register(new Setting<Boolean>("Attack", false));

    public TpsSync() {
        super("TpsSync", "Syncs your client with the TPS.", Module.Category.PLAYER, true, false, false);
        this.setInstance();
    }

    public static TpsSync getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TpsSync();
        }
        return INSTANCE;
    }

    private void setInstance() {
        INSTANCE = this;
    }
}
