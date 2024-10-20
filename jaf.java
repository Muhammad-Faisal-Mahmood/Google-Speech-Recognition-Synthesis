/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;

final class jaf
extends jag {
    public iwx a;
    public iyh b;
    public iwx c;

    public jaf(izi izi2, int n2, jjo jjo2) {
        super(izi2, n2, jjo2);
    }

    @Override
    protected final int a(Parcel parcel) {
        izy.b(parcel, this.a);
        return 0;
    }

    @Override
    protected final int b(Parcel parcel) {
        int n2 = jjj.h(parcel, this.b);
        izy.b(parcel, this.c);
        this.d.u(this.e);
        return n2;
    }
}

