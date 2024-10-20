/*
 * Decompiled with CFR 0.152.
 */
public final class dxx {
    public final dye a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final gto e;
    public final dyg f;
    public final String g;
    private final int[] h;
    private boolean i;
    private hav j = hdc.a;

    public dxx(String string, boolean bl2, gto gto2, int n2, dyg dyg2, int[] nArray, dyf dyf2, hav hav2, String string2) {
        this.b = string;
        this.d = bl2;
        this.e = gto2;
        this.a = new dye(n2, hav2, dyf2);
        bl2 = nArray.length > 0;
        this.c = bl2;
        this.f = dyg2;
        this.h = nArray;
        this.g = string2;
    }

    public final int a() {
        return this.a.a;
    }

    public final dyf b() {
        return this.a.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hav c() {
        synchronized (this) {
            if (this.i) return this.j;
            hat hat2 = new hat();
            Object object = this.h;
            for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
                Object object2 = object[i2];
                Object object3 = this.a;
                int n2 = ((dye)object3).a();
                int n3 = ((dye)object3).b();
                dyf dyf2 = new dyf(n2, n3);
                object3 = ((dye)object3).b;
                dye dye2 = new dye((int)object2, (hav)object3, dyf2);
                hat2.j(dye2);
            }
            this.j = hat2.g();
            this.i = true;
            return this.j;
        }
    }
}

