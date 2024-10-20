/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class cac {
    public static final Lock a = new ReentrantLock();
    public static cac b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    public cac(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String string) {
        this.c.lock();
        try {
            string = this.d.getString(string, null);
            return string;
        }
        finally {
            this.c.unlock();
        }
    }
}

