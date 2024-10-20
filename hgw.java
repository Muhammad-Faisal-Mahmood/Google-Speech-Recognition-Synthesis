/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public abstract class hgw
extends hfv {
    private final String a;

    protected hgw(String string) {
        this.a = string;
    }

    @Override
    public void a(RuntimeException runtimeException, hfu hfu2) {
        Log.e((String)"AbstractAndroidBackend", (String)"Internal logging error", (Throwable)runtimeException);
    }

    @Override
    public String d() {
        return this.a;
    }
}

