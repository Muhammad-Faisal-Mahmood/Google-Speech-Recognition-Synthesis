/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ScheduledExecutorService;

public final class dir {
    public final dgv a;
    public final diu b;
    public final ScheduledExecutorService c;
    public final dil d;
    public final ddu e;
    public final Runnable f;
    public final bzq g;

    public dir(itu object) {
        Object object2 = ((itu)object).f;
        fxf.K(object2);
        this.a = (dgv)object2;
        object2 = ((itu)object).d;
        fxf.K(object2);
        this.b = object2;
        object2 = ((itu)object).e;
        fxf.K(object2);
        this.g = (bzq)object2;
        object2 = ((itu)object).c;
        fxf.K(object2);
        this.c = object2;
        this.d = (dil)((itu)object).g;
        object2 = ((itu)object).a;
        fxf.K(object2);
        this.e = (ddu)object2;
        object = ((itu)object).b;
        fxf.K(object);
        this.f = object;
    }

    public final String toString() {
        return this.e.toString();
    }
}

