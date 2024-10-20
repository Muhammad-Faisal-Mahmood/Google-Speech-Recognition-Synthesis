/*
 * Decompiled with CFR 0.152.
 */
import androidx.preference.Preference;

public final class grm
implements asp {
    public final grn a;
    public final String b;
    public final asp c;

    public /* synthetic */ grm(grn grn2, asp asp2) {
        this.a = grn2;
        this.b = "Add a language clicked";
        this.c = asp2;
    }

    @Override
    public final void a(Preference preference) {
        Object object = this.a.a;
        asp asp2 = this.c;
        object = ((bzo)object).H("OnPreferenceClickListener", this.b);
        try {
            asp2.a(preference);
            return;
        }
        finally {
            object.close();
        }
    }
}

