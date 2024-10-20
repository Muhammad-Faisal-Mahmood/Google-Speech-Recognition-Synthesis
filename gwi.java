/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class gwi
extends WeakReference
implements gwd {
    final gws a;

    public gwi(ReferenceQueue referenceQueue, Object object, gws gws2) {
        super(object, referenceQueue);
        this.a = gws2;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public gwd b(ReferenceQueue referenceQueue, Object object, gws gws2) {
        return new gwi(referenceQueue, object, gws2);
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

