/*
 * Decompiled with CFR 0.152.
 */
public final class kjp
implements kmi {
    public final boolean a;
    public boolean b;
    final kjs c;
    private final klm d;

    public kjp(kjs kjs2, boolean bl2) {
        this.c = kjs2;
        this.a = bl2;
        this.d = new klm();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void c(boolean bl2) {
        long l2;
        kjs kjs2 = this.c;
        synchronized (kjs2) {
            long l3;
            kjs2.j.e();
            while (kjs2.e >= kjs2.f && !this.a && !this.b && kjs2.b() == null) {
                kjs2.k();
            }
            kjs2.f();
            l2 = Math.min(kjs2.f - kjs2.e, this.d.b);
            kjs2.e += l2;
            bl2 = bl2 && l2 == (l3 = this.d.b);
        }
        this.c.j.e();
        try {
            kjs2 = this.c;
            kjs2.b.h(kjs2.a, bl2, this.d, l2);
            return;
        }
        finally {
            this.c.j.b();
        }
        {
            finally {
                kjs2.j.b();
            }
        }
    }

    @Override
    public final kmm a() {
        return this.c.j;
    }

    @Override
    public final void bK(klm klm2, long l2) {
        byte[] byArray = khb.a;
        this.d.bK(klm2, l2);
        while (this.d.b >= 16384L) {
            this.c(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        Object object = khb.a;
        kjs kjs2 = this.c;
        synchronized (kjs2) {
            boolean bl2 = this.b;
            if (bl2) {
                return;
            }
            object = (Object)kjs2.b();
        }
        kjs2 = this.c;
        if (!kjs2.h.a) {
            if (this.d.b > 0L) {
                while (this.d.b > 0L) {
                    this.c(true);
                }
            } else if (object == null) {
                kjs2.b.h(kjs2.a, true, null, 0L);
            }
        }
        object = this.c;
        synchronized (object) {
            this.b = true;
        }
        this.c.b.e();
        this.c.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void flush() {
        byte[] byArray = khb.a;
        kjs kjs2 = this.c;
        synchronized (kjs2) {
            kjs2.f();
        }
        while (this.d.b > 0L) {
            this.c(false);
            this.c.b.e();
        }
        return;
    }
}

