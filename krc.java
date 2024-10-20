/*
 * Decompiled with CFR 0.152.
 */
public final class krc
implements Runnable {
    final int a;
    final long b;
    final int c;
    final Object d;
    private final int e;

    public krc(ksf ksf2, int n2, long l2, int n3, int n4) {
        this.e = n4;
        this.d = ksf2;
        this.c = n2;
        this.b = l2;
        this.a = n3;
    }

    public krc(ksg ksg2, int n2, long l2, int n3, int n4) {
        this.e = n4;
        this.d = ksg2;
        this.a = n2;
        this.b = l2;
        this.c = n3;
    }

    @Override
    public final void run() {
        if (this.e != 0) {
            Object object = this.d;
            int n2 = this.c;
            long l2 = this.b;
            int n3 = this.a;
            ((ksf)object).b(n2, l2, n3);
            return;
        }
        Object object = this.d;
        int n4 = this.a;
        long l3 = this.b;
        int n5 = this.c;
        ((ksg)object).b(n4, l3, n5);
    }
}

