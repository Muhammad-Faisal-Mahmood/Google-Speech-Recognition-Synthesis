/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.i_0;
import j$.time.chrono.o;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.r;

public final class t
extends Enum
implements o {
    public static final /* enum */ t AH;
    private static final t[] a;

    static {
        Enum enum_ = new Enum("AH", 0);
        AH = enum_;
        a = new t[]{enum_};
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    public static t[] values() {
        return (t[])a.clone();
    }

    @Override
    public final /* synthetic */ long B(p p2) {
        return i_0.g(this, p2);
    }

    @Override
    public final /* synthetic */ Object F(r r2) {
        return i_0.m(this, r2);
    }

    @Override
    public final /* synthetic */ boolean e(p p2) {
        return i_0.i(this, p2);
    }

    @Override
    public final k g(k k2) {
        a a2 = j$.time.temporal.a.ERA;
        return k2.d(1, a2);
    }

    @Override
    public final int getValue() {
        return 1;
    }

    @Override
    public final /* synthetic */ int p(p p2) {
        return i_0.f(this, (a)p2);
    }

    @Override
    public final j$.time.temporal.t t(p p2) {
        if (p2 == j$.time.temporal.a.ERA) {
            return j$.time.temporal.t.j(1L, 1L);
        }
        return l.d(this, p2);
    }
}

