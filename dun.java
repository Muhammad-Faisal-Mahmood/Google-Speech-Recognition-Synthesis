/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
import android.content.SharedPreferences;
import java.util.Map;

public final class dun {
    public static final int a = 0;
    private static final Map b = new ot();
    private final SharedPreferences c;
    private final SharedPreferences.OnSharedPreferenceChangeListener d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a() {
        synchronized (dun.class) {
            Object object = b;
            SharedPreferences sharedPreferences = object.values().iterator();
            if (!sharedPreferences.hasNext()) {
                object.clear();
                return;
            }
            object = (dun)sharedPreferences.next();
            sharedPreferences = ((dun)object).c;
            sharedPreferences = ((dun)object).d;
            throw null;
        }
    }
}

