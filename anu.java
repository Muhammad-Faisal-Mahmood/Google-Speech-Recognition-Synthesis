/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import j$.util.Objects;

public final class anu
implements aqe {
    private final htf A;
    public final anr a;
    public final ans b;
    public ant c;
    public int d;
    public int e;
    public long f;
    public bzb g;
    private final alg h;
    private adu i;
    private int j;
    private long[] k;
    private long[] l;
    private int[] m;
    private int[] n;
    private long[] o;
    private aqd[] p;
    private int q;
    private int r;
    private long s;
    private long t;
    private boolean u;
    private boolean v;
    private boolean w;
    private adu x;
    private boolean y;
    private boolean z;

    protected anu(apb apb2, alg alg2) {
        this.h = alg2;
        this.a = new anr(apb2);
        this.b = new ans();
        this.j = 1000;
        this.k = new long[1000];
        this.l = new long[1000];
        this.o = new long[1000];
        this.n = new int[1000];
        this.m = new int[1000];
        this.p = new aqd[1000];
        this.A = new htf(new anz(1));
        this.f = Long.MIN_VALUE;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.w = true;
        this.v = true;
        this.y = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void A(long l2, int n2, long l3, int n3, aqd object) {
        synchronized (this) {
            Object object2;
            Object object3;
            aqd[] aqdArray;
            boolean bl2;
            n2 = this.q;
            if (n2 > 0) {
                bl2 = this.l[n2 = this.x(n2 - 1)] + (long)this.m[n2] <= l3;
                abr.d(bl2);
            }
            this.u = false;
            this.t = Math.max(this.t, l2);
            n2 = this.x(this.q);
            this.o[n2] = l2;
            this.l[n2] = l3;
            this.m[n2] = n3;
            this.n[n2] = 1;
            this.p[n2] = null;
            this.k[n2] = 0L;
            if (this.A.g() || !((adu)(aqdArray = ((awg)this.A.f()).b)).equals(object = this.x)) {
                object3 = this.x;
                abr.i(object3);
                aqdArray = this.A;
                object2 = alf.a;
                n2 = this.c();
                object = new awg(object3, object2);
                if (aqdArray.b == -1) {
                    bl2 = ((SparseArray)aqdArray.c).size() == 0;
                    abr.f(bl2);
                    aqdArray.b = 0;
                }
                if (((SparseArray)aqdArray.c).size() > 0) {
                    object3 = aqdArray.c;
                    n3 = ((SparseArray)object3).size();
                    bl2 = n2 >= (n3 = ((SparseArray)object3).keyAt(n3 - 1));
                    abr.d(bl2);
                    if (n3 == n2) {
                        object2 = aqdArray.a;
                        object3 = aqdArray.c;
                        n3 = ((SparseArray)object3).size();
                        object2.a(((SparseArray)object3).valueAt(n3 - 1));
                    }
                }
                ((SparseArray)aqdArray.c).append(n2, object);
            }
            this.q = n2 = this.q + 1;
            int n4 = this.j;
            if (n2 == n4) {
                n2 = n4 + 1000;
                long[] lArray = new long[n2];
                long[] lArray2 = new long[n2];
                object3 = new long[n2];
                object = new int[n2];
                object2 = new int[n2];
                aqdArray = new aqd[n2];
                n3 = this.r;
                System.arraycopy(this.l, n3, lArray2, 0, n4 -= n3);
                System.arraycopy(this.o, this.r, object3, 0, n4);
                System.arraycopy(this.n, this.r, object, 0, n4);
                System.arraycopy(this.m, this.r, object2, 0, n4);
                System.arraycopy(this.p, this.r, aqdArray, 0, n4);
                System.arraycopy(this.k, this.r, lArray, 0, n4);
                n3 = this.r;
                System.arraycopy(this.l, 0, lArray2, n4, n3);
                System.arraycopy(this.o, 0, object3, n4, n3);
                System.arraycopy(this.n, 0, object, n4, n3);
                System.arraycopy(this.m, 0, object2, n4, n3);
                System.arraycopy(this.p, 0, aqdArray, n4, n3);
                System.arraycopy(this.k, 0, lArray, n4, n3);
                this.l = lArray2;
                this.o = (long[])object3;
                this.n = (int[])object;
                this.m = (int[])object2;
                this.p = aqdArray;
                this.k = lArray;
                this.r = 0;
                this.j = n2;
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
    private final void B() {
        synchronized (this) {
            this.e = 0;
            anr anr2 = this.a;
            anr2.c = anr2.b;
            return;
        }
    }

    private final boolean C() {
        return this.e != this.q;
    }

    private final boolean D(int n2) {
        boolean bl2;
        if (this.g != null) {
            n2 = this.n[n2];
            bl2 = false;
            if ((n2 & 0x40000000) == 0) {
                return false;
            }
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean E(adu var1_1) {
        synchronized (this) {
            block23: {
                block22: {
                    this.w = false;
                    var3_2 = Objects.equals(var1_1, this.x);
                    if (var3_2 != 0) {
                        return false;
                    }
                    this.x = this.A.g() == false && ((adu)((awg)this.A.f()).b).equals(var1_1) != false ? (adu)((awg)this.A.f()).b : var1_1;
                    var3_2 = this.y;
                    var4_3 = this.x;
                    var1_1 = var4_3.o;
                    var4_3 = var4_3.k;
                    var4_3 = ael.a;
                    if (var1_1 == null) ** GOTO lbl-1000
                    switch (var1_1.hashCode()) {
                        default: {
                            break;
                        }
                        case 1903589369: {
                            if (!var1_1.equals("audio/g711-mlaw")) break;
                            var2_4 = 5;
                            break block22;
                        }
                        case 1903231877: {
                            if (!var1_1.equals("audio/g711-alaw")) break;
                            var2_4 = 4;
                            break block22;
                        }
                        case 1504831518: {
                            if (!var1_1.equals("audio/mpeg")) break;
                            var2_4 = 0;
                            break block22;
                        }
                        case 1504619009: {
                            if (!var1_1.equals("audio/flac")) break;
                            var2_4 = 6;
                            break block22;
                        }
                        case 1504578661: {
                            if (!var1_1.equals("audio/eac3")) break;
                            var2_4 = 8;
                            break block22;
                        }
                        case 187094639: {
                            if (!var1_1.equals("audio/raw")) break;
                            var2_4 = 3;
                            break block22;
                        }
                        case 187078296: {
                            if (!var1_1.equals("audio/ac3")) break;
                            var2_4 = 7;
                            break block22;
                        }
                        case -53558318: {
                            if (!var1_1.equals("audio/mp4a-latm")) break;
                            var2_4 = 10;
                            break block22;
                        }
                        case -432837259: {
                            if (!var1_1.equals("audio/mpeg-L2")) break;
                            var2_4 = 2;
                            break block22;
                        }
                        case -432837260: {
                            if (!var1_1.equals("audio/mpeg-L1")) break;
                            var2_4 = 1;
                            break block22;
                        }
                        case -2123537834: {
                            if (!var1_1.equals("audio/eac3-joc")) break;
                            var2_4 = 9;
                            break block22;
                        }
                    }
                    var2_4 = -1;
                }
                switch (var2_4) {
                    case 10: {
                        ** GOTO lbl-1000
                    }
                    default: lbl-1000:
                    // 3 sources

                    {
                        var2_4 = 0;
                        break block23;
                    }
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                }
                var2_4 = 1;
            }
            this.y = var3_2 & var2_4;
            this.z = false;
            return true;
        }
    }

    private final void F(adu adu2, arq arq2) {
        adu adu3 = this.i;
        this.i = adu2;
        arq2.a = adu2.b(this.h.a(adu2));
        arq2.b = this.g;
        if (adu3 != null && Objects.equals(null, null)) {
            return;
        }
        this.g = null;
        arq2.b = null;
    }

    private final int w(int n2, int n3, long l2, boolean bl2) {
        int n4 = -1;
        int n5 = 0;
        int n6 = n2;
        n2 = n5;
        while (true) {
            block7: {
                long l3;
                block6: {
                    n5 = n4;
                    if (n2 >= n3) break;
                    long l4 = this.o[n6] - l2;
                    l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    n5 = n4;
                    if (l3 > 0) break;
                    if (!bl2) break block6;
                    n5 = n4;
                    if ((this.n[n6] & 1) == 0) break block7;
                }
                n5 = n4 = n2;
                if (l3 == false) {
                    n5 = n4;
                    break;
                }
            }
            n6 = n4 = n6 + 1;
            if (n4 == this.j) {
                n6 = 0;
            }
            ++n2;
            n4 = n5;
        }
        return n5;
    }

    private final int x(int n2) {
        int n3 = this.j;
        if ((n2 = this.r + n2) < n3) {
            return n2;
        }
        return n2 - n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long y() {
        synchronized (this) {
            int n2 = this.q;
            if (n2 != 0) return this.z(n2);
            return -1L;
        }
    }

    private final long z(int n2) {
        Object object;
        int n3;
        int n4;
        int n5;
        long l2;
        long l3 = this.s;
        long l4 = Long.MIN_VALUE;
        int n6 = 0;
        if (n2 == 0) {
            l2 = l4;
        } else {
            n5 = this.x(n2 - 1);
            n4 = 0;
            while (true) {
                l2 = l4;
                if (n4 >= n2) break;
                l4 = Math.max(l4, this.o[n5]);
                if ((this.n[n5] & 1) != 0) {
                    l2 = l4;
                    break;
                }
                n5 = n3 = n5 - 1;
                if (n3 == -1) {
                    n5 = this.j - 1;
                }
                ++n4;
            }
        }
        this.s = Math.max(l3, l2);
        this.q -= n2;
        this.d = n4 = this.d + n2;
        this.r = n3 = this.r + n2;
        n5 = this.j;
        if (n3 >= n5) {
            this.r = n3 - n5;
        }
        this.e = n2 = this.e - n2;
        if (n2 < 0) {
            this.e = 0;
        }
        htf htf2 = this.A;
        n2 = n6;
        while (n2 < ((SparseArray)htf2.c).size() - 1 && n4 >= ((SparseArray)(object = htf2.c)).keyAt(n5 = n2 + 1)) {
            htf2.a.a(((SparseArray)htf2.c).valueAt(n2));
            ((SparseArray)htf2.c).removeAt(n2);
            n2 = htf2.b;
            if (n2 > 0) {
                htf2.b = n2 - 1;
            }
            n2 = n5;
        }
        if (this.q == 0) {
            n2 = n5 = this.r;
            if (n5 == 0) {
                n2 = this.j;
            }
            return this.l[--n2] + (long)this.m[n2];
        }
        return this.l[this.r];
    }

    public final int a() {
        return this.d + this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b(long l2, boolean bl2) {
        synchronized (this) {
            int n2 = this.e;
            int n3 = this.x(n2);
            if (this.C() && l2 >= this.o[n3]) {
                if (l2 > this.t && bl2) {
                    n3 = this.q;
                    return n3 - n2;
                }
                n2 = this.w(n3, this.q - n2, l2, true);
                // MONITOREXIT @DISABLED, blocks:[3, 6] lbl10 : MonitorExitStatement: MONITOREXIT : this
                if (n2 == -1) {
                    return 0;
                }
                return n2;
            }
            return 0;
        }
    }

    public final int c() {
        return this.d + this.q;
    }

    @Override
    public final /* synthetic */ int d(adn adn2, int n2, boolean bl2) {
        return wd.t(this, adn2, n2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long e() {
        synchronized (this) {
            return this.t;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final adu f() {
        synchronized (this) {
            boolean bl2 = this.w;
            if (!bl2) return this.x;
            return null;
        }
    }

    public final void g() {
        this.a.c(this.y());
    }

    @Override
    public final void h(adu object) {
        boolean bl2 = this.E((adu)object);
        object = this.c;
        if (object != null && bl2) {
            object = (ann)object;
            Runnable runnable = ((ann)object).d;
            ((ann)object).f.post(runnable);
        }
    }

    public final void i() {
        if (this.g != null) {
            this.g = null;
            this.i = null;
        }
    }

    public final void j() {
        this.k(false);
    }

    public final void k(boolean bl2) {
        Object object = this.a;
        anq anq2 = ((anr)object).b;
        if (anq2.d != null) {
            ((anr)object).f.e(anq2);
            anq2.b();
        }
        ((anr)object).b.c(0L);
        ((anr)object).c = anq2 = ((anr)object).b;
        ((anr)object).d = anq2;
        ((anr)object).e = 0L;
        ((anr)object).f.d();
        this.q = 0;
        this.d = 0;
        this.r = 0;
        this.e = 0;
        this.v = true;
        this.f = Long.MIN_VALUE;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = false;
        object = this.A;
        for (int i2 = 0; i2 < ((SparseArray)((htf)object).c).size(); ++i2) {
            ((htf)object).a.a(((SparseArray)((htf)object).c).valueAt(i2));
        }
        ((htf)object).b = -1;
        ((SparseArray)((htf)object).c).clear();
        if (bl2) {
            this.x = null;
            this.w = true;
            this.y = true;
        }
    }

    @Override
    public final /* synthetic */ void l(aga aga2, int n2) {
        wd.u(this, aga2, n2);
    }

    @Override
    public final void m(long l2, int n2, int n3, int n4, aqd object) {
        if (this.v) {
            this.v = false;
        }
        if (this.y && l2 < this.f) {
            return;
        }
        object = this.a;
        long l3 = n3;
        this.A(l2, 1, ((anr)object).e - l3 - (long)n4, n3, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(int n2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                block4: {
                    boolean bl3;
                    bl2 = bl3 = false;
                    if (n2 >= 0) {
                        bl2 = bl3;
                        try {
                            if (this.e + n2 > this.q) break block4;
                            bl2 = true;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                }
                abr.d(bl2);
                this.e += n2;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean o() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean p(boolean bl2) {
        synchronized (this) {
            boolean bl3 = this.C();
            boolean bl4 = true;
            if (!bl3) {
                bl3 = bl4;
                if (bl2) return bl3;
                adu adu2 = this.x;
                if (adu2 == null) return false;
                adu adu3 = this.i;
                if (adu2 != adu3) return bl4;
                return false;
            }
            Object object = ((awg)this.A.e((int)this.a())).b;
            adu adu4 = this.i;
            if (object == adu4) return this.D(this.x(this.e));
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean q(int n2) {
        synchronized (this) {
            this.B();
            int n3 = this.d;
            if (n2 >= n3 && n2 <= this.q + n3) {
                this.f = Long.MIN_VALUE;
                this.e = n2 - n3;
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean r(long l2, boolean bl2) {
        synchronized (this) {
            int n2;
            block9: {
                this.B();
                n2 = this.e;
                int n3 = this.x(n2);
                if (!this.C()) return false;
                if (l2 < this.o[n3]) return false;
                boolean bl3 = bl2;
                if (l2 > this.t) {
                    if (!bl2) return false;
                    bl3 = true;
                }
                if (this.y) {
                    int n4 = this.q - n2;
                    for (n2 = 0; n2 < n4; ++n2) {
                        if (this.o[n3] < l2) {
                            int n5;
                            n3 = n5 = n3 + 1;
                            if (n5 != this.j) continue;
                            n3 = 0;
                            continue;
                        }
                        break block9;
                    }
                    if (!bl3) return false;
                    n2 = n4;
                } else {
                    n2 = this.w(n3, this.q - n2, l2, true);
                }
            }
            if (n2 == -1) return false;
            this.f = l2;
            this.e += n2;
            return true;
        }
    }

    @Override
    public final int s(adn adn2, int n2, boolean bl2) {
        anq anq2;
        anr anr2 = this.a;
        n2 = anr2.a(n2);
        Object object = anq2.d.b;
        anq2 = anr2.d;
        int n3 = anq2.a(anr2.e);
        n2 = adn2.a((byte[])object, n3, n2);
        if (n2 == -1) {
            return -1;
        }
        anr2.d(n2);
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long t(long l2, boolean bl2) {
        synchronized (this) {
            int n2 = this.q;
            if (n2 == 0) return -1L;
            long[] lArray = this.o;
            int n3 = this.r;
            if (l2 >= lArray[n3]) {
                int n4 = n2;
                if (bl2) {
                    int n5 = this.e;
                    n4 = n2;
                    if (n5 != n2) {
                        n4 = n5 + 1;
                    }
                }
                if ((n4 = this.w(n3, n4, l2, false)) == -1) return -1L;
                return this.z(n4);
            }
            return -1L;
        }
    }

    @Override
    public final void u(aga aga2, int n2) {
        while (n2 > 0) {
            anr anr2 = this.a;
            int n3 = anr2.a(n2);
            anq anq2 = anr2.d;
            Object object = anq2.d.b;
            int n4 = anq2.a(anr2.e);
            aga2.r((byte[])object, n4, n3);
            n2 -= n3;
            anr2.d(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int v(arq arq2, ahx object, boolean bl2, boolean bl3, ans ans2) {
        synchronized (this) {
            ((ahx)object).d = false;
            if (!this.C()) {
                if (bl3) {
                    ((aht)object).setFlags(4);
                    ((ahx)object).e = Long.MIN_VALUE;
                    return -4;
                }
                object = this.x;
                if (object != null && (bl2 || object != this.i)) {
                    this.F((adu)object, arq2);
                    return -5;
                }
                return -3;
            }
            Object object2 = ((awg)this.A.e((int)this.a())).b;
            if (!bl2 && object2 == this.i) {
                int n2 = this.x(this.e);
                if (!this.D(n2)) {
                    ((ahx)object).d = true;
                    return -3;
                }
                ((aht)object).setFlags(this.n[n2]);
                if (this.e == this.q - 1 && bl3) {
                    ((aht)object).addFlag(0x20000000);
                }
                ((ahx)object).e = this.o[n2];
                ans2.a = this.m[n2];
                ans2.b = this.l[n2];
                ans2.c = this.p[n2];
                return -4;
            }
            this.F((adu)object2, arq2);
            return -5;
        }
    }
}

