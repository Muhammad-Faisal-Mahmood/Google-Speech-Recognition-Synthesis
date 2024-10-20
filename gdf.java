/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.PowerManager
 */
import android.os.PowerManager;

public final class gdf
implements imb {
    private final jnu a;

    public gdf(jnu jnu2) {
        this.a = jnu2;
    }

    public final PowerManager a() {
        PowerManager powerManager = (PowerManager)((ilt)this.a).a().getSystemService("power");
        idi.m(powerManager);
        return powerManager;
    }
}

