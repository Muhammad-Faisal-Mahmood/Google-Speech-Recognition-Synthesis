/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

final class jaz
extends jee {
    public static final int i = 0;
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public iyh e;
    public boolean f;
    public boolean g;
    final jba h;
    private int u;

    public jaz(jba jba2, int n2, jjo jjo2, Object object, jjv jjv2) {
        this.h = jba2;
        super(n2, jjo2, jjv2);
        this.b = new ArrayList();
        this.d = false;
        this.a = object;
    }

    static /* bridge */ /* synthetic */ void f(jaz jaz2, ByteBuffer byteBuffer) {
        jaz2.u += byteBuffer.remaining();
        super.n(new jhj(byteBuffer), false);
    }

    @Override
    public final void a(int n2) {
        a.s(this.h.k, "stream must not be null");
        this.u = n2 = this.u - n2;
        if (n2 == 0 && !this.f) {
            this.h.k.b(ByteBuffer.allocateDirect(4096));
        }
    }

    @Override
    public final void b(Throwable throwable) {
        this.c(iyh.c(throwable), true, new iwx());
    }

    @Override
    protected final void c(iyh iyh2, boolean bl2, iwx iwx2) {
        a.s(this.h.k, "stream must not be null");
        this.h.k.a();
        this.l(iyh2, bl2, iwx2);
    }

    @Override
    protected final void d() {
        super.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(Runnable runnable) {
        Object object = this.a;
        synchronized (object) {
            runnable.run();
            return;
        }
    }
}

