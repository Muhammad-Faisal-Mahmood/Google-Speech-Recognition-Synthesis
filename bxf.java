/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.preference.PreferenceManager
 *  android.provider.Settings$Global
 *  android.util.LruCache
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.LruCache;

public final class bxf {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/settings/TtsConfigImpl");
    public final Context b;
    public final SharedPreferences c;
    private final ConnectivityManager d;
    private final LruCache e;

    public bxf(Context context) {
        SharedPreferences sharedPreferences;
        this.b = context;
        this.c = sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)context);
        fxf.K(context);
        fxf.K(sharedPreferences);
        this.d = (ConnectivityManager)context.getSystemService("connectivity");
        this.e = new bxe(this, context);
    }

    public final float a() {
        Context context = this.b;
        if (this.c.getBoolean(context.getString(2132017315), false)) {
            return 3.981f;
        }
        return 1.0f;
    }

    public final String b(String string) {
        return fxf.O((String)this.e.get((Object)string.replace('_', '-')));
    }

    public final String c() {
        Object object = this.b;
        if (!(((String)(object = this.c.getString(object.getString(2132017311), "script"))).equals("off") || ((String)object).equals("script") || ((String)object).equals("always"))) {
            return "script";
        }
        return object;
    }

    public final void d(boolean bl2) {
        Context context = this.b;
        SharedPreferences.Editor editor = this.c.edit();
        editor.putBoolean(context.getString(2132017188), bl2);
        editor.apply();
    }

    public final void e(String string, String string2) {
        Context context = this.b;
        SharedPreferences sharedPreferences = this.c;
        string = string.replace('_', '-');
        sharedPreferences = sharedPreferences.edit();
        sharedPreferences.putString(String.valueOf(context.getString(2132017263)).concat(String.valueOf(string)), string2);
        this.e.put((Object)string, (Object)string2);
        sharedPreferences.apply();
    }

    public final void f(boolean bl2) {
        Context context = this.b;
        SharedPreferences.Editor editor = this.c.edit();
        editor.putBoolean(context.getString(2132017198), bl2);
        editor.apply();
    }

    public final boolean g() {
        Context context = this.b;
        return this.c.getBoolean(context.getString(2132017188), true);
    }

    public final boolean h() {
        Context context = this.b;
        return this.c.getBoolean(context.getString(2132017198), false);
    }

    public final boolean i() {
        if (Settings.Global.getInt((ContentResolver)this.b.getContentResolver(), (String)"airplane_mode_on", (int)0) != 0) {
            return false;
        }
        NetworkInfo networkInfo = this.d.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }
}

