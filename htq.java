/*
 * Decompiled with CFR 0.152.
 */
final class htq
extends iuc {
    private final Object a = new Object();
    private long b;
    private long c;
    private final htp d;

    public htq(htp htp2) {
        this.d = htp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(long l2) {
        Object object = this.a;
        synchronized (object) {
            this.c += l2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(long l2) {
        Object object = this.a;
        synchronized (object) {
            this.b += l2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h() {
        Object object = this.a;
        synchronized (object) {
            htp htp2 = this.d;
            long l2 = this.b;
            boolean bl2 = true;
            boolean bl3 = l2 >= 0L;
            fxf.r(bl3, "Cannot record negative request bytes.");
            htp2.j.add(l2);
            htp2 = this.d;
            l2 = this.c;
            bl3 = l2 >= 0L ? bl2 : false;
            fxf.r(bl3, "Cannot record negative response bytes.");
            htp2.k.add(l2);
            return;
        }
    }
}

