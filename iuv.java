/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class iuv {
    public final boolean a;
    public final Object b;

    public iuv(gto gto2) {
        this.a = (Boolean)gto2.e(false);
        this.b = new Random(cgw.p().toEpochMilli());
    }

    public iuv(iuu iuu2, boolean bl2) {
        this.b = iuu2;
        this.a = bl2;
    }

    public iuv(boolean bl2, gzx gzx2) {
        this.a = bl2;
        this.b = gzx2;
    }

    public iuv(boolean bl2, String string) {
        this.a = bl2;
        this.b = string;
    }

    public final hpn a(Callable callable, Executor executor) {
        return new hol((gzm)this.b, this.a, executor, callable);
    }

    public final hpn b(hnx hnx2, Executor executor) {
        return new hol((gzm)this.b, this.a, executor, hnx2);
    }
}

