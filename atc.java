/*
 * Decompiled with CFR 0.152.
 */
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

final class atc
implements asp {
    final PreferenceGroup a;
    final ate b;

    public atc(ate ate2, PreferenceGroup preferenceGroup) {
        this.b = ate2;
        this.a = preferenceGroup;
    }

    @Override
    public final void a(Preference preference) {
        this.a.e(Integer.MAX_VALUE);
        this.b.b();
    }
}

