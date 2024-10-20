/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

abstract class gmo
implements gpc {
    private final gpc a;
    private final UUID b;
    private final String c;
    private gqr d;

    public gmo(String object, gpc gpc2, goz goz2) {
        fxf.K(object);
        this.c = object;
        this.a = gpc2;
        this.b = gpc2.d();
        object = goz2.e;
        if (object == null) {
            this.d = null;
            Thread.currentThread();
        } else {
            this.d = object;
        }
        if (this.d == gpc2.b()) {
            gpc2.e();
        }
    }

    public gmo(String object, UUID uUID, goz goz2) {
        fxf.K(object);
        this.c = object;
        this.a = null;
        this.b = uUID;
        object = goz2.e;
        if (object == null) {
            this.d = null;
            Thread.currentThread();
            return;
        }
        this.d = object;
    }

    @Override
    public final gpc a() {
        return this.a;
    }

    @Override
    public gqr b() {
        return this.d;
    }

    @Override
    public final String c() {
        return this.c;
    }

    @Override
    public void close() {
        gno.k(this);
        this.d = null;
    }

    @Override
    public final UUID d() {
        return this.b;
    }

    @Override
    public void e() {
    }

    public final String toString() {
        return gno.j(this);
    }
}

