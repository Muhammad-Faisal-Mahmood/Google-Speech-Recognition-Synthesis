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
import j$.time.temporal.t;

public final class v
extends Enum
implements o {
    public static final /* enum */ v BCE;
    public static final /* enum */ v CE;
    private static final v[] a;

    static {
        Enum enum_ = new Enum("BCE", 0);
        BCE = enum_;
        Enum enum_2 = new Enum("CE", 1);
        CE = enum_2;
        a = new v[]{enum_, enum_2};
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    public static v[] values() {
        return (v[])a.clone();
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
        return k2.d(this.getValue(), a2);
    }

    @Override
    public final int getValue() {
        return this.ordinal();
    }

    @Override
    public final /* synthetic */ int p(p p2) {
        return i_0.f(this, (a)p2);
    }

    @Override
    public final t t(p p2) {
        return l.d(this, p2);
    }
}

