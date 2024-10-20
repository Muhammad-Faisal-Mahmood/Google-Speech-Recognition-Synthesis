/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;

public final class aif {
    public final String a;
    public final adu b;
    public final adu c;
    public final int d;
    public final int e;

    public aif(String string, adu adu2, adu adu3, int n2, int n3) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        int n4 = n3;
        if (n2 != 0) {
            if (n3 == 0) {
                n4 = 0;
                bl3 = bl2;
            } else {
                bl3 = false;
                n4 = n3;
            }
        }
        abr.d(bl3);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.a = string;
            this.b = adu2;
            abr.i(adu3);
            this.c = adu3;
            this.d = n2;
            this.e = n4;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aif)object;
            if (this.d == ((aif)object).d && this.e == ((aif)object).e && this.a.equals(((aif)object).a) && this.b.equals(((aif)object).b) && this.c.equals(((aif)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.d;
        String string = this.a;
        return ((((n2 + 527) * 31 + this.e) * 31 + string.hashCode()) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
}

