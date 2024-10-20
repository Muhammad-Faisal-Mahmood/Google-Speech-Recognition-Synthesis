/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;

final class amf {
    public final String a;
    public final boolean b;

    public amf(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && object.getClass() == amf.class) {
            object = (amf)object;
            if (TextUtils.equals((CharSequence)this.a, (CharSequence)((amf)object).a) && this.b == ((amf)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = true != this.b ? 1237 : 1231;
        return ((n2 + 31) * 31 + n3) * 31 + 1237;
    }
}

