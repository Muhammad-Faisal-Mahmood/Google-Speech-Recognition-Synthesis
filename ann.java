/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 */
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ann
implements anb,
apq,
apd,
apf,
ant {
    public static final Map a;
    public static final adu b;
    private final alg A;
    private final long B;
    private final afn C;
    private anm[] D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private long K;
    private final apb L;
    private final dvy M;
    private ayn N;
    public final aph c;
    public final Runnable d;
    public final Runnable e;
    public final Handler f;
    public ana g;
    public aqj h;
    public anu[] i;
    public boolean j;
    public aqb k;
    public long l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public final anp v;
    public final dvy w;
    public final ivu x;
    private final Uri y;
    private final agr z;

    static {
        Object object = new HashMap<String, String>();
        object.put("Icy-MetaData", "1");
        a = DesugarCollections.unmodifiableMap(object);
        object = new adt();
        ((adt)object).a = "icy";
        ((adt)object).a("application/x-icy");
        b = new adu((adt)object);
    }

    public ann(Uri uri, agr agr2, ivu ivu2, alg alg2, dvy dvy2, dvy dvy3, anp anp2, apb apb2, long l2) {
        this.y = uri;
        this.z = agr2;
        this.A = alg2;
        this.M = dvy2;
        this.w = dvy3;
        this.v = anp2;
        this.L = apb2;
        this.c = new aph();
        this.x = ivu2;
        this.B = l2;
        this.C = new afn();
        this.d = new akt(this, 4);
        this.e = new akt(this, 5);
        this.f = agf.n();
        this.D = new anm[0];
        this.i = new anu[0];
        this.K = -9223372036854775807L;
        this.n = 1;
    }

    private final void A() {
        int n2;
        Object object;
        Object object2 = new ank(this, this.y, this.z, this.x, this, this.C);
        if (this.j) {
            abr.f(this.B());
            long l2 = this.l;
            if (l2 != -9223372036854775807L && this.K > l2) {
                this.t = true;
                this.K = -9223372036854775807L;
                return;
            }
            object = this.k;
            abr.i(object);
            object = object.c((long)this.K).a;
            l2 = this.K;
            ((ank)object2).b(object.c, l2);
            object = this.i;
            int n3 = ((anu[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                object[n2].f = this.K;
            }
            this.K = -9223372036854775807L;
        }
        this.s = this.b();
        object = this.c;
        Looper looper = Looper.myLooper();
        abr.j(looper);
        object.d = null;
        SystemClock.elapsedRealtime();
        new ape((aph)object, looper, (ank)object2, this).b(0L);
        object = ((ank)object2).j;
        object2 = this.w;
        object = new amv((agt)object);
        n2 = agf.a;
        ((dvy)object2).n((amv)object, new hti(-1, null));
    }

    private final boolean B() {
        return this.K != -9223372036854775807L;
    }

    private final void z() {
        abr.f(this.j);
        abr.i(this.N);
        abr.i(this.k);
    }

    @Override
    public final long a(long l2, aka aka2) {
        long l3;
        block14: {
            block10: {
                boolean bl2;
                long l4;
                block13: {
                    long l5;
                    block12: {
                        int n2;
                        block11: {
                            long l6;
                            aqc aqc2;
                            Object object;
                            block9: {
                                this.z();
                                if (!this.k.d()) {
                                    return 0L;
                                }
                                object = this.k.c(l2);
                                aqc2 = ((apz)object).a;
                                object = ((apz)object).b;
                                l6 = l3 = aka2.c;
                                if (l3 != 0L) break block9;
                                if (aka2.d == 0L) break block10;
                                l6 = 0L;
                            }
                            l5 = aqc2.b;
                            n2 = agf.a;
                            long l7 = l2 - l6;
                            long l8 = aka2.d;
                            l4 = l2 + l8;
                            l3 = l7;
                            if (((l2 ^ l6) & (l2 ^ l7)) < 0L) {
                                l3 = Long.MIN_VALUE;
                            }
                            l6 = l4;
                            if (((l2 ^ l4) & (l8 ^ l4)) < 0L) {
                                l6 = Long.MAX_VALUE;
                            }
                            bl2 = true;
                            n2 = l3 <= l5 && l5 <= l6 ? 1 : 0;
                            l4 = ((aqc)object).b;
                            if (l3 > l4 || l4 > l6) {
                                bl2 = false;
                            }
                            if (n2 == 0 || !bl2) break block11;
                            if (Math.abs(l5 - l2) > Math.abs(l4 - l2)) {
                                return l4;
                            }
                            break block12;
                        }
                        if (n2 == 0) break block13;
                    }
                    l2 = l5;
                    break block10;
                }
                if (!bl2) break block14;
                l2 = l4;
            }
            return l2;
        }
        return l3;
    }

    public final int b() {
        anu[] anuArray = this.i;
        int n2 = anuArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += anuArray[i2].c();
        }
        return n3;
    }

    public final long c(boolean bl2) {
        long l2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            long l3;
            block4: {
                block3: {
                    if (bl2) break block3;
                    ayn ayn2 = this.N;
                    abr.i(ayn2);
                    l3 = l2;
                    if (!((boolean[])ayn2.b)[i2]) break block4;
                }
                l3 = Math.max(l2, this.i[i2].e());
            }
            l2 = l3;
        }
        return l2;
    }

    @Override
    public final long d() {
        this.z();
        if (!this.t && this.J != 0) {
            long l2;
            long l3;
            if (this.B()) {
                return this.K;
            }
            if (this.F) {
                int n2 = this.i.length;
                int n3 = 0;
                l3 = Long.MAX_VALUE;
                while (true) {
                    l2 = l3;
                    if (n3 < n2) {
                        ayn ayn2 = this.N;
                        l2 = l3;
                        if (((boolean[])ayn2.d)[n3]) {
                            l2 = l3;
                            if (((boolean[])ayn2.b)[n3]) {
                                this.i[n3].o();
                                l2 = Math.min(l3, this.i[n3].e());
                            }
                        }
                        ++n3;
                        l3 = l2;
                        continue;
                    }
                    break;
                }
            } else {
                l2 = Long.MAX_VALUE;
            }
            l3 = l2;
            if (l2 == Long.MAX_VALUE) {
                l3 = this.c(false);
            }
            if (l3 == Long.MIN_VALUE) {
                return this.q;
            }
            return l3;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long e() {
        return this.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final long f() {
        if (this.I) {
            this.I = false;
            return this.q;
        }
        if (!this.o || !this.t && this.b() <= this.s) return -9223372036854775807L;
        this.o = false;
        return this.q;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final long g(long l2) {
        int n2;
        int n3;
        int n4;
        block9: {
            this.z();
            Object object = this.N.d;
            if (!this.k.d()) {
                l2 = 0L;
            }
            n4 = 0;
            n3 = 0;
            this.o = false;
            this.q = l2;
            if (this.B()) {
                this.K = l2;
                return l2;
            }
            if (this.n != 7 && (this.t || this.c.b())) {
                int n5 = this.i.length;
                n2 = 0;
                while (n2 < n5) {
                    anu anu2 = this.i[n2];
                    boolean bl2 = this.G ? anu2.q(anu2.d) : anu2.r(l2, false);
                    if (bl2 || !((boolean[])object)[n2] && this.F) {
                        ++n2;
                        continue;
                    }
                    break block9;
                }
                return l2;
            }
        }
        this.r = false;
        this.K = l2;
        this.t = false;
        this.I = false;
        aph aph2 = this.c;
        if (aph2.b()) {
            anu[] anuArray = this.i;
            n4 = anuArray.length;
            n2 = n3;
            while (true) {
                if (n2 >= n4) {
                    this.c.a();
                    return l2;
                }
                anuArray[n2].g();
                ++n2;
            }
        }
        aph2.d = null;
        anu[] anuArray = this.i;
        n3 = anuArray.length;
        n2 = n4;
        while (n2 < n3) {
            anuArray[n2].j();
            ++n2;
        }
        return l2;
    }

    @Override
    public final aob h() {
        this.z();
        return (aob)this.N.c;
    }

    @Override
    public final void i() {
        this.u();
        if (this.t && !this.j) {
            throw new aem("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override
    public final void j(ana ana2, long l2) {
        this.g = ana2;
        this.C.e();
        this.A();
    }

    @Override
    public final void k(long l2) {
    }

    @Override
    public final boolean l(ajh object) {
        if (!this.t) {
            object = this.c;
            if (!(((aph)object).d != null || this.r || this.j && this.J == 0)) {
                boolean bl2 = this.C.e();
                if (!((aph)object).b()) {
                    this.A();
                    return true;
                }
                return bl2;
            }
        }
        return false;
    }

    @Override
    public final boolean m() {
        return this.c.b() && this.C.d();
    }

    public final aqe n(anm anuArray) {
        int n2;
        int n3 = this.i.length;
        for (n2 = 0; n2 < n3; ++n2) {
            if (!anuArray.equals(this.D[n2])) continue;
            return this.i[n2];
        }
        if (this.E) {
            afx.e("ProgressiveMediaPeriod", a.ah(0, "Extractor added new track (id=", ") after finishing tracks."));
            return new apn();
        }
        anu anu2 = new anu(this.L, this.A);
        anu2.c = this;
        anm[] anmArray = this.D;
        n2 = n3 + 1;
        anmArray = Arrays.copyOf(anmArray, n2);
        anmArray[n3] = anuArray;
        int n4 = agf.a;
        this.D = anmArray;
        anuArray = Arrays.copyOf(this.i, n2);
        anuArray[n3] = anu2;
        this.i = anuArray;
        return anu2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final long o(aoh[] objectArray, boolean[] object, anv[] anvArray, boolean[] blArray, long l2) {
        int n2;
        Object object2;
        int n3;
        this.z();
        Object object3 = this.N;
        Object object4 = ((ayn)object3).c;
        object3 = ((ayn)object3).b;
        int n4 = this.J;
        int n5 = 0;
        int n6 = 0;
        for (n3 = 0; n3 < objectArray.length; ++n3) {
            object2 = anvArray[n3];
            if (object2 == null || objectArray[n3] != null && object[n3] != false) continue;
            n2 = ((anl)object2).a;
            object2 = (boolean[])object3;
            abr.f((boolean)object2[n2]);
            --this.J;
            object2[n2] = false;
            anvArray[n3] = null;
        }
        n3 = (this.H ? n4 == 0 : l2 != 0L && !this.G) ? 1 : 0;
        n2 = n3;
        for (n4 = 0; n4 < objectArray.length; ++n4) {
            n3 = n2;
            if (anvArray[n4] == null) {
                object2 = objectArray[n4];
                n3 = n2;
                if (object2 != null) {
                    boolean bl2 = ((aoh)object2).a() == 1;
                    abr.f(bl2);
                    bl2 = ((aoh)object2).c[0] == 0;
                    abr.f(bl2);
                    int n7 = n3 = ((aob)object4).c.indexOf(((aoh)object2).a);
                    if (n3 < 0) {
                        n7 = -1;
                    }
                    object = (boolean[])object3;
                    abr.f(object[n7] ^ true);
                    ++this.J;
                    object[n7] = true;
                    boolean bl3 = this.I;
                    bl2 = ((aoh)object2).d[0].u;
                    this.I = bl3;
                    anvArray[n4] = new anl(this, n7);
                    blArray[n4] = true;
                    n3 = n2;
                    if (n2 == 0) {
                        object = this.i[n7];
                        n3 = ((anu)object).a() != 0 && !((anu)object).r(l2, true) ? 1 : 0;
                    }
                }
            }
            n2 = n3;
        }
        if (this.J == 0) {
            this.r = false;
            this.o = false;
            this.I = false;
            if (this.c.b()) {
                objectArray = this.i;
                n4 = objectArray.length;
                for (n3 = n6; n3 < n4; ++n3) {
                    ((anu)objectArray[n3]).g();
                }
                this.c.a();
            } else {
                this.t = false;
                objectArray = this.i;
                n4 = objectArray.length;
                for (n3 = n5; n3 < n4; ++n3) {
                    ((anu)objectArray[n3]).j();
                }
            }
        } else if (n2 != 0) {
            long l3;
            l2 = l3 = this.g(l2);
            if (anvArray[0] != null) {
                blArray[0] = true;
                l2 = l3;
            }
        }
        this.H = true;
        return l2;
    }

    @Override
    public final void p(long l2) {
        if (!this.G) {
            this.z();
            if (!this.B()) {
                Object object = this.N.b;
                int n2 = this.i.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    anu anu2 = this.i[i2];
                    boolean bl2 = ((boolean[])object)[i2];
                    anu2.a.c(anu2.t(l2, bl2));
                }
            }
        }
    }

    @Override
    public final void q() {
        this.E = true;
        this.f.post(this.d);
    }

    public final void r() {
        block12: {
            int n2;
            if (this.u || this.j || !this.E || this.k == null) break block12;
            Object object = this.i;
            int n3 = ((anu[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                if (object[n2].f() != null) {
                    continue;
                }
                break block12;
            }
            this.C.f();
            n3 = this.i.length;
            aex[] aexArray = new aex[n3];
            boolean[] blArray = new boolean[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                Object object2;
                block13: {
                    aqj aqj2;
                    boolean bl2;
                    block15: {
                        adu adu2;
                        block14: {
                            adu2 = this.i[n2].f();
                            abr.i(adu2);
                            object = adu2.o;
                            bl2 = ael.c((String)object);
                            boolean bl3 = bl2 || ael.e((String)object);
                            blArray[n2] = bl3;
                            this.F = bl3 | this.F;
                            bl3 = ael.d((String)object);
                            bl3 = this.B != -9223372036854775807L && n3 == 1 && bl3;
                            this.G = bl3;
                            aqj2 = this.h;
                            object2 = adu2;
                            if (aqj2 == null) break block13;
                            if (bl2) break block14;
                            object = adu2;
                            if (!this.D[n2].b) break block15;
                        }
                        object = (object = adu2.l) == null ? new aek(aqj2) : ((aek)object).c(aqj2);
                        object2 = new adt(adu2);
                        ((adt)object2).k = object;
                        object = new adu((adt)object2);
                    }
                    object2 = object;
                    if (bl2) {
                        object2 = object;
                        if (((adu)object).h == -1) {
                            object2 = object;
                            if (((adu)object).i == -1) {
                                int n4 = aqj2.a;
                                object2 = object;
                                if (n4 != -1) {
                                    object = new adt((adu)object);
                                    ((adt)object).h = n4;
                                    object2 = new adu((adt)object);
                                }
                            }
                        }
                    }
                }
                object = ((adu)object2).b(this.A.a((adu)object2));
                aexArray[n2] = new aex(Integer.toString(n2), new adu[]{object});
                this.I = this.I;
            }
            this.N = new ayn(new aob(aexArray), blArray);
            if (this.G && this.l == -9223372036854775807L) {
                this.l = this.B;
                this.k = new anj(this, this.k);
            }
            this.v.u(this.l, this.k.d(), this.m);
            this.j = true;
            object = this.g;
            abr.i(object);
            object.c(this);
        }
    }

    public final void s(int n2) {
        this.z();
        Object object = this.N;
        boolean[] blArray = (boolean[])((ayn)object).a;
        if (!blArray[n2]) {
            object = ((aob)((ayn)object).c).a(n2).a(0);
            dvy dvy2 = this.w;
            int n3 = ael.a(((adu)object).o);
            int n4 = agf.a;
            dvy2.j(new hti(n3, (adu)object));
            blArray[n2] = true;
        }
    }

    public final void t(int n2) {
        this.z();
        Object object = this.N.d;
        if (this.r && ((boolean[])object)[n2]) {
            object = this.i[n2];
            if (!((anu)object).p(false)) {
                this.K = 0L;
                this.r = false;
                this.o = true;
                this.q = 0L;
                this.s = 0;
                object = this.i;
                int n3 = ((anu[])object).length;
                for (n2 = 0; n2 < n3; ++n2) {
                    object[n2].j();
                }
                object = this.g;
                abr.i(object);
                object.b(this);
            }
        }
    }

    final void u() {
        int n2 = this.n;
        Object object = this.c;
        Object object2 = ((aph)object).d;
        if (object2 == null) {
            object2 = ((aph)object).c;
            if (object2 != null && (object = ((ape)object2).a) != null && ((ape)object2).b > (n2 = n2 == 7 ? 6 : 3)) {
                throw object;
            }
            return;
        }
        throw object2;
    }

    @Override
    public final void v(aqb object) {
        object = new aks(this, object, 3);
        this.f.post((Runnable)object);
    }

    public final boolean w() {
        return this.o || this.B();
        {
        }
    }

    public final void x(ank object, boolean bl2) {
        Object object2 = ((ank)object).c;
        long l2 = ((ank)object).a;
        object2 = ((ank)object).j;
        object2 = new amv();
        l2 = ((ank)object).i;
        int n2 = agf.a;
        object = new hti(-1, null);
        this.w.k((amv)object2, (hti)object);
        if (!bl2) {
            object = this.i;
            int n3 = ((anu[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                object[n2].j();
            }
            if (this.J > 0) {
                object = this.g;
                abr.i(object);
                object.b(this);
            }
        }
    }

    @Override
    public final aqe y(int n2) {
        return this.n(new anm(0, false));
    }
}

