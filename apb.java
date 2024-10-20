/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class apb {
    private int a;
    private int b;
    private int c;
    private Object d;

    public apb() {
        abr.d(true);
        abr.d(true);
        this.c = 0;
        this.d = new hti[100];
    }

    public apb(byte[] byArray, int n2, int n3) {
        this.d = byArray;
        this.a = n2;
        this.c = n3;
        this.b = 0;
        this.l();
    }

    private final void l() {
        boolean bl2;
        block2: {
            block3: {
                boolean bl3;
                int n2 = this.a;
                bl2 = bl3 = false;
                if (n2 < 0) break block2;
                int n3 = this.c;
                if (n2 < n3) break block3;
                bl2 = bl3;
                if (n2 != n3) break block2;
                bl2 = bl3;
                if (this.b != 0) break block2;
            }
            bl2 = true;
        }
        abr.f(bl2);
    }

    private final boolean m(int n2) {
        byte[] byArray;
        return n2 >= 2 && n2 < this.c && (byArray = (byte[])this.d)[n2] == 3 && byArray[n2 - 2] == 0 && byArray[n2 - 1] == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        synchronized (this) {
            int n2 = this.b;
            return n2 * 65536;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            this.c(0);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n2) {
        synchronized (this) {
            int n3 = this.a;
            this.a = n2;
            if (n2 < n3) {
                this.d();
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            int n2 = Math.max(0, agf.b(this.a, 65536) - this.b);
            int n3 = this.c;
            if (n2 >= n3) {
                return;
            }
            Arrays.fill((Object[])this.d, n2, n3, null);
            this.c = n2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(anq object) {
        synchronized (this) {
            while (true) {
                if (object == null) {
                    this.notifyAll();
                    return;
                }
                Object object2 = this.d;
                int n2 = this.c;
                this.c = n2 + 1;
                hti hti2 = ((anq)object).d;
                abr.i(hti2);
                ((hti[])object2)[n2] = hti2;
                --this.b;
                object2 = ((anq)object).c;
                if (object2 != null) {
                    object = object2;
                    if (((anq)object2).d != null) continue;
                }
                object = null;
            }
        }
    }

    public final int f(int n2) {
        Object object;
        int n3;
        int n4;
        int n5;
        this.b += n2;
        int n6 = 0;
        while (true) {
            n5 = this.b;
            n4 = 2;
            if (n5 <= 8) break;
            this.b = n3 = n5 - 8;
            object = this.d;
            n5 = this.a;
            n6 |= (((byte[])object)[n5] & 0xFF) << n3;
            if (!this.m(n5 + 1)) {
                n4 = 1;
            }
            this.a = n5 + n4;
        }
        object = this.d;
        int n7 = this.a;
        n3 = ((byte[])object)[n7];
        if (n5 == 8) {
            this.b = 0;
            if (!this.m(n7 + 1)) {
                n4 = 1;
            }
            this.a = n7 + n4;
        }
        this.l();
        return -1 >>> 32 - n2 & (n6 | (n3 & 0xFF) >> 8 - n5);
    }

    public final void g() {
        int n2 = this.b;
        int n3 = 1;
        this.b = ++n2;
        if (n2 == 8) {
            this.b = 0;
            n2 = this.a;
            if (this.m(n2 + 1)) {
                n3 = 2;
            }
            this.a = n2 + n3;
        }
        this.l();
    }

    public final void h(int n2) {
        int n3;
        int n4 = this.a;
        int n5 = n2 / 8;
        this.a = n3 = n4 + n5;
        this.b = n5 = this.b + (n2 - n5 * 8);
        n2 = n4;
        if (n5 > 7) {
            this.a = n3 + 1;
            this.b = n5 - 8;
            n2 = n4;
        }
        while ((n4 = n2 + 1) <= this.a) {
            n2 = n4;
            if (!this.m(n4)) continue;
            ++this.a;
            n2 = n4 + 2;
        }
        this.l();
    }

    public final boolean i() {
        Object object = this.d;
        int n2 = this.a;
        byte by2 = ((byte[])object)[n2];
        n2 = this.b;
        this.g();
        return (by2 & 128 >> n2) != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hti j() {
        synchronized (this) {
            Object object;
            ++this.b;
            int n2 = this.c;
            if (n2 > 0) {
                object = this.d;
                this.c = --n2;
                object = ((hti[])object)[n2];
                abr.i(object);
                Object object2 = this.d;
                n2 = this.c;
                ((hti[])object2)[n2] = null;
            } else {
                object = new hti(new byte[65536]);
                int n3 = this.b;
                Object object3 = this.d;
                n2 = ((hti[])object3).length;
                if (n3 > n2) {
                    this.d = (hti[])Arrays.copyOf((Object[])object3, n2 + n2);
                    return object;
                }
            }
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(hti hti2) {
        synchronized (this) {
            Object object = this.d;
            int n2 = this.c;
            this.c = n2 + 1;
            ((hti[])object)[n2] = hti2;
            --this.b;
            this.notifyAll();
            return;
        }
    }
}

