/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class emd
implements eaj {
    public static final Duration a = hhk.X();
    public final hpn b;
    private final hpn c;
    private final eae d;
    private final jrk e;
    private final hpr f;
    private final Future g;

    public emd(hpn object, hpn hpn2, eae eae2, jrk jrk2, hpr hpr2) {
        jse.e(object, "startListeningResult");
        jse.e(eae2, "params");
        jse.e(hpr2, "scheduledExecutorService");
        this.c = object;
        this.b = hpn2;
        this.d = eae2;
        this.e = jrk2;
        this.f = hpr2;
        object = new bdr(this, 12);
        long l2 = (eae2.b & 0x80) != 0 ? eae2.i : a.toMillis();
        this.g = hpr2.c((Callable)object, l2, TimeUnit.MILLISECONDS);
    }

    @Override
    public final eai a() {
        return this.e(ebv.b);
    }

    @Override
    public final hpn b() {
        return hhk.K(this.d);
    }

    @Override
    public final hpn c() {
        return this.c;
    }

    @Override
    public final /* synthetic */ Object d() {
        return new emc(this, 0);
    }

    public final eai e(ebv ebv2) {
        this.g.cancel(false);
        this.e.a(ebv2);
        return new emc(this, 1);
    }
}

