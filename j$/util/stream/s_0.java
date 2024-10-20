/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.B0;
import j$.util.stream.L;
import j$.util.stream.b_0;
import j$.util.stream.c_0;
import j$.util.stream.g;
import j$.util.stream.h_0;
import j$.util.stream.r;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinTask;
import java.util.function.IntFunction;

/*
 * Renamed from j$.util.stream.s
 */
final class s_0
extends CountedCompleter {
    private final b_0 a;
    private Spliterator b;
    private final long c;
    private final ConcurrentHashMap d;
    private final r e;
    private final s_0 f;
    private L g;

    protected s_0(b_0 b_02, Spliterator spliterator, r r2) {
        super(null);
        this.a = b_02;
        this.b = spliterator;
        this.c = j$.util.stream.g.f(spliterator.d());
        this.d = new ConcurrentHashMap(Math.max(16, j$.util.stream.g.b() << 1));
        this.e = r2;
        this.f = null;
    }

    s_0(s_0 s_02, Spliterator spliterator, s_0 s_03) {
        super(s_02);
        this.a = s_02.a;
        this.b = spliterator;
        this.c = s_02.c;
        this.d = s_02.d;
        this.e = s_02.e;
        this.f = s_03;
    }

    @Override
    public final void compute() {
        Object object;
        Object object2;
        Spliterator spliterator;
        Spliterator spliterator2 = this.b;
        long l2 = this.c;
        boolean bl2 = false;
        Object object3 = this;
        while (spliterator2.d() > l2 && (spliterator = spliterator2.b()) != null) {
            object2 = new s_0((s_0)object3, spliterator, ((s_0)object3).f);
            object = new s_0((s_0)object3, spliterator2, (s_0)object2);
            c_0.m((s_0)object3);
            c_0.m((s_0)object);
            ((s_0)object3).d.put(object2, object);
            if (((s_0)object3).f != null) {
                c_0.m((s_0)object2);
                if (((s_0)object3).d.replace(((s_0)object3).f, object3, object2)) {
                    c_0.p((s_0)object3);
                } else {
                    c_0.p((s_0)object2);
                }
            }
            if (bl2) {
                spliterator2 = spliterator;
                object3 = object2;
                object2 = object;
            } else {
                object3 = object;
            }
            bl2 ^= true;
            ((ForkJoinTask)object2).fork();
        }
        if (c_0.b((s_0)object3) > 0) {
            object2 = new h_0(18);
            object = ((s_0)object3).a;
            object2 = ((b_0)object).m(((b_0)object).g(spliterator2), (IntFunction)object2);
            ((s_0)object3).a.u(spliterator2, (B0)object2);
            ((s_0)object3).g = object2.p();
            ((s_0)object3).b = null;
        }
        c_0.f((s_0)object3);
    }

    public final void onCompletion(CountedCompleter object) {
        object = this.g;
        if (object != null) {
            object.forEach(this.e);
            this.g = null;
        } else {
            object = this.b;
            if (object != null) {
                this.a.u((Spliterator)object, this.e);
                this.b = null;
            }
        }
        object = (s_0)this.d.remove(this);
        if (object != null) {
            c_0.f((s_0)object);
        }
    }
}

