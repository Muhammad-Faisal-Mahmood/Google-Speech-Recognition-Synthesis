/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.b_0;
import j$.util.stream.c_0;
import java.util.concurrent.CountedCompleter;

abstract class g
extends CountedCompleter {
    private static final int g = c_0.a() << 2;
    protected final b_0 a;
    protected Spliterator b;
    protected long c;
    protected g d;
    protected g e;
    private Object f;

    protected g(b_0 b_02, Spliterator spliterator) {
        super(null);
        this.a = b_02;
        this.b = spliterator;
        this.c = 0L;
    }

    protected g(g g2, Spliterator spliterator) {
        super(g2);
        this.b = spliterator;
        this.a = g2.a;
        this.c = g2.c;
    }

    public static int b() {
        return g;
    }

    public static long f(long l2) {
        if ((l2 /= (long)g) <= 0L) {
            l2 = 1L;
        }
        return l2;
    }

    protected abstract Object a();

    protected Object c() {
        return this.f;
    }

    @Override
    public void compute() {
        Spliterator spliterator;
        Spliterator spliterator2 = this.b;
        long l2 = spliterator2.d();
        long l3 = this.c;
        if (l3 == 0L) {
            this.c = l3 = j$.util.stream.g.f(l2);
        }
        boolean bl2 = false;
        g g2 = this;
        while (l2 > l3 && (spliterator = spliterator2.b()) != null) {
            g g3;
            g g4;
            g2.d = g4 = g2.d(spliterator);
            g2.e = g3 = g2.d(spliterator2);
            c_0.e(g2);
            if (bl2) {
                spliterator2 = spliterator;
                g2 = g3;
                g3 = g4;
            } else {
                g2 = g4;
            }
            bl2 ^= true;
            g2.fork();
            l2 = spliterator2.d();
            g2 = g3;
        }
        g2.e(g2.a());
        c_0.l(g2);
    }

    protected abstract g d(Spliterator var1);

    protected void e(Object object) {
        this.f = object;
    }

    @Override
    public Object getRawResult() {
        return this.f;
    }

    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override
    protected final void setRawResult(Object object) {
        if (object == null) {
            return;
        }
        throw new IllegalStateException();
    }
}

