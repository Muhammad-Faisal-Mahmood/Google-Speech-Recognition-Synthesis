/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;

public final class gpv {
    public final gzx a;

    public gpv(gzx gzx2) {
        this.a = gzx2;
    }

    public final String toString() {
        return TextUtils.join((CharSequence)" -> ", (Iterable)this.a);
    }
}

