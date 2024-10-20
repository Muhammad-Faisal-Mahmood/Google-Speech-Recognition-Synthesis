/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

abstract class klc
extends kgt {
    kmm c;
    long d;
    OutputStream e;
    boolean f;

    @Override
    public long a() {
        return this.d;
    }

    public kgs d(kgs kgs2) {
        return kgs2;
    }

    final void e(kln kln2, long l2) {
        this.c = kln2.a();
        this.d = l2;
        this.e = new klb(this, l2, kln2);
    }
}

