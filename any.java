/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.Collections;
import java.util.List;

public final class any
extends aew {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final boolean e;
    private final aef f;
    private final aeb g;

    static {
        yj yj2 = new yj();
        int n2 = gzx.d;
        List list = hct.a;
        list = Collections.emptyList();
        gzx gzx2 = hct.a;
        aed aed2 = aed.a;
        yj.j("SinglePeriodTimeline", Uri.EMPTY, yj2, list, gzx2, aed2);
    }

    public any(long l2, long l3, boolean bl2, aef aef2, aeb aeb2) {
        this.c = l2;
        this.d = l3;
        this.e = bl2;
        abr.i(aef2);
        this.f = aef2;
        this.g = aeb2;
    }

    @Override
    public final int a(Object object) {
        if (b.equals(object)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final aeu d(int n2, aeu aeu2, boolean bl2) {
        abr.h(n2, 1);
        Object object = bl2 ? b : null;
        aeu2.g(null, object, 0, this.c, adh.a, false);
        return aeu2;
    }

    @Override
    public final aev e(int n2, aev aev2, long l2) {
        abr.h(n2, 1);
        aeb aeb2 = this.g;
        l2 = this.d;
        aev2.c(aev.a, this.f, this.e, false, aeb2, l2);
        return aev2;
    }

    @Override
    public final Object f(int n2) {
        abr.h(n2, 1);
        return b;
    }
}

