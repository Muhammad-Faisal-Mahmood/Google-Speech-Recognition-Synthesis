/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class gvv
extends SoftReference
implements gwd {
    final gws a;

    public gvv(ReferenceQueue referenceQueue, Object object, gws gws2) {
        super(object, referenceQueue);
        this.a = gws2;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public gwd b(ReferenceQueue referenceQueue, Object object, gws gws2) {
        return new gvv(referenceQueue, object, gws2);
    }

    @Override
    public final gws c() {
        return this.a;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}

