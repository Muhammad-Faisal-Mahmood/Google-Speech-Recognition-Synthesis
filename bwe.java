/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.preference.PreferenceManager
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public abstract class bwe
extends ghs {
    public Context a;
    public bwq b;
    public bwp c;
    public bxf d;
    private SharedPreferences.OnSharedPreferenceChangeListener g;

    static {
        dqy dqy2 = dqy.a;
        if (dqy2.g == null) {
            dqy2.g = dmz.a();
        }
    }

    @Override
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        t.b((Context)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onCreate() {
        Object object;
        super.onCreate();
        dqy.a.c(this);
        Object object2 = new drn();
        brt.a(this.a);
        boolean bl2 = brt.c();
        boolean bl3 = true;
        if (!bl2) {
            dua.e(this.a);
        } else {
            object = dua.a;
            object = duc.a;
            synchronized (object) {
                if (!duc.e) {
                    bl2 = duc.c;
                } else if (!duc.b) {
                    object2 = duc.e ? duc.f : duc.d;
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot set enableTestMode after a flag was already read. See cause for stack trace where first read occurred.", (Throwable)object2);
                    throw illegalStateException;
                }
                duc.b = true;
            }
        }
        object = this.b;
        bxf bxf2 = this.d;
        try {
            bl3 = bl2 = bxf2.c.getBoolean(bxf2.b.getString(2132017188), true);
        }
        catch (Exception exception) {
            a.as(bxf.a.f(), "Potentially unreadable resource table. Returning default.", "com/google/android/apps/speech/tts/googletts/settings/TtsConfigImpl", "getAnalytics", 'Z', "TtsConfigImpl.java", exception);
        }
        ((bwq)object).a(bl3);
        this.g = new bwd(this);
        PreferenceManager.getDefaultSharedPreferences((Context)this.a).registerOnSharedPreferenceChangeListener(this.g);
        object = this.c;
        ((bwp)object).c = kl.o(new bwo(object, 0));
        djv.a().e((drn)object2, new djt("Application.onCreate"));
    }
}

