/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 */
import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.impl.CronetUrlRequestContext;

public class krw
extends kqo {
    private static final AtomicLong r = new AtomicLong(0L);

    public krw(Context context) {
        ClassLoader classLoader = kqo.class.getClassLoader();
        int n2 = classLoader.toString().startsWith("java.lang.BootClassLoader") ? 5 : (!koj.class.getClassLoader().equals(classLoader) ? 3 : 2);
        super(context, n2);
    }

    @Override
    protected final long a() {
        AtomicLong atomicLong = r;
        atomicLong.compareAndSet(0L, this.b.a());
        return atomicLong.get();
    }

    @Override
    public final koj c() {
        long l2 = SystemClock.uptimeMillis();
        if (this.g == null) {
            this.g = this.b();
        }
        return new CronetUrlRequestContext(this, l2);
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

