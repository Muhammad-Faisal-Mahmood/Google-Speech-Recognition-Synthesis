/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;

public final class eyp
extends Exception {
    public eyp(Intent intent) {
        super("Intent not registered in manifest: ".concat(String.valueOf(String.valueOf(intent))));
    }
}

