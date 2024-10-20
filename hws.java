/*
 * Decompiled with CFR 0.152.
 */
public abstract class hws
extends hwv
implements hwt {
    public hwl r = hwl.a;

    @Override
    public final Object aG(gpm gpm2) {
        this.h(gpm2);
        Object object = this.r.l((hwu)gpm2.a);
        if (object == null) {
            return gpm2.d;
        }
        return gpm2.k(object);
    }

    public final hwl c() {
        hwl hwl2 = this.r;
        if (hwl2.c) {
            this.r = hwl2.d();
        }
        return this.r;
    }

    public final void h(gpm gpm2) {
        hwv hwv2 = (hwv)this.C(6);
        if (gpm2.c == hwv2) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}

