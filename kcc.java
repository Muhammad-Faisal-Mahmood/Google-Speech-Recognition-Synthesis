/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class kcc
extends jwa
implements Executor {
    public static final kcc a = new kcc();
    private static final juy d;

    static {
        kci kci2 = kci.a;
        int n2 = jse.ap("kotlinx.coroutines.io.parallelism", jse.k(64, kbu.a), 0, 0, 12);
        jse.at(n2);
        juy juy2 = kci2;
        if (n2 < kch.d) {
            jse.at(n2);
            juy2 = new kbg(kci2, n2);
        }
        d = juy2;
    }

    private kcc() {
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        d.a(jqf2, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final Executor e() {
        return this;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a(jqg.a, runnable);
    }

    @Override
    public final void f(jqf jqf2, Runnable runnable) {
        d.f(jqf2, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}

