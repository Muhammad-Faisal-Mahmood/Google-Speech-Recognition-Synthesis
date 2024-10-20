/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import androidx.preference.SwitchPreference;
import j$.util.Objects;

public final class bwv
extends bku {
    public SwitchPreference ai;
    private Context aj;

    @Override
    public final void G(String string) {
        this.a.f();
        this.E(2132213761, string);
    }

    public final String K(boolean bl2) {
        String string = bl2 ? this.aj.getString(2132017190) : this.aj.getString(2132017189);
        return string;
    }

    @Override
    public final void onCreate(Bundle object) {
        SwitchPreference switchPreference;
        super.onCreate((Bundle)object);
        this.aj = this.e().getContext();
        this.e().setTitle(this.aj.getString(2132017191));
        bwq bwq2 = ((bwu)fvd.l(this.aj, bwu.class)).m();
        object = ((bwu)fvd.l(this.aj, bwu.class)).A();
        this.ai = switchPreference = Objects.requireNonNull((SwitchPreference)this.aW(this.aj.getString(2132017188)));
        fxf.K(switchPreference);
        boolean bl2 = ((bxf)object).g();
        this.ai.setChecked(bl2);
        this.ai.setTitle(this.K(bl2));
        this.ai.setOnPreferenceChangeListener(new bwz(this, object, bwq2, 1));
    }
}

