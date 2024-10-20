/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.n;
import j$.util.stream.b_0;
import j$.util.stream.c_0;
import j$.util.stream.g;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from j$.util.stream.e
 */
abstract class e_0
extends g {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected e_0(b_0 b_02, Spliterator spliterator) {
        super(b_02, spliterator);
        this.h = new AtomicReference<Object>(null);
    }

    protected e_0(e_0 e_02, Spliterator spliterator) {
        super(e_02, spliterator);
        this.h = e_02.h;
    }

    @Override
    public final Object c() {
        if ((g)c_0.c(this) == null) {
            Object v2;
            Object object = v2 = this.h.get();
            if (v2 == null) {
                object = this.g();
            }
            return object;
        }
        return super.c();
    }

    @Override
    public final void compute() {
        Object object;
        Object object2;
        block7: {
            Spliterator spliterator = this.b;
            long l2 = spliterator.d();
            long l3 = this.c;
            if (l3 == 0L) {
                this.c = l3 = g.f(l2);
            }
            AtomicReference atomicReference = this.h;
            boolean bl2 = false;
            object2 = this;
            while (true) {
                Spliterator spliterator2;
                boolean bl3;
                Object object3;
                object = object3 = atomicReference.get();
                if (object3 != null) break block7;
                boolean bl4 = bl3 = ((e_0)object2).i;
                if (!bl3) {
                    object = c_0.c((g)object2);
                    while (true) {
                        object = (e_0)((g)object);
                        bl4 = bl3;
                        if (bl3) break;
                        bl4 = bl3;
                        if (object == null) break;
                        bl3 = ((e_0)object).i;
                        object = c_0.c(object);
                    }
                }
                if (bl4) {
                    object = ((e_0)object2).g();
                    break block7;
                }
                if (l2 <= l3 || (spliterator2 = spliterator.b()) == null) break;
                object3 = (e_0)((g)object2).d(spliterator2);
                ((g)object2).d = object3;
                object = (e_0)((g)object2).d(spliterator);
                ((g)object2).e = object;
                c_0.d((e_0)object2);
                if (bl2) {
                    spliterator = spliterator2;
                    object2 = object;
                    object = object3;
                } else {
                    object2 = object3;
                }
                bl2 ^= true;
                ((ForkJoinTask)object2).fork();
                l2 = spliterator.d();
                object2 = object;
            }
            object = ((g)object2).a();
        }
        ((e_0)object2).e(object);
        c_0.k((e_0)object2);
    }

    @Override
    protected final void e(Object object) {
        if ((g)c_0.c(this) == null) {
            if (object != null) {
                n.a(this.h, null, object);
            }
        } else {
            super.e(object);
        }
    }

    protected abstract Object g();

    @Override
    public final Object getRawResult() {
        return this.c();
    }
}

