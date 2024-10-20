/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.XmlResourceParser
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import org.xmlpull.v1.XmlPullParser;

public final class atj {
    public boolean a;
    public PreferenceScreen b;
    public ati c;
    public atg d;
    public ath e;
    private final Context f;
    private long g = 0L;
    private SharedPreferences h;
    private SharedPreferences.Editor i;
    private final String j;
    private int k = 0;

    public atj(Context context) {
        this.f = context;
        this.j = String.valueOf(context.getPackageName()).concat("_preferences");
        this.h = null;
    }

    private final void h(boolean bl2) {
        SharedPreferences.Editor editor;
        if (!bl2 && (editor = this.i) != null) {
            editor.apply();
        }
        this.a = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a() {
        synchronized (this) {
            long l2 = this.g;
            this.g = 1L + l2;
            return l2;
        }
    }

    public final SharedPreferences.Editor b() {
        if (this.a) {
            if (this.i == null) {
                this.i = this.c().edit();
            }
            return this.i;
        }
        return this.c().edit();
    }

    public final SharedPreferences c() {
        if (this.h == null) {
            Context context = this.k != 1 ? this.f : ag$$ExternalSyntheticApiModelOutline1.m(this.f);
            this.h = context.getSharedPreferences(this.j, 0);
        }
        return this.h;
    }

    public final Preference d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.b;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.b(charSequence);
    }

    public final PreferenceScreen e(Context object, int n2, PreferenceScreen preferenceScreen) {
        this.h(true);
        int n3 = atf.a;
        Object[] objectArray = new Object[2];
        String string = String.valueOf(Preference.class.getPackage().getName()).concat(".");
        String string2 = String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".");
        XmlResourceParser xmlResourceParser = object.getResources().getXml(n2);
        try {
            object = atf.a((XmlPullParser)xmlResourceParser, preferenceScreen, (Context)object, objectArray, this, new String[]{string, string2});
            object = (PreferenceScreen)object;
            ((Preference)object).onAttachedToHierarchy(this);
            this.h(false);
            return object;
        }
        finally {
            xmlResourceParser.close();
        }
    }

    public final void f() {
        this.k = 1;
        this.h = null;
    }

    public final void g(Preference preference) {
        atg atg2 = this.d;
        if (atg2 != null) {
            atg2.B(preference);
        }
    }
}

