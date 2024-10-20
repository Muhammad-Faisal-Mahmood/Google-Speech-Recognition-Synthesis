/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.preference.Preference;

final class atd {
    final int a;
    final int b;
    final String c;

    public atd(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.getLayoutResource();
        this.b = preference.getWidgetLayoutResource();
    }

    public final boolean equals(Object object) {
        if (!(object instanceof atd)) {
            return false;
        }
        object = (atd)object;
        return this.a == ((atd)object).a && this.b == ((atd)object).b && TextUtils.equals((CharSequence)this.c, (CharSequence)((atd)object).c);
    }

    public final int hashCode() {
        int n2 = this.a;
        String string = this.c;
        return ((n2 + 527) * 31 + this.b) * 31 + string.hashCode();
    }
}

