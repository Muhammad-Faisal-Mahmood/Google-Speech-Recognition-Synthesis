/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;

public final class bvj
implements Comparable {
    public final buc a;
    public final brx b;
    public final String c;
    public int d;
    private final int e;

    public bvj(buc buc2, String string, brx brx2) {
        fxf.v(TextUtils.isEmpty((CharSequence)string) ^ true, "Invalid voice name %s", string);
        this.a = buc2;
        fxf.K(brx2);
        this.b = brx2;
        this.c = string;
        this.d = 0;
        this.e = 0;
    }
}

