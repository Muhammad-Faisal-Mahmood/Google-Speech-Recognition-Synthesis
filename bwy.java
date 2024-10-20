/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

public final class bwy
extends bku {
    public Context ai;
    private Preference aj;
    private PreferenceScreen ak;
    private btn al;
    private bxf am;

    @Override
    public final void G(String string) {
        this.a.f();
        this.E(2132213775, string);
    }

    @Override
    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.e().getContext();
        this.ai = object;
        this.am = ((bwx)fvd.l((Context)object, bwx.class)).A();
        this.al = ((bwx)fvd.l(this.ai, bwx.class)).k();
        this.e().setTitle(this.ai.getString(2132017500));
        object = (PreferenceScreen)this.aW(this.ai.getString(2132017188));
        this.ak = object;
        fxf.K(object);
        this.ak.setOnPreferenceClickListener(new bww(this, 1));
        object = this.aW(this.ai.getString(2132017286));
        this.aj = object;
        fxf.K(object);
        this.aj.setVisible(false);
        object = this.aW(this.ai.getString(2132017434));
        fxf.K(object);
        ((Preference)object).setOnPreferenceClickListener(new bww(this, 0));
        object = this.aW(this.ai.getString(2132017308));
        fxf.K(object);
        ((Preference)object).setOnPreferenceClickListener(new bww(this, 2));
        object = (DropDownPreference)this.aW(this.ai.getString(2132017311));
        if (object != null) {
            ((Preference)object).setSummary(((ListPreference)object).getEntry());
            ((Preference)object).setOnPreferenceChangeListener(new byi(object, 1));
        }
    }

    @Override
    public final void onDestroy() {
        this.al.d();
        super.onDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.am.g()) {
            fxf.K(this.ak);
            this.ak.setSummary(2132017190);
            return;
        }
        fxf.K(this.ak);
        this.ak.setSummary(2132017189);
    }
}

