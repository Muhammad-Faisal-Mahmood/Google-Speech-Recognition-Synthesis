/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;

public final class dvz {
    static {
        new ConcurrentHashMap();
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("PhenotypeStickyAccount", 0);
    }
}

