/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.preference.PreferenceManager
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class kmu {
    public static SharedPreferences a;

    static {
        kne kne2 = kne.b();
        try {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)jjj.c);
            a = sharedPreferences;
            return;
        }
        finally {
            kne2.close();
        }
    }
}

