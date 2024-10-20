/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
import android.content.Context;
import android.os.Looper;

public final class aio {
    final Context a;
    final afl b;
    final gui c;
    final gui d;
    final gui e;
    public gui f;
    final gui g;
    final gte h;
    Looper i;
    final adi j;
    final aka k;
    public boolean l;
    final aig m;

    public aio(Context context, ajz object) {
        aim aim2 = new aim(object, 2);
        aim aim3 = new aim(context, 3);
        aim aim4 = new aim(context, 4);
        object = new bpr(1);
        aim aim5 = new aim(context, 5);
        ain ain2 = new ain(0);
        abr.i(context);
        this.a = context;
        this.c = aim2;
        this.d = aim3;
        this.e = aim4;
        this.f = object;
        this.g = aim5;
        this.h = ain2;
        this.i = agf.p();
        this.j = adi.a;
        this.k = aka.b;
        this.m = new aig(agf.i(20L), agf.i(500L));
        this.b = afl.a;
    }

    public final aiq a() {
        abr.f(this.l ^ true);
        this.l = true;
        int n2 = agf.a;
        return new aiy(this);
    }

    public final void b(Looper looper) {
        abr.f(this.l ^ true);
        abr.i(looper);
        this.i = looper;
    }
}

