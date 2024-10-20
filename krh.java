/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

public final class krh
extends kqo {
    private static final AtomicLong r = new AtomicLong(0L);

    public krh(Context context) {
        super(context, 4);
    }

    @Override
    protected final long a() {
        AtomicLong atomicLong = r;
        atomicLong.compareAndSet(0L, this.b.a());
        return atomicLong.get();
    }

    @Override
    public final koj c() {
        if (this.g == null) {
            this.g = this.b();
        }
        return new krg(this);
    }

    @Override
    public final /* synthetic */ void e(boolean bl2) {
        this.k = bl2;
    }

    @Override
    public final /* synthetic */ void g(boolean bl2) {
        this.o = bl2;
    }

    @Override
    public final /* synthetic */ void h(boolean bl2) {
        this.f = bl2;
    }

    @Override
    public final /* synthetic */ void i(boolean bl2) {
        this.i = bl2;
    }

    @Override
    public final /* synthetic */ void j(String string) {
        this.n = string;
    }

    @Override
    public final /* synthetic */ void l(int n2) {
        this.p = n2;
    }
}

