/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class dqf
extends dqb
implements dmw {
    public final hpr a;
    public final iku b;
    public final dmt c;
    public final dqi d;
    private final dkf e;
    private final boolean f;
    private final dpz g;

    public dqf(dmu dmu2, dpz dpz2, hpr hpr2, iku iku2, dqi dqi2, dkf dkf2, jnu jnu2, Executor executor, gto gto2) {
        new AtomicReference<dpu>(dpu.a);
        new ConcurrentHashMap();
        this.g = dpz2;
        this.e = dkf2;
        this.c = dmu2.a(executor, iku2, jnu2);
        this.a = hpr2;
        this.b = iku2;
        this.d = dqi2;
        this.f = (Boolean)gto2.e(Boolean.FALSE);
    }

    public static final boolean c(int n2) {
        return n2 != 1;
    }

    @Override
    public final void L() {
        if (this.f) {
            this.a();
        }
    }

    @Override
    public final void a() {
        dqd dqd2 = new dqd(this);
        dpz dpz2 = this.g;
        dpz2.d = dqd2;
        if (dpz2.c.getAndSet(true)) {
            return;
        }
        hhk.P(new cqg(dpz2, 12), dpz2.b);
    }

    @Override
    public final void b(djt djt2) {
        this.d(djt2.a, 1, null);
    }

    public final void d(String string, int n2, String string2) {
        if (this.e.a) {
            hhk.I();
            return;
        }
        hhk.P(new dqc(this, n2, string, string2, 0), this.a);
    }
}

