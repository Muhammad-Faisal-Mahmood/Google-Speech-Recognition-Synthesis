/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class dsc
extends dox
implements dmw {
    public final dmt b;
    public final hpr c;
    public final iku d;
    public final iku e;
    public final dsn f;
    public final AtomicReference g;
    public final dml h;

    public dsc(dmu dmu2, hpr hpr2, iku iku2, iku iku3, jnu jnu2, dml dml2) {
        super(null, null);
        AtomicReference<dsj> atomicReference;
        this.g = atomicReference = new AtomicReference<dsj>();
        this.c = hpr2;
        this.d = iku2;
        this.e = iku3;
        this.h = dml2;
        this.b = dmu2.a(hpr2, new dsb(), jnu2);
        this.f = new dsn(new dan(iku2, 5));
        atomicReference.set(dml2.a(1.0f));
    }

    @Override
    public final void L() {
        dqv dqv2 = new dqv(this, 2);
        this.c.execute(dqv2);
    }
}

