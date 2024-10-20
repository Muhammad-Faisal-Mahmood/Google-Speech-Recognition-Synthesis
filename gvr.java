/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class gvr
implements Serializable,
gur {
    private static final long serialVersionUID = 1L;
    public final gwr a;

    public gvr(guw object) {
        object = new gwr((guw)object);
        this.a = object;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    @Override
    public final Object k(Object object) {
        gwr gwr2 = this.a;
        int n2 = gwr2.a(object);
        return gwr2.b(n2).c(object, n2);
    }

    @Override
    public final void l() {
        gvu[] gvuArray = this.a.f;
        int n2 = gvuArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            gvuArray[i2].e();
        }
    }

    @Override
    public final void m(Object object, Object object2) {
        this.a.put(object, object2);
    }

    Object writeReplace() {
        gwr gwr2 = this.a;
        return new gvs(gwr2.j, gwr2.k, gwr2.h, gwr2.i, gwr2.o, gwr2.n, gwr2.l, gwr2.m, gwr2.g, gwr2.q, gwr2.r);
    }
}

