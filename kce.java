/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public class kce
extends jwa {
    private final String a;
    private final kcb d;

    public kce(int n2, int n3, long l2, String string) {
        this.a = string;
        this.d = new kcb(n2, n3, l2, string);
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        kcb.e(this.d, runnable, false, 6);
    }

    @Override
    public void close() {
        this.d.close();
    }

    @Override
    public final Executor e() {
        return this.d;
    }

    @Override
    public final void f(jqf jqf2, Runnable runnable) {
        kcb.e(this.d, runnable, true, 2);
    }

    public final void g(Runnable runnable, boolean bl2) {
        this.d.a(runnable, true, bl2);
    }
}

