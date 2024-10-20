/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class kjx {
    private static kjx c;
    public int a;
    public final Object b;

    public kjx() {
        this.b = new int[10];
    }

    private kjx(byte[] byArray) {
        this.a = 0;
        this.b = new ot();
    }

    public kjx(byte[] byArray, byte[] byArray2) {
        this.b = new Object[256];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static kjx l() {
        synchronized (kjx.class) {
            kjx kjx2;
            if (c != null) return c;
            c = kjx2 = new kjx(null);
            return c;
        }
    }

    public final int a(int n2) {
        return ((int[])this.b)[n2];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[])this.b)[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 0x80) != 0) {
            return ((int[])this.b)[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.a & 0x10) != 0) {
            return ((int[])this.b)[4];
        }
        return Integer.MAX_VALUE;
    }

    public final void e(kjx kjx2) {
        jse.e(kjx2, "other");
        for (int i2 = 0; i2 < 10; ++i2) {
            if (!kjx2.f(i2)) continue;
            this.g(i2, kjx2.a(i2));
        }
    }

    public final boolean f(int n2) {
        return (1 << n2 & this.a) != 0;
    }

    public final void g(int n2, int n3) {
        if (n2 >= 0 && n2 < 10) {
            this.a = 1 << n2 | this.a;
            ((int[])this.b)[n2] = n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final cav h() {
        synchronized (this) {
            Object object = this.b;
            Object object2 = new ArrayList(object.values());
            int n2 = this.a;
            if (n2 > 0) {
                object = new cbf("UNKNOWN", 1002, n2);
                ((ArrayList)object2).add(object);
                this.a = 0;
            }
            this.b.clear();
            return new cav((List)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(cbf cbf2) {
        synchronized (this) {
            un un2 = new un(cbf2.a, cbf2.b);
            Object object = (cbf)this.b.get(un2);
            if (object != null) {
                ((cbf)object).c = hhk.aw(((cbf)object).c, cbf2.c);
                return;
            }
            object = this.b;
            if (((pa)object).f >= 100) {
                this.a = hhk.aw(this.a, cbf2.c);
                return;
            }
            object.put(un2, cbf2);
            return;
        }
    }

    public final Object j() {
        int n2 = this.a;
        if (n2 > 0) {
            Object[] objectArray = (Object[])this.b;
            Object object = objectArray[--n2];
            objectArray[n2] = null;
            this.a = n2;
            return object;
        }
        return null;
    }

    public final void k(Object object) {
        int n2 = this.a;
        if (n2 < 256) {
            ((Object[])this.b)[n2] = object;
            this.a = n2 + 1;
        }
    }
}

