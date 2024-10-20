/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.os.Trace
 *  android.util.Pair
 */
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public final class ajd
implements Handler.Callback,
ana,
aoy,
ajp,
aij,
ajs {
    private static final long l = agf.m(10000L);
    private ajr A;
    private ajb B;
    private boolean C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private ajc L;
    private long M;
    private int N;
    private boolean O;
    private ail P;
    private long Q;
    private final aig R;
    private final AmbientMode$AmbientController S;
    public final ajw[] a;
    public final ajx[] b;
    public final aoz c;
    public final afp d;
    public final Looper e;
    public final ajq f;
    public boolean g;
    public aip h;
    public final akl i;
    public final aii j;
    public final diz k;
    private final Set m;
    private final boolean[] n;
    private final apa o;
    private final HandlerThread p;
    private final aev q;
    private final aeu r;
    private final long s;
    private final aik t;
    private final ArrayList u;
    private final afl v;
    private final ajl w;
    private final akr x;
    private final afp y;
    private aka z;

    public ajd(ajw[] handlerThread, aoz aoz2, diz object, aii object2, apa apa2, akl akl2, aka aka2, aig aig2, Looper looper, afl afl2, AmbientMode$AmbientController ambientMode$AmbientController, akr akr2, aip aip2) {
        this.S = ambientMode$AmbientController;
        this.a = handlerThread;
        this.c = aoz2;
        this.k = object;
        this.j = object2;
        this.o = apa2;
        int n2 = 0;
        this.H = 0;
        this.I = false;
        this.z = aka2;
        this.R = aig2;
        this.C = false;
        this.v = afl2;
        this.x = akr2;
        this.h = aip2;
        this.i = akl2;
        this.Q = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.s = ((aii)object2).d;
        object2 = aew.a;
        this.A = object = ajr.h((diz)object);
        this.B = new ajb((ajr)object);
        int n3 = ((ajw[])handlerThread).length;
        this.b = new ajx[1];
        this.n = new boolean[1];
        while (true) {
            n3 = ((ajw[])handlerThread).length;
            if (n2 > 0) break;
            handlerThread[n2].n(n2, akr2, afl2);
            this.b[n2] = handlerThread[n2].g();
            this.b[n2].F();
            ++n2;
        }
        this.t = new aik(this);
        this.u = new ArrayList();
        this.m = hhk.t();
        this.q = new aev();
        this.r = new aeu();
        aoz2.g = this;
        aoz2.h = apa2;
        this.O = true;
        handlerThread = afl2.b(looper, null);
        this.y = handlerThread;
        this.w = new ajl(akl2, (afp)handlerThread, new AmbientMode$AmbientController(this, null), aip2);
        this.f = new ajq(this, akl2, (afp)handlerThread, akr2);
        this.p = handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        handlerThread.start();
        handlerThread = handlerThread.getLooper();
        this.e = handlerThread;
        this.d = afl2.b((Looper)handlerThread, this);
    }

    private final void A() {
        float f2 = this.t.b().b;
        Object object = this.w;
        Object object2 = ((ajl)object).d;
        Object object3 = ((ajl)object).e;
        object = null;
        int n2 = 1;
        while (object2 != null && ((ajj)object2).e) {
            int n3;
            Object object4;
            Object object5;
            block14: {
                Object object6;
                object5 = this.A.b;
                object5 = ((ajj)object2).q();
                if (object2 == this.w.d) {
                    object = object5;
                }
                object4 = ((ajj)object2).l;
                int n4 = 0;
                if (object4 != null && ((aoh[])((diz)object4).e).length == ((aoh[])(object6 = ((diz)object5).e)).length) {
                    for (n3 = 0; n3 < ((aoh[])((diz)object5).e).length; ++n3) {
                        if (((diz)object5).c((diz)object4, n3)) {
                            continue;
                        }
                        break block14;
                    }
                    n3 = object2 == object3 ? n4 : 1;
                    n2 = n3 & n2;
                    object2 = ((ajj)object2).i;
                    continue;
                }
            }
            if (n2 != 0) {
                object5 = this.w;
                object2 = ((ajl)object5).d;
                boolean bl2 = ((ajl)object5).n((ajj)object2);
                n2 = this.a.length;
                object5 = new boolean[1];
                abr.i(object);
                long l2 = ((ajj)object2).o((diz)object, this.A.s, bl2, (boolean[])object5);
                object = this.A;
                bl2 = ((ajr)object).f != 4 && l2 != ((ajr)object).s;
                object = this.A;
                object3 = ((ajr)object).c;
                long l3 = ((ajr)object).d;
                long l4 = ((ajr)object).e;
                object = object2;
                this.A = this.n((anc)object3, l2, l3, l4, bl2, 5);
                if (bl2) {
                    this.E(l2);
                }
                n2 = this.a.length;
                object2 = new boolean[1];
                n2 = 0;
                while (true) {
                    object3 = this.a;
                    n3 = ((ajw[])object3).length;
                    if (n2 > 0) break;
                    object3 = object3[n2];
                    bl2 = ajd.S((ajw)object3);
                    object2[n2] = bl2;
                    object4 = ((ajj)object).c[n2];
                    if (bl2) {
                        if (object4 != object3.i()) {
                            this.o(n2);
                        } else if (object5[n2] != false) {
                            object3.v(this.M);
                        }
                    }
                    ++n2;
                }
                this.r((boolean[])object2, this.M);
            } else {
                this.w.n((ajj)object2);
                if (((ajj)object2).e) {
                    ((ajj)object2).p((diz)object5, Math.max(((ajj)object2).g.b, ((ajj)object2).d(this.M)));
                }
            }
            this.t(true);
            if (this.A.f == 4) break;
            this.w();
            this.P();
            this.d.d(2);
            break;
        }
    }

    private final void B() {
        this.A();
        this.H(true);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void C(boolean var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        this.d.a(2);
        var18_5 = null;
        this.P = null;
        var6_6 = 1;
        this.R(false, true);
        this.t.e();
        this.M = 1000000000000L;
        var5_7 = 0;
        while (true) {
            block21: {
                var16_8 /* !! */  = this.a;
                var7_11 = ((ajw[])var16_8 /* !! */ ).length;
                if (var5_7 > 0) break;
                try {
                    this.o(var5_7);
                    break block21;
                }
                catch (RuntimeException var16_9) {
                }
                catch (ail var16_10) {
                    // empty catch block
                }
                afx.c("ExoPlayerImplInternal", "Disable failed.", (Throwable)var16_8 /* !! */ );
            }
            ++var5_7;
        }
        if (var1_1) {
            for (var5_7 = 0; var5_7 <= 0; ++var5_7) {
                var17_12 = var16_8 /* !! */ [var5_7];
                if (!this.m.remove(var17_12)) continue;
                try {
                    var17_12.u();
                    continue;
                }
                catch (RuntimeException var17_13) {
                    afx.c("ExoPlayerImplInternal", "Reset failed.", var17_13);
                }
            }
        }
        this.K = 0;
        var17_12 = this.A;
        var16_8 /* !! */  = var17_12.c;
        var8_14 = var17_12.s;
        var10_15 = !this.A.c.b() && !ajd.U(this.A, this.r) ? this.A.s : this.A.d;
        if (!var2_2) ** GOTO lbl-1000
        this.L = null;
        var16_8 /* !! */  = this.l(this.A.b);
        var17_12 = (anc)var16_8 /* !! */ .first;
        var14_16 = (Long)var16_8 /* !! */ .second;
        var1_1 = var17_12.equals(this.A.c);
        var12_17 = -9223372036854775807L;
        var16_8 /* !! */  = var17_12;
        var8_14 = var14_16;
        var10_15 = var12_17;
        if (!var1_1) {
            var5_7 = var6_6;
            var16_8 /* !! */  = var17_12;
            var8_14 = var14_16;
            var10_15 = var12_17;
        } else lbl-1000:
        // 2 sources

        {
            var5_7 = 0;
        }
        this.w.f();
        this.G = false;
        var17_12 = this.A.b;
        if (var3_3 && var17_12 instanceof aia) {
            var17_12 = (aia)var17_12;
            var19_18 = this.f;
            var20_20 /* !! */  = var17_12.c;
            var19_18 = var19_18.k;
            var20_20 /* !! */  = new aew[var20_20 /* !! */ .length];
            for (var6_6 = 0; var6_6 < (var21_21 /* !! */  = var17_12.c).length; ++var6_6) {
                var20_20 /* !! */ [var6_6] = new ajv(var21_21 /* !! */ [var6_6]);
            }
            var17_12 = new aia(var20_20 /* !! */ , var17_12.d, (bmu)var19_18);
            if (var16_8 /* !! */ .b != -1) {
                var17_12.n(var16_8 /* !! */ .a, this.r);
                var20_20 /* !! */  = this.r;
                var19_18 = this.q;
                if (var17_12.o(var20_20 /* !! */ .c, (aev)var19_18).b()) {
                    var16_8 /* !! */  = new anc(var16_8 /* !! */ .a, var16_8 /* !! */ .d);
                }
            }
        }
        var19_18 = this.A;
        var6_6 = var19_18.f;
        if (!var4_4) {
            var18_5 = var19_18.g;
        }
        var19_18 = var5_7 != 0 ? aob.a : var19_18.i;
        var20_20 /* !! */  = var5_7 != 0 ? this.k : this.A.u;
        if (var5_7 != 0) {
            var5_7 = gzx.d;
            var21_21 /* !! */  = hct.a;
        } else {
            var21_21 /* !! */  = this.A.j;
        }
        var22_22 = this.A;
        this.A = new ajr((aew)var17_12, (anc)var16_8 /* !! */ , var10_15, var8_14, var6_6, (ail)var18_5, false, (aob)var19_18, (diz)var20_20 /* !! */ , (List)var21_21 /* !! */ , (anc)var16_8 /* !! */ , var22_22.l, var22_22.m, var22_22.n, var22_22.o, var8_14, 0L, var8_14, 0L);
        if (var3_3) {
            this.w.j();
            var18_5 = this.f;
            for (Pair var16_8 : var18_5.e.values()) {
                try {
                    var16_8 /* !! */ .a.j((and)var16_8 /* !! */ .c);
                }
                catch (RuntimeException var19_19) {
                    afx.c("MediaSourceList", "Failed to release child source.", var19_19);
                }
                var16_8 /* !! */ .a.m((ani)var16_8 /* !! */ .b);
                var16_8 /* !! */ .a.l((alc)var16_8 /* !! */ .b);
            }
            var18_5.e.clear();
            var18_5.f.clear();
            var18_5.h = false;
        }
    }

    private final void D() {
        boolean bl2;
        ajj ajj2 = this.w.d;
        boolean bl3 = bl2 = false;
        if (ajj2 != null) {
            bl3 = bl2;
            if (ajj2.g.h) {
                bl3 = bl2;
                if (this.C) {
                    bl3 = true;
                }
            }
        }
        this.D = bl3;
    }

    private final void E(long l2) {
        Object object = this.w.d;
        l2 = object == null ? (l2 += 1000000000000L) : ((ajj)object).e(l2);
        this.M = l2;
        this.t.a.d(l2);
        ajw[] object22 = this.a;
        int n2 = object22.length;
        for (n2 = 0; n2 <= 0; ++n2) {
            object = object22[n2];
            if (!ajd.S((ajw)object)) continue;
            object.v(this.M);
        }
        object = this.w.d;
        while (object != null) {
            for (aoh aoh2 : (aoh[])((ajj)object).l.e) {
            }
            object = ((ajj)object).i;
        }
    }

    private final void F(aew object, aew object2) {
        if (((aew)object).p() && ((aew)object2).p()) {
            return;
        }
        int n2 = this.u.size() - 1;
        if (n2 < 0) {
            Collections.sort(this.u);
            return;
        }
        object = (aja)this.u.get(n2);
        object2 = ((aja)object).b;
        object = ((aja)object).a;
        throw null;
    }

    private final void G(long l2) {
        long l3 = this.A.f == 3 && !this.V() ? 1000L : l;
        ((agd)this.d).b.sendEmptyMessageAtTime(2, l2 + l3);
    }

    private final void H(boolean bl2) {
        anc anc2 = this.w.d.g.a;
        long l2 = this.k(anc2, this.A.s, true, false);
        if (l2 != this.A.s) {
            ajr ajr2 = this.A;
            this.A = this.n(anc2, l2, ajr2.d, ajr2.e, bl2, 5);
        }
    }

    private final void I(aeo aeo2) {
        this.d.a(16);
        aik aik2 = this.t;
        aji aji2 = aik2.d;
        aeo aeo3 = aeo2;
        if (aji2 != null) {
            aji2.c(aeo2);
            aeo3 = aik2.d.b();
        }
        aik2.a.c(aeo3);
    }

    private final void J(boolean bl2, int n2, boolean n3, int n4) {
        this.B.a(n3);
        this.A = this.A.b(bl2, n4, n2);
        this.R(false, false);
        ajj ajj2 = this.w.d;
        while (ajj2 != null) {
            for (aoh aoh2 : (aoh[])ajj2.l.e) {
            }
            ajj2 = ajj2.i;
        }
        if (!this.V()) {
            this.N();
            this.P();
            return;
        }
        n2 = this.A.f;
        if (n2 == 3) {
            this.t.d();
            this.L();
            this.d.d(2);
            return;
        }
        if (n2 == 2) {
            this.d.d(2);
        }
    }

    private final void K(int n2) {
        ajr ajr2 = this.A;
        if (ajr2.f != n2) {
            if (n2 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.A = ajr2.d(n2);
        }
    }

    private final void L() {
        Object object = this.w.d;
        if (object != null) {
            object = ((ajj)object).l;
            int n2 = 0;
            while (true) {
                int n3 = this.a.length;
                if (n2 > 0) break;
                if (((diz)object).b(n2) && this.a[n2].aD() == 1) {
                    this.a[n2].y();
                }
                ++n2;
            }
        }
    }

    private final void M(boolean bl2, boolean bl3) {
        bl2 = bl2 || !this.J;
        this.C(bl2, false, true, false);
        this.B.a(bl3 ? 1 : 0);
        this.j.c(this.x);
        this.K(1);
    }

    private final void N() {
        this.t.e();
        ajw[] ajwArray = this.a;
        int n2 = ajwArray.length;
        for (n2 = 0; n2 <= 0; ++n2) {
            ajw ajw2 = ajwArray[n2];
            if (!ajd.S(ajw2)) continue;
            ajd.X(ajw2);
        }
    }

    private final void O() {
        Object object = this.w.f;
        boolean bl2 = this.G || object != null && ((ajj)object).a.m();
        ajr ajr2 = this.A;
        if (bl2 != ajr2.h) {
            aew aew2 = ajr2.b;
            anc anc2 = ajr2.c;
            long l2 = ajr2.d;
            long l3 = ajr2.e;
            int n2 = ajr2.f;
            ail ail2 = ajr2.g;
            aob aob2 = ajr2.i;
            object = ajr2.u;
            List list = ajr2.j;
            anc anc3 = ajr2.k;
            boolean bl3 = ajr2.l;
            int n3 = ajr2.m;
            int n4 = ajr2.n;
            aeo aeo2 = ajr2.o;
            long l4 = ajr2.q;
            long l5 = ajr2.r;
            long l6 = ajr2.s;
            long l7 = ajr2.t;
            boolean bl4 = ajr2.p;
            this.A = new ajr(aew2, anc2, l2, l3, n2, ail2, bl2, aob2, (diz)object, list, anc3, bl3, n3, n4, aeo2, l4, l5, l6, l7);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void P() {
        block29: {
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                var19_1 = this.w.d;
                                if (var19_1 == null) break block29;
                                var7_2 = var19_1.e != false ? var19_1.a.f() : -9223372036854775807L;
                                if (var7_2 == -9223372036854775807L) break block30;
                                if (!var19_1.k()) {
                                    this.w.n((ajj)var19_1);
                                    this.t(false);
                                    this.w();
                                }
                                this.E(var7_2);
                                if (var7_2 != this.A.s) {
                                    var19_1 = this.A;
                                    this.A = this.n(var19_1.c, var7_2, var19_1.d, var7_2, true, 5);
                                }
                                break block31;
                            }
                            var20_3 = this.t;
                            var4_4 = var19_1 != this.w.e ? 1 : 0;
                            var21_5 = var20_3.c;
                            if (var21_5 == null || var21_5.Q() || var4_4 != 0 && var20_3.c.aD() != 2 || !var20_3.c.R() && (var4_4 != 0 || var20_3.c.A())) break block32;
                            var21_5 = var20_3.d;
                            abr.i(var21_5);
                            var7_2 = var21_5.a();
                            if (!var20_3.e) ** GOTO lbl30
                            if (var7_2 < var20_3.a.a()) {
                                var20_3.a.f();
                            } else {
                                var20_3.e = false;
                                if (var20_3.f) {
                                    var20_3.a.e();
                                }
lbl30:
                                // 4 sources

                                var20_3.a.d(var7_2);
                                var21_5 = var21_5.b();
                                if (!var21_5.equals(var20_3.a.a)) {
                                    var20_3.a.c((aeo)var21_5);
                                    ((ajd)var20_3.b).d.f(16, var21_5).d();
                                }
                            }
                            break block33;
                        }
                        var20_3.e = true;
                        if (var20_3.f) {
                            var20_3.a.e();
                        }
                    }
                    if (var20_3.e) {
                        var7_2 = var20_3.a.a();
                    } else {
                        var20_3 = var20_3.d;
                        abr.i(var20_3);
                        var7_2 = var20_3.a();
                    }
                    this.M = var7_2;
                    var11_6 = var19_1.d(var7_2);
                    var9_7 /* !! */  = this.A.s;
                    if (this.u.isEmpty() || this.A.c.b()) break block34;
                    var7_2 = var9_7 /* !! */ ;
                    if (this.O) {
                        var7_2 = var9_7 /* !! */  - 1L;
                        this.O = false;
                    }
                    var19_1 = this.A;
                    var6_8 = var19_1.b.a(var19_1.c.a);
                    var5_9 = Math.min(this.N, this.u.size());
                    var9_7 /* !! */  = var7_2;
                    var4_4 = var5_9;
                    if (var5_9 <= 0) ** GOTO lbl71
                    var19_1 = (aja)this.u.get(var5_9 - 1);
                    var4_4 = var5_9;
                    while (var19_1 != null && (var6_8 < 0 || var6_8 == 0 && var7_2 < 0L)) {
                        var5_9 = var4_4 - 1;
                        if (var5_9 > 0) {
                            var19_1 = (aja)this.u.get(var4_4 - 2);
                            var4_4 = var5_9;
                            continue;
                        }
                        var4_4 = var5_9;
                        var9_7 /* !! */  = var7_2;
lbl71:
                        // 2 sources

                        var19_1 = null;
                        var7_2 = var9_7 /* !! */ ;
                    }
                    if (var4_4 < this.u.size()) {
                        var19_1 = (aja)this.u.get(var4_4);
                    }
                    this.N = var4_4;
                }
                var19_1 = this.t;
                if (!var19_1.e) {
                    abr.i(var19_1.d);
                }
                var19_1 = this.A;
                var19_1.s = var11_6;
                var19_1.t = SystemClock.elapsedRealtime();
            }
            var19_1 = this.w.f;
            this.A.q = var19_1.a();
            this.A.r = this.h();
            var19_1 = this.A;
            if (var19_1.l && var19_1.f == 3 && this.W(var19_1.b, var19_1.c)) {
                var20_3 = this.A;
                var2_10 = var20_3.o.b;
                var1_11 = 1.0f;
                if (var2_10 == 1.0f) {
                    var19_1 = this.R;
                    var13_12 = this.g(var20_3.b, var20_3.c.a, var20_3.s);
                    var7_2 = this.A.r;
                    if (var19_1.c != -9223372036854775807L) {
                        var7_2 = var13_12 - var7_2;
                        var9_7 /* !! */  = var19_1.l;
                        if (var9_7 /* !! */  == -9223372036854775807L) {
                            var19_1.l = var7_2;
                            var19_1.m = 0L;
                        } else {
                            var19_1.l = var9_7 /* !! */  = Math.max(var7_2, aig.c(var9_7 /* !! */ , var7_2));
                            var7_2 = Math.abs(var7_2 - var9_7 /* !! */ );
                            var19_1.m = aig.c(var19_1.m, var7_2);
                        }
                        if (var19_1.k != -9223372036854775807L && SystemClock.elapsedRealtime() - var19_1.k < 1000L) {
                            var1_11 = var19_1.j;
                        } else {
                            var19_1.k = SystemClock.elapsedRealtime();
                            var7_2 = var19_1.l + var19_1.m * 3L;
                            if (var19_1.g > var7_2) {
                                var15_13 = agf.i(1000L);
                                var1_11 = var19_1.j;
                                var3_14 = var19_1.h;
                                var9_7 /* !! */  = var19_1.d;
                                var11_6 = var19_1.g;
                                var2_10 = var15_13;
                                var15_13 = (long)((var1_11 - 1.0f) * var2_10);
                                var17_15 = (long)((var3_14 - 1.0f) * var2_10);
                                var20_3 = new long[3];
                                var20_3[0] = var7_2;
                                var20_3[1] = var9_7 /* !! */ ;
                                var20_3[2] = var11_6 - (var15_13 + var17_15);
                                fxf.q(true);
                                var7_2 = (long)var20_3[0];
                                for (var4_4 = 1; var4_4 < 3; ++var4_4) {
                                    var9_7 /* !! */  = (long)var20_3[var4_4];
                                    if (var9_7 /* !! */  <= var7_2) continue;
                                    var7_2 = var9_7 /* !! */ ;
                                }
                                var19_1.g = var7_2;
                            } else {
                                var19_1.g = var9_7 /* !! */  = agf.h(var13_12 - (long)(Math.max(0.0f, var19_1.j - 1.0f) / 1.0E-7f), var19_1.g, var7_2);
                                var11_6 = var19_1.f;
                                var7_2 = var9_7 /* !! */ ;
                                if (var11_6 != -9223372036854775807L) {
                                    var7_2 = var9_7 /* !! */ ;
                                    if (var9_7 /* !! */  > var11_6) {
                                        var19_1.g = var11_6;
                                        var7_2 = var11_6;
                                    }
                                }
                            }
                            var9_7 /* !! */  = var13_12 - var7_2;
                            var7_2 = var19_1.a;
                            if (Math.abs(var9_7 /* !! */ ) < var7_2) {
                                var19_1.j = 1.0f;
                                var1_11 = 1.0f;
                            } else {
                                var1_11 = var9_7 /* !! */ ;
                                var19_1.j = var1_11 = Math.max(var19_1.i, Math.min(var1_11 * 1.0E-7f + 1.0f, var19_1.h));
                            }
                        }
                    }
                    if (this.t.b().b != var1_11) {
                        var19_1 = this.A.o;
                        this.I(new aeo(var1_11));
                        var19_1 = this.A.o;
                        var1_11 = this.t.b().b;
                        this.ab((aeo)var19_1, false, false);
                    }
                }
            }
        }
    }

    private final void Q(aew object, anc object2, aew aew2, anc anc2, long l2, boolean bl2) {
        block8: {
            block7: {
                block6: {
                    if (this.W((aew)object, (anc)object2)) break block6;
                    object = ((anc)object2).b() ? aeo.a : this.A.o;
                    if (!this.t.b().equals(object)) {
                        this.I((aeo)object);
                        object2 = this.A.o;
                        float f2 = ((aeo)object).b;
                        this.ab((aeo)object2, false, false);
                        return;
                    }
                    break block7;
                }
                ((aew)object).o(((aew)object).n((Object)((anc)object2).a, (aeu)this.r).c, this.q);
                aig aig2 = this.R;
                aeb aeb2 = this.q.j;
                int n2 = agf.a;
                long l3 = aeb2.a;
                aig2.c = agf.i(-9223372036854775807L);
                l3 = aeb2.b;
                aig2.e = agf.i(-9223372036854775807L);
                l3 = aeb2.c;
                aig2.f = agf.i(-9223372036854775807L);
                float f3 = aeb2.d;
                aig2.i = 0.97f;
                f3 = aeb2.e;
                aig2.h = 1.03f;
                aig2.a();
                if (l2 != -9223372036854775807L) {
                    this.R.b(this.g((aew)object, ((anc)object2).a, l2));
                    return;
                }
                object2 = this.q.b;
                object = !aew2.p() ? aew2.o((int)aew2.n((Object)anc2.a, (aeu)this.r).c, (aev)this.q).b : null;
                if (!Objects.equals(object, object2) || bl2) break block8;
            }
            return;
        }
        this.R.b(-9223372036854775807L);
    }

    private final void R(boolean bl2, boolean bl3) {
        long l2;
        this.E = bl2;
        long l3 = l2 = -9223372036854775807L;
        if (bl2) {
            l3 = l2;
            if (!bl3) {
                l3 = SystemClock.elapsedRealtime();
            }
        }
        this.F = l3;
    }

    private static boolean S(ajw ajw2) {
        return ajw2.aD() != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean T() {
        boolean bl2;
        ajj ajj2 = this.w.d;
        long l2 = ajj2.g.e;
        boolean bl3 = ajj2.e;
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        if (l2 == -9223372036854775807L) return true;
        if (this.A.s < l2) return true;
        if (!this.V()) return true;
        return bl2;
    }

    private static boolean U(ajr object, aeu aeu2) {
        anc anc2 = ((ajr)object).c;
        object = ((ajr)object).b;
        return ((aew)object).p() || ((aew)object).n((Object)anc2.a, (aeu)aeu2).f;
        {
        }
    }

    private final boolean V() {
        ajr ajr2 = this.A;
        return ajr2.l && ajr2.n == 0;
    }

    private final boolean W(aew object, anc anc2) {
        if (!anc2.b() && !((aew)object).p()) {
            ((aew)object).o(((aew)object).n((Object)anc2.a, (aeu)this.r).c, this.q);
            if (this.q.b()) {
                object = this.q;
                if (((aev)object).i && ((aev)object).f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final void X(ajw ajw2) {
        if (ajw2.aD() == 2) {
            ajw2.z();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final boolean Y(ajj ajj2) {
        if (ajj2 == null) return false;
        try {
            if (!ajj2.e) {
                ajj2.a.i();
            } else {
                anv anv2 = ajj2.c[0];
                if (anv2 != null) {
                    anv2.b();
                }
            }
            if (ajj2.b() == Long.MIN_VALUE) return false;
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private static final void Z(ajw ajw2) {
        ajw2.w();
        if (!(ajw2 instanceof aoe)) {
            return;
        }
        ajw2 = (aoe)ajw2;
        throw null;
    }

    static int a(aev aev2, aeu aeu2, int n2, boolean bl2, Object object, aew aew2, aew aew3) {
        int n3;
        int n4;
        Object object2 = aew2.o((int)aew2.n((Object)object, (aeu)aeu2).c, (aev)aev2).b;
        int n5 = 0;
        for (n4 = 0; n4 < aew3.c(); ++n4) {
            if (!aew3.o((int)n4, (aev)aev2).b.equals(object2)) continue;
            return n4;
        }
        int n6 = aew2.a(object);
        int n7 = aew2.b();
        n4 = -1;
        while (true) {
            n3 = n4;
            if (n5 >= n7) break;
            n3 = n4;
            if (n4 != -1) break;
            if ((n6 = aew2.i(n6, aeu2, aev2, n2, bl2)) == -1) {
                n3 = -1;
                break;
            }
            n4 = aew3.a(aew2.f(n6));
            ++n5;
        }
        if (n3 == -1) {
            return -1;
        }
        return aew3.m((int)n3, (aeu)aeu2).c;
    }

    private static adu[] aa(aoh aoh2) {
        int n2 = aoh2 != null ? aoh2.a() : 0;
        adu[] aduArray = new adu[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            aduArray[i2] = aoh2.b(i2);
        }
        return aduArray;
    }

    private final void ab(aeo aeo2, boolean bl2, boolean bl3) {
        int n2;
        int n3;
        Object object;
        Object object2;
        int n4;
        Object object3;
        if (bl2) {
            if (bl3) {
                this.B.a(1);
            }
            ajr ajr2 = this.A;
            aew aew2 = ajr2.b;
            object3 = ajr2.c;
            long l2 = ajr2.d;
            long l3 = ajr2.e;
            n4 = ajr2.f;
            ail ail2 = ajr2.g;
            boolean bl4 = ajr2.h;
            aob aob2 = ajr2.i;
            object2 = ajr2.u;
            object = ajr2.j;
            anc anc2 = ajr2.k;
            bl3 = ajr2.l;
            n3 = ajr2.m;
            n2 = ajr2.n;
            long l4 = ajr2.q;
            long l5 = ajr2.r;
            long l6 = ajr2.s;
            long l7 = ajr2.t;
            bl2 = ajr2.p;
            this.A = new ajr(aew2, (anc)object3, l2, l3, n4, ail2, bl4, aob2, (diz)object2, (List)object, anc2, bl3, n3, n2, aeo2, l4, l5, l6, l7);
        }
        float f2 = aeo2.b;
        object2 = this.w.d;
        while (true) {
            n4 = 0;
            if (object2 == null) break;
            object = (aoh[])((ajj)object2).l.e;
            n2 = ((Object[])object).length;
            for (n3 = n4; n3 < n2; ++n3) {
                object3 = object[n3];
            }
            object2 = ((ajj)object2).i;
        }
        object = this.a;
        n4 = ((ajw[])object).length;
        for (n3 = 0; n3 <= 0; ++n3) {
            object2 = object[n3];
            if (object2 == null) continue;
            object2.G(aeo2.b);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void ac(gui gui2) {
        synchronized (this) {
            boolean bl2;
            long l2 = SystemClock.elapsedRealtime();
            long l3 = 500L;
            boolean bl3 = false;
            while (!(bl2 = ((Boolean)gui2.a()).booleanValue()) && l3 > 0L) {
                try {
                    this.wait(l3);
                }
                catch (InterruptedException interruptedException) {
                    bl3 = true;
                }
                l3 = l2 + 500L - SystemClock.elapsedRealtime();
            }
            if (bl3) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
    }

    private final void ad(diz object) {
        Object object2 = this.A.b;
        object2 = this.j;
        Object object3 = ((aii)object2).e;
        object = ((diz)object).e;
        object3 = (aih)((HashMap)object3).get(this.x);
        abr.i(object3);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            ajw[] ajwArray = this.a;
            int n4 = ajwArray.length;
            if (n2 > 0) break;
            n4 = n3;
            if (((aoh[])object)[n2] != null) {
                ajwArray[n2].J();
                n4 = n3 + 0xC80000;
            }
            ++n2;
            n3 = n4;
        }
        ((aih)object3).b = Math.max(0xC80000, n3);
        ((aii)object2).d();
    }

    public static final void f(aju aju2) {
        aju2.c();
        try {
            aju2.a.m(aju2.c, aju2.d);
            return;
        }
        finally {
            aju2.a(true);
        }
    }

    private final long g(aew object, Object object2, long l2) {
        ((aew)object).o(((aew)object).n((Object)object2, (aeu)this.r).c, this.q);
        object = this.q;
        if (((aev)object).f != -9223372036854775807L && ((aev)object).b()) {
            object = this.q;
            if (((aev)object).i) {
                long l3 = ((aev)object).g;
                l3 = l3 == -9223372036854775807L ? System.currentTimeMillis() : (l3 += SystemClock.elapsedRealtime());
                return agf.i(l3 - this.q.f) - l2;
            }
        }
        return -9223372036854775807L;
    }

    private final long h() {
        return this.i(this.A.q);
    }

    private final long i(long l2) {
        ajj ajj2 = this.w.f;
        if (ajj2 == null) {
            return 0L;
        }
        return Math.max(0L, l2 - ajj2.d(this.M));
    }

    private final long j(anc anc2, long l2, boolean bl2) {
        ajl ajl2 = this.w;
        boolean bl3 = ajl2.d != ajl2.e;
        return this.k(anc2, l2, bl3, bl2);
    }

    private final long k(anc object, long l2, boolean bl2, boolean bl3) {
        ajj ajj2;
        this.N();
        this.R(false, true);
        if (bl3 || this.A.f == 3) {
            this.K(2);
        }
        ajj ajj3 = ajj2 = this.w.d;
        while (ajj3 != null && !((anc)object).equals(ajj3.g.a)) {
            ajj3 = ajj3.i;
        }
        if (bl2 || ajj2 != ajj3 || ajj3 != null && ajj3.e(l2) < 0L) {
            int n2 = 0;
            while (true) {
                int n3 = this.a.length;
                if (n2 > 0) break;
                this.o(n2);
                ++n2;
            }
            if (ajj3 != null) {
                while (true) {
                    object = this.w;
                    if (((ajl)object).d == ajj3) break;
                    ((ajl)object).a();
                }
                ((ajl)object).n(ajj3);
                ajj3.k = 1000000000000L;
                this.q();
            }
        }
        if (ajj3 != null) {
            long l3;
            this.w.n(ajj3);
            if (!ajj3.e) {
                ajj3.g = ajj3.g.b(l2);
                l3 = l2;
            } else {
                l3 = l2;
                if (ajj3.f) {
                    l3 = ajj3.a.g(l2);
                    ajj3.a.p(l3 - this.s);
                }
            }
            this.E(l3);
            this.w();
            l2 = l3;
        } else {
            this.w.f();
            this.E(l2);
        }
        this.t(false);
        this.d.d(2);
        return l2;
    }

    private final Pair l(aew aew2) {
        long l2;
        anc anc2;
        block2: {
            boolean bl2 = aew2.p();
            long l3 = 0L;
            if (bl2) {
                return Pair.create((Object)ajr.a, (Object)0L);
            }
            int n2 = aew2.g(this.I);
            Pair pair = aew2.k(this.q, this.r, n2, -9223372036854775807L);
            anc2 = this.w.e(aew2, pair.first, 0L);
            l2 = (Long)pair.second;
            if (!anc2.b()) break block2;
            aew2.n(anc2.a, this.r);
            l2 = l3;
            if (anc2.c == this.r.d(anc2.b)) {
                this.r.j();
                l2 = l3;
            }
        }
        return Pair.create((Object)anc2, (Object)l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Pair m(aew aew2, ajc ajc2, boolean bl2, int n2, boolean bl3, aev aev2, aeu aeu2) {
        Pair pair;
        aew aew3 = ajc2.a;
        if (aew2.p()) {
            return null;
        }
        if (aew3.p()) {
            aew3 = aew2;
        }
        try {
            pair = aew3.k(aev2, aeu2, ajc2.b, ajc2.c);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
        if (aew2.equals(aew3)) {
            return pair;
        }
        if (aew2.a(pair.first) != -1) {
            if (!aew3.n((Object)pair.first, (aeu)aeu2).f || aew3.o((int)aeu2.c, (aev)aev2).n != aew3.a(pair.first)) return pair;
            return aew2.k(aev2, aeu2, aew2.n((Object)pair.first, (aeu)aeu2).c, ajc2.c);
        }
        if ((n2 = ajd.a(aev2, aeu2, n2, bl3, pair.first, aew3, aew2)) != -1) {
            return aew2.k(aev2, aeu2, n2, -9223372036854775807L);
        }
        return null;
    }

    private final ajr n(anc anc2, long l2, long l3, long l4, boolean bl2, int n2) {
        boolean bl3 = this.O;
        boolean bl4 = false;
        bl3 = bl3 || l2 != this.A.s || !anc2.equals(this.A.c);
        this.O = bl3;
        this.D();
        Object object = this.A;
        aob aob2 = ((ajr)object).i;
        diz diz2 = ((ajr)object).u;
        Object object2 = ((ajr)object).j;
        if (this.f.h) {
            int n3;
            object = this.w.d;
            aob2 = object == null ? aob.a : ((ajj)object).j;
            diz2 = object == null ? this.k : ((ajj)object).l;
            Object object3 = diz2.e;
            object2 = new gzs();
            object3 = (aoh[])object3;
            int n4 = ((aoh[])object3).length;
            int n5 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                Object object4 = object3[n3];
                int n6 = n5;
                if (object4 != null) {
                    object4 = ((aoh)object4).b((int)0).l;
                    if (object4 == null) {
                        ((gzs)object2).h(new aek(new aej[0]));
                        n6 = n5;
                    } else {
                        ((gzs)object2).h(object4);
                        n6 = 1;
                    }
                }
                n5 = n6;
            }
            if (n5 != 0) {
                object2 = ((gzs)object2).g();
            } else {
                n5 = gzx.d;
                object2 = hct.a;
            }
            if (object != null) {
                object3 = ((ajj)object).g;
                if (((ajk)object3).c != l3) {
                    ((ajj)object).g = ((ajk)object3).a(l3);
                }
            }
            if ((object = this.w.d) != null) {
                object = ((ajj)object).l;
                n5 = 0;
                while (true) {
                    n3 = this.a.length;
                    if (n5 <= 0) {
                        if (((diz)object).b(n5)) {
                            this.a[n5].J();
                            n3 = ((ajy[])((diz)object).c)[n5].b;
                        }
                        ++n5;
                        continue;
                    }
                    break;
                }
            }
        } else if (!anc2.equals(((ajr)object).c)) {
            diz2 = this.k;
            aob2 = aob.a;
            int n7 = gzx.d;
            object2 = hct.a;
        }
        if (bl2) {
            object = this.B;
            if (((ajb)object).d && ((ajb)object).e != 5) {
                bl2 = bl4;
                if (n2 == 5) {
                    bl2 = true;
                }
                abr.d(bl2);
            } else {
                ((ajb)object).a = true;
                ((ajb)object).d = true;
                ((ajb)object).e = n2;
            }
        }
        return this.A.g(anc2, l2, l3, l4, this.h(), aob2, diz2, (List)object2);
    }

    private final void o(int n2) {
        ajw ajw2 = this.a[n2];
        if (!ajd.S(ajw2)) {
            return;
        }
        this.z(n2, false);
        aik aik2 = this.t;
        if (ajw2 == aik2.c) {
            aik2.d = null;
            aik2.c = null;
            aik2.e = true;
        }
        ajd.X(ajw2);
        ajw2.k();
        --this.K;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private final void p() {
        block85: {
            block87: {
                block86: {
                    block84: {
                        block78: {
                            block81: {
                                block76: {
                                    block80: {
                                        block79: {
                                            var19_1 = this.d;
                                            var15_2 = SystemClock.uptimeMillis();
                                            var19_1.a(2);
                                            if (this.A.b.p() || !this.f.h) break block78;
                                            this.w.i(this.M);
                                            var19_1 = this.w;
                                            var20_3 = var19_1.f;
                                            if (var20_3 == null || !var20_3.g.i && var20_3.k() && var19_1.f.g.e != -9223372036854775807L && var19_1.h < 100) {
                                                var20_3 = this.w;
                                                var9_4 = this.M;
                                                var19_1 = this.A;
                                                var21_5 = var20_3.f;
                                                var20_3 = var21_5 == null ? var20_3.c(var19_1.b, var19_1.c, var19_1.d, var19_1.s) : var20_3.b(var19_1.b, var21_5, var9_4);
                                                if (var20_3 != null) {
                                                    block75: {
                                                        var21_6 = this.w;
                                                        var19_1 = var21_6.f;
                                                        var9_4 = var19_1 == null ? 1000000000000L : var19_1.k + var19_1.g.e - var20_3.b;
                                                        for (var2_30 = 0; var2_30 < var21_6.j.size(); ++var2_30) {
                                                            var19_1 = ((ajj)var21_6.j.get((int)var2_30)).g;
                                                            if (!ajl.k(var19_1.e, var20_3.e) || var19_1.b != var20_3.b || !var19_1.a.equals(var20_3.a)) continue;
                                                            var19_1 = (ajj)var21_6.j.remove(var2_30);
                                                            break block75;
                                                        }
                                                        var19_1 = null;
                                                    }
                                                    if (var19_1 == null) {
                                                        var25_31 = (ajd)var21_6.l.a;
                                                        var11_32 = var25_31.h.b;
                                                        var22_33 = var25_31.b;
                                                        var24_34 = var25_31.c;
                                                        var23_35 = var25_31.f;
                                                        var19_1 = var25_31.k;
                                                        var19_1 = new ajj((ajx[])var22_33, var9_4, (aoz)var24_34, var25_31.j.a, (ajq)var23_35, (ajk)var20_3, (diz)var19_1);
                                                    } else {
                                                        var19_1.g = var20_3;
                                                        var19_1.k = var9_4;
                                                    }
                                                    var22_33 = var21_6.f;
                                                    if (var22_33 != null) {
                                                        var22_33.i((ajj)var19_1);
                                                    } else {
                                                        var21_6.d = var19_1;
                                                        var21_6.e = var19_1;
                                                    }
                                                    var21_6.i = null;
                                                    var21_6.f = var19_1;
                                                    ++var21_6.h;
                                                    var21_6.h();
                                                    if (!var19_1.d) {
                                                        var19_1.g(this, var20_3.b);
                                                    } else if (var19_1.e) {
                                                        this.d.f(8, var19_1.a).d();
                                                    }
                                                    if (this.w.d == var19_1) {
                                                        this.E(var20_3.b);
                                                    }
                                                    this.t(false);
                                                }
                                            }
                                            if (this.G) {
                                                this.G = ajd.Y(this.w.f);
                                                this.O();
                                            } else {
                                                this.w();
                                            }
                                            var19_1 = this.w.e;
                                            if (var19_1 == null) break block76;
                                            if (var19_1.i == null || this.D) break block79;
                                            if (!var19_1.e) break block76;
                                            break block80;
                                        }
                                        if (var19_1.g.i || this.D) {
                                            var2_30 = 0;
                                            while (true) {
                                                var20_3 = this.a;
                                                var3_36 = ((ajw[])var20_3).length;
                                                if (var2_30 <= 0) {
                                                    var20_3 = var20_3[var2_30];
                                                    var21_14 = var19_1.c[var2_30];
                                                    if (var21_14 != null && var20_3.i() == var21_14 && var20_3.A()) {
                                                        var9_4 = var19_1.g.e;
                                                        ajd.Z((ajw)var20_3);
                                                    }
                                                    ++var2_30;
                                                    continue;
                                                }
                                                break block76;
                                                break;
                                            }
                                        }
                                        break block76;
                                    }
                                    var2_30 = 0;
                                    while (true) {
                                        var20_3 = this.a;
                                        var3_36 = ((ajw[])var20_3).length;
                                        if (var2_30 > 0) break;
                                        var20_3 = var20_3[var2_30];
                                        var21_9 = var19_1.c[var2_30];
                                        if (var20_3.i() != var21_9) break block76;
                                        if (var21_9 != null && !var20_3.A()) {
                                            var7_37 = var19_1.g.f;
                                            break block76;
                                        }
                                        ++var2_30;
                                    }
                                    var20_3 = var19_1.i;
                                    if (var20_3.e || this.M >= var20_3.c()) {
                                        var21_10 = var19_1.l;
                                        var20_3 = this.w;
                                        var22_33 = var20_3.e;
                                        abr.j(var22_33);
                                        var20_3.e = var22_33.i;
                                        var20_3.h();
                                        var20_3 = var20_3.e;
                                        abr.j(var20_3);
                                        var22_33 = var20_3.l;
                                        var23_35 = this.A.b;
                                        var24_34 = var20_3.g.a;
                                        var19_1 = var19_1.g.a;
                                        this.Q((aew)var23_35, (anc)var24_34, (aew)var23_35, (anc)var19_1, -9223372036854775807L, false);
                                        if (var20_3.e && var20_3.a.f() != -9223372036854775807L) {
                                            var20_3.c();
                                            var19_1 = this.a;
                                            var2_30 = ((Object)var19_1).length;
                                            for (var2_30 = 0; var2_30 <= 0; ++var2_30) {
                                                var21_12 = var19_1[var2_30];
                                                if (var21_12.i() == null) continue;
                                                ajd.Z((ajw)var21_12);
                                            }
                                            if (!var20_3.k()) {
                                                this.w.n((ajj)var20_3);
                                                this.t(false);
                                                this.w();
                                            }
                                        } else {
                                            var2_30 = 0;
                                            while (true) {
                                                var3_36 = this.a.length;
                                                if (var2_30 > 0) break;
                                                var8_38 = var21_10.b(var2_30);
                                                var7_37 = var22_33.b(var2_30);
                                                if (var8_38 && !this.a[var2_30].B()) {
                                                    this.b[var2_30].J();
                                                    var23_35 = ((ajy[])var21_10.c)[var2_30];
                                                    var19_1 = ((ajy[])var22_33.c)[var2_30];
                                                    if (!var7_37 || !var19_1.equals(var23_35)) {
                                                        var19_1 = this.a[var2_30];
                                                        var20_3.c();
                                                        ajd.Z((ajw)var19_1);
                                                    }
                                                }
                                                ++var2_30;
                                            }
                                        }
                                    }
                                }
                                var20_3 = this.w;
                                var19_1 = var20_3.e;
                                if (var19_1 == null || var20_3.d == var19_1 || var19_1.h) break block81;
                                var20_3 = var19_1.l;
                                var2_30 = 0;
                                var3_36 = 0;
                                while (true) {
                                    block82: {
                                        block83: {
                                            var21_17 = this.a;
                                            var4_39 = var21_17.length;
                                            if (var2_30 > 0) break;
                                            var21_18 = var21_17[var2_30];
                                            var4_39 = var3_36;
                                            if (!ajd.S(var21_18)) break block82;
                                            var22_33 = var21_18.i();
                                            var23_35 = var19_1.c[var2_30];
                                            if (!var20_3.b(var2_30)) break block83;
                                            var4_39 = var3_36;
                                            if (var22_33 == var23_35) break block82;
                                        }
                                        if (!var21_18.B()) {
                                            var22_33 = ajd.aa(((aoh[])var20_3.e)[var2_30]);
                                            var24_34 = var19_1.c[var2_30];
                                            var9_4 = var19_1.c();
                                            var11_32 = var19_1.k;
                                            var23_35 = var19_1.g.a;
                                            var21_18.L((adu[])var22_33, (anv)var24_34, var9_4, var11_32);
                                            var4_39 = var3_36;
                                        } else if (var21_18.Q()) {
                                            this.o(var2_30);
                                            var4_39 = var3_36;
                                        } else {
                                            var4_39 = 1;
                                        }
                                    }
                                    ++var2_30;
                                    var3_36 = var4_39;
                                }
                                if (var3_36 == 0) {
                                    this.q();
                                }
                            }
                            var2_30 = 0;
                            while (this.V() && !this.D && (var19_1 = this.w.d) != null && (var19_1 = var19_1.i) != null && this.M >= var19_1.c() && var19_1.h) {
                                if (var2_30 != 0) {
                                    this.y();
                                }
                                var19_1 = this.w.a();
                                abr.i(var19_1);
                                if (!this.A.c.a.equals(var19_1.g.a.a)) ** GOTO lbl-1000
                                var20_3 = this.A.c;
                                if (var20_3.b != -1) ** GOTO lbl-1000
                                var21_21 = var19_1.g.a;
                                if (var21_21.b == -1 && var20_3.e != var21_21.e) {
                                    var2_30 = 1;
                                } else lbl-1000:
                                // 3 sources

                                {
                                    var2_30 = 0;
                                }
                                var20_3 = var19_1.g;
                                var19_1 = var20_3.a;
                                var9_4 = var20_3.b;
                                this.A = this.n((anc)var19_1, var9_4, var20_3.c, var9_4, (boolean)(var2_30 ^ 1), 0);
                                this.D();
                                this.P();
                                if (this.A.f == 3) {
                                    this.L();
                                }
                                var19_1 = this.w.d.l;
                                var2_30 = 0;
                                while (true) {
                                    var3_36 = this.a.length;
                                    if (var2_30 > 0) break;
                                    if (var19_1.b(var2_30)) {
                                        this.a[var2_30].l();
                                    }
                                    ++var2_30;
                                }
                                var2_30 = 1;
                            }
                            var9_4 = this.h.b;
                        }
                        if ((var2_30 = this.A.f) == 1) return;
                        if (var2_30 == 4) {
                            return;
                        }
                        var20_3 = this.w.d;
                        if (var20_3 == null) {
                            this.G(var15_2);
                            return;
                        }
                        Trace.beginSection((String)"doSomeWork");
                        this.P();
                        if (!var20_3.e) {
                            var20_3.a.i();
                            var5_40 = 1;
                            var6_41 = 1;
                        } else {
                            SystemClock.elapsedRealtime();
                            var2_30 = agf.a;
                            var20_3.a.p(this.A.s - this.s);
                            var2_30 = 1;
                            var3_36 = 1;
                            var4_39 = 0;
                            while (true) {
                                var19_1 = this.a;
                                var5_40 = ((ajw[])var19_1).length;
                                var5_40 = var2_30;
                                var6_41 = var3_36;
                                if (var4_39 > 0) break;
                                if (!ajd.S((ajw)(var19_1 = var19_1[var4_39]))) {
                                    this.z(var4_39, false);
                                    var5_40 = var2_30;
                                    var6_41 = var3_36;
                                } else {
                                    var19_1.S(this.M);
                                    var3_36 = var3_36 != 0 && var19_1.Q() != false ? 1 : 0;
                                    var5_40 = var20_3.c[var4_39] != var19_1.i() ? 1 : 0;
                                    var6_41 = var5_40 == 0 && var19_1.A() != false ? 1 : 0;
                                    var7_37 = var5_40 != 0 || var6_41 != 0 || var19_1.R() || var19_1.Q();
                                    this.z(var4_39, var7_37);
                                    var2_30 = var2_30 != 0 && var7_37 != false ? 1 : 0;
                                    var5_40 = var2_30;
                                    var6_41 = var3_36;
                                    if (!var7_37) {
                                        var19_1.o();
                                        var6_41 = var3_36;
                                        var5_40 = var2_30;
                                    }
                                }
                                ++var4_39;
                                var2_30 = var5_40;
                                var3_36 = var6_41;
                            }
                        }
                        var9_4 = var20_3.g.e;
                        if (var6_41 == 0 || !var20_3.e || var9_4 != -9223372036854775807L && var9_4 > this.A.s) break block84;
                        if (this.D) {
                            this.D = false;
                            this.J(false, this.A.n, false, 5);
                        }
                        if (!var20_3.g.i) break block84;
                        this.K(4);
                        this.N();
                        break block85;
                    }
                    var21_22 = this.A;
                    if (var21_22.f != 2) ** GOTO lbl-1000
                    if (this.K != 0) break block86;
                    var7_37 = this.T();
                    break block87;
                }
                if (var5_40 == 0) ** GOTO lbl-1000
                if (var21_22.h) {
                    var19_1 = this.w.d;
                    var9_4 = this.W(var21_22.b, var19_1.g.a) != false ? this.R.g : -9223372036854775807L;
                    var21_23 = this.w.f;
                    var2_30 = var21_23.k() != false && var21_23.g.i != false ? 1 : 0;
                    var3_36 = var21_23.g.a.b() != false && var21_23.e == false ? 1 : 0;
                    if (var2_30 == 0 && var3_36 == 0) {
                        var11_32 = this.i(var21_23.a());
                        var21_24 = this.j;
                        var22_33 = this.x;
                        var23_35 = this.A.b;
                        var23_35 = var19_1.g.a;
                        var19_1.d(this.M);
                        var1_42 = this.t.b().b;
                        var7_37 = this.A.l;
                        var19_1 = new ajf((akr)var22_33, var11_32, var1_42, this.E, var9_4);
                        var11_32 = var19_1.b;
                        var1_42 = var19_1.c;
                        var2_30 = agf.a;
                        if (var1_42 != 1.0f) {
                            var11_32 = Math.round((double)var11_32 / (double)var1_42);
                        }
                        var9_4 = var19_1.d != false ? var21_24.c : var21_24.b;
                        var17_43 = var19_1.e;
                        var13_44 = var9_4;
                        if (var17_43 != -9223372036854775807L) {
                            var13_44 = Math.min(var17_43 / 2L, var9_4);
                        }
                        var7_37 = var13_44 <= 0L || var11_32 >= var13_44 || var21_24.a.a() >= var21_24.a();
                    }
                }
                ** GOTO lbl-1000
            }
            if (var7_37) lbl-1000:
            // 2 sources

            {
                this.K(3);
                this.P = null;
                if (this.V()) {
                    this.R(false, false);
                    this.t.d();
                    this.L();
                }
            } else if (this.A.f == 3 && (this.K == 0 ? this.T() == false : var5_40 == 0)) {
                this.R(this.V(), false);
                this.K(2);
                if (this.E) {
                    var19_1 = this.w.d;
                    while (var19_1 != null) {
                        for (ajx var21_28 : (aoh[])var19_1.l.e) {
                        }
                        var19_1 = var19_1.i;
                    }
                    var19_1 = this.R;
                    var9_4 = var19_1.g;
                    if (var9_4 != -9223372036854775807L) {
                        var19_1.g = var11_32 = var9_4 + var19_1.b;
                        var9_4 = var19_1.f;
                        if (var9_4 != -9223372036854775807L && var11_32 > var9_4) {
                            var19_1.g = var9_4;
                        }
                        var19_1.k = -9223372036854775807L;
                    }
                }
                this.N();
            }
        }
        if (this.A.f != 2) ** GOTO lbl-1000
        var2_30 = 0;
        while (true) {
            var19_1 = this.a;
            var3_36 = ((ajw[])var19_1).length;
            if (var2_30 > 0) break;
            if (ajd.S((ajw)var19_1[var2_30]) && this.a[var2_30].i() == var20_3.c[var2_30]) {
                this.a[var2_30].o();
            }
            ++var2_30;
        }
        var19_1 = this.A;
        if (!var19_1.h && var19_1.r < 500000L && ajd.Y(this.w.f)) {
            if (this.Q == -9223372036854775807L) {
                this.Q = SystemClock.elapsedRealtime();
            } else if (SystemClock.elapsedRealtime() - this.Q >= 4000L) throw new IllegalStateException("Playback stuck buffering and not loading");
        } else lbl-1000:
        // 2 sources

        {
            this.Q = -9223372036854775807L;
        }
        var2_30 = this.V() != false && this.A.f == 3 ? 1 : 0;
        var19_1 = this.A;
        var7_37 = var19_1.p;
        var3_36 = var19_1.f;
        if (var3_36 != 4 && (var2_30 != 0 || var3_36 == 2 || var3_36 == 3 && this.K != 0)) {
            this.G(var15_2);
        }
        Trace.endSection();
    }

    private final void q() {
        int n2 = this.a.length;
        this.r(new boolean[1], this.w.e.c());
    }

    private final void r(boolean[] blArray, long l2) {
        int n2;
        ajj ajj2 = this.w.e;
        diz diz2 = ajj2.l;
        int n3 = 0;
        while (true) {
            n2 = this.a.length;
            if (n3 > 0) break;
            if (!diz2.b(n3) && this.m.remove(this.a[n3])) {
                this.a[n3].u();
            }
            ++n3;
        }
        n3 = 0;
        while (true) {
            n2 = this.a.length;
            if (n3 > 0) break;
            if (diz2.b(n3)) {
                boolean bl2 = blArray[n3];
                ajw ajw2 = this.a[n3];
                if (!ajd.S(ajw2)) {
                    Object object = this.w;
                    ajj ajj3 = ((ajl)object).e;
                    object = ((ajl)object).d;
                    Object object2 = ajj3.l;
                    Object object3 = ((ajy[])((diz)object2).c)[n3];
                    adu[] aduArray = ajd.aa(((aoh[])((diz)object2).e)[n3]);
                    n2 = this.V() && this.A.f == 3 ? 1 : 0;
                    ++this.K;
                    this.m.add(ajw2);
                    object2 = ajj3.c[n3];
                    long l3 = ajj3.k;
                    Object object4 = ajj3.g.a;
                    ajw2.M((ajy)object3, aduArray, (anv)object2, l2, l3);
                    ajw2.m(11, new vy(null));
                    object2 = this.t;
                    object4 = ajw2.f();
                    if (object4 != null && object4 != (object3 = ((aik)object2).d)) {
                        if (object3 == null) {
                            ((aik)object2).d = object4;
                            ((aik)object2).c = ajw2;
                            ((aik)object2).d.c(((aik)object2).a.a);
                        } else {
                            throw new ail(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (n2 != 0 && ajj3 == object) {
                        ajw2.y();
                    }
                }
            }
            ++n3;
        }
        ajj2.h = true;
    }

    private final void s(IOException exception, int n2) {
        ail ail2 = new ail(0, exception, n2);
        ajj ajj2 = this.w.d;
        exception = ail2;
        if (ajj2 != null) {
            exception = ail2.a(ajj2.g.a);
        }
        afx.c("ExoPlayerImplInternal", "Playback error", exception);
        this.M(false, false);
        this.A = this.A.c((ail)exception);
    }

    private final void t(boolean bl2) {
        ajj ajj2 = this.w.f;
        Object object = ajj2 == null ? this.A.c : ajj2.g.a;
        boolean bl3 = this.A.k.equals(object);
        if (!bl3) {
            this.A = this.A.a((anc)object);
        }
        object = this.A;
        long l2 = ajj2 == null ? ((ajr)object).s : ajj2.a();
        ((ajr)object).q = l2;
        this.A.r = this.h();
        if ((!bl3 || bl2) && ajj2 != null && ajj2.e) {
            object = ajj2.g.a;
            this.ad(ajj2.l);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void u(aew var1_1, boolean var2_2) {
        block70: {
            block69: {
                block81: {
                    block78: {
                        block67: {
                            block80: {
                                block79: {
                                    block77: {
                                        var27_3 = this.A;
                                        var29_4 = this.L;
                                        var3_5 = this.H;
                                        var7_6 = this.I;
                                        if (!var1_1.p()) break block77;
                                        var24_7 = ajr.a;
                                        var15_8 = -9223372036854775807L;
                                        var3_5 = 0;
                                        var7_6 = false;
                                        var5_9 = 1;
                                        var9_10 = 0L;
                                        break block78;
                                    }
                                    var26_11 = this.r;
                                    var24_7 = var27_3.c;
                                    var23_12 = var24_7.a;
                                    var8_26 = ajd.U((ajr)var27_3, (aeu)var26_11);
                                    var9_10 = !var27_3.c.b() && !var8_26 ? var27_3.s : var27_3.d;
                                    var25_27 = this.q;
                                    if (var29_4 == null) break block79;
                                    var28_28 = ajd.m(var1_1, var29_4, true, var3_5, var7_6, (aev)var25_27, (aeu)var26_11);
                                    if (var28_28 == null) {
                                        var4_29 = var1_1.g(var7_6);
                                        var11_30 = var9_10;
                                        var3_5 = 0;
                                        var7_6 = false;
                                        var5_9 = 1;
                                    } else {
                                        if (var29_4.c == -9223372036854775807L) {
                                            var4_29 = var1_1.n((Object)var28_28.first, (aeu)var26_11).c;
                                            var11_30 = var9_10;
                                            var3_5 = 0;
                                        } else {
                                            var23_12 = var28_28.first;
                                            var11_30 = (Long)var28_28.second;
                                            var3_5 = 1;
                                            var4_29 = -1;
                                        }
                                        var7_6 = var27_3.f == 4;
                                        var5_9 = 0;
                                    }
                                    var6_31 = var5_9;
                                    var5_9 = var4_29;
                                    var4_29 = var3_5;
                                    var3_5 = var6_31;
                                    break block67;
                                }
                                if (var27_3.b.p()) {
                                    var3_5 = var1_1.g(var7_6);
                                    var4_29 = 0;
lbl49:
                                    // 3 sources

                                    while (true) {
                                        var7_6 = false;
                                        var11_30 = var9_10;
                                        var6_31 = 0;
                                        var5_9 = var3_5;
                                        var3_5 = var4_29;
                                        var4_29 = var6_31;
                                        break block67;
                                        break;
                                    }
                                }
                                if (var1_1.a(var23_12) != -1) break block80;
                                var4_29 = ajd.a((aev)var25_27, (aeu)var26_11, var3_5, var7_6, var23_12, var27_3.b, var1_1);
                                if (var4_29 == -1) {
                                    var4_29 = var1_1.g(var7_6);
                                    var3_5 = 1;
                                } else {
                                    var3_5 = 0;
                                }
                                var5_9 = var4_29;
                                var4_29 = var3_5;
                                var3_5 = var5_9;
                                ** GOTO lbl49
                            }
                            if (var9_10 == -9223372036854775807L) {
                                var3_5 = var1_1.n((Object)var23_12, (aeu)var26_11).c;
lbl71:
                                // 2 sources

                                while (true) {
                                    var4_29 = 0;
                                    ** continue;
                                    break;
                                }
                            }
                            if (var8_26) {
                                var27_3.b.n(var24_7.a, (aeu)var26_11);
                                var28_28 = var27_3.b;
                                var3_5 = var26_11.c;
                                if (var28_28.o((int)var3_5, (aev)var25_27).n == var27_3.b.a(var24_7.a)) {
                                    var28_28 = var1_1.k((aev)var25_27, (aeu)var26_11, var1_1.n((Object)var23_12, (aeu)var26_11).c, var9_10);
                                    var23_12 = var28_28.first;
                                    var11_30 = (Long)var28_28.second;
                                } else {
                                    var11_30 = var9_10;
                                }
                                var5_9 = -1;
                                var7_6 = false;
                                var3_5 = 0;
                                var4_29 = 1;
                            } else {
                                var3_5 = -1;
                                ** continue;
                            }
                        }
                        if (var5_9 != -1) {
                            var25_27 = var1_1.k((aev)var25_27, (aeu)var26_11, var5_9, -9223372036854775807L);
                            var23_12 = var25_27.first;
                            var11_30 = (Long)var25_27.second;
                            var13_32 = -9223372036854775807L;
                        } else {
                            var13_32 = var11_30;
                        }
                        var25_27 = this.w.e(var1_1, var23_12, var11_30);
                        var5_9 = var25_27.e;
                        var5_9 = var5_9 != -1 && ((var6_31 = var24_7.e) == -1 || var5_9 < var6_31) ? 0 : 1;
                        var5_9 = var24_7.a.equals(var23_12) != false && var24_7.b() == false && var25_27.b() == false && var5_9 != 0 ? 1 : 0;
                        var23_12 = var1_1.n(var23_12, (aeu)var26_11);
                        if (!var8_26 && var9_10 == var13_32 && var24_7.a.equals(var25_27.a)) {
                            if (var24_7.b()) {
                                var23_12.k(var24_7.b);
                            }
                            if (var25_27.b()) {
                                var23_12.k(var25_27.b);
                            }
                        }
                        var23_12 = 1 != var5_9 ? var25_27 : var24_7;
                        var9_10 = var11_30;
                        if (var23_12.b()) {
                            if (var23_12.equals(var24_7)) {
                                var9_10 = var27_3.s;
                            } else {
                                var1_1.n(var23_12.a, (aeu)var26_11);
                                if (var23_12.c == var26_11.d(var23_12.b)) {
                                    var26_11.j();
                                }
                                var9_10 = 0L;
                            }
                        }
                        var15_8 = var13_32;
                        var24_7 = var23_12;
                        var5_9 = var3_5;
                        var3_5 = var4_29;
                    }
                    var4_29 = this.A.c.equals(var24_7) && var9_10 == this.A.s ? 0 : 1;
                    if (var5_9 == 0) ** GOTO lbl142
                    var5_9 = this.A.f;
                    if (var5_9 != 1) {
                    }
                    ** GOTO lbl140
                    {
                        catch (Throwable var23_14) {
                            ** GOTO lbl210
                        }
                        try {
                            this.K(4);
                        }
                        catch (Throwable var23_13) {
                            ** GOTO lbl210
                        }
lbl140:
                        // 2 sources

                        ** try [egrp 2[TRYBLOCK] [2 : 946->992)] { 
lbl141:
                        // 1 sources

                        this.C(false, false, false, true);
lbl142:
                        // 2 sources

                        var23_12 = this.a;
                        var5_9 = ((ajw[])var23_12).length;
                        for (var5_9 = 0; var5_9 <= 0; ++var5_9) {
                            var23_12[var5_9].x(var1_1);
                        }
                        if (var4_29 == 0) {
                        }
                        ** GOTO lbl191
                    }
lbl150:
                    // 1 sources

                    catch (Throwable var23_25) {
                        // empty catch block
                        ** GOTO lbl210
                    }
                    var27_3 = this.w;
                    var17_33 = this.M;
                    var23_12 = var27_3.e;
                    if (var23_12 != null) break block81;
                    var11_30 = 0L;
                    ** GOTO lbl239
                }
                var13_32 = var23_12.k;
                var7_6 = var23_12.e;
                var11_30 = var13_32;
                if (!var7_6) ** GOTO lbl239
                var11_30 = var13_32;
                var5_9 = 0;
                while (true) {
                    block82: {
                        block83: {
                            var13_32 = var9_10;
                            var25_27 = this.a;
                            var13_32 = var9_10;
                            var6_31 = ((ajw[])var25_27).length;
                            if (var5_9 > 0) ** GOTO lbl239
                            var13_32 = var9_10;
                            if (!ajd.S((ajw)var25_27[var5_9])) break block82;
                            var13_32 = var9_10;
                            if (this.a[var5_9].i() != var23_12.c[var5_9]) break block82;
                            var13_32 = var9_10;
                            var19_34 = this.a[var5_9].aE();
                            if (var19_34 != -9223372036854775808L) break block83;
                            var11_30 = -9223372036854775808L;
                            ** GOTO lbl239
                        }
                        var13_32 = var9_10;
                        var11_30 = Math.max(var19_34, var11_30);
                    }
                    ++var5_9;
                    continue;
                    break;
                }
                {
                    block72: {
                        block74: {
                            block75: {
                                block76: {
                                    block73: {
                                        block71: {
                                            block68: {
                                                catch (Throwable var23_22) {
                                                    break block68;
                                                }
lbl191:
                                                // 1 sources

                                                var11_30 = var9_10;
                                                var13_32 = var9_10;
                                                if (var1_1.p()) break block69;
                                                var13_32 = var9_10;
                                                var23_12 = this.w.d;
                                                while (var23_12 != null) {
                                                    var13_32 = var9_10;
                                                    if (var23_12.g.a.equals(var24_7)) {
                                                        var13_32 = var9_10;
                                                        var23_12.g = this.w.d(var1_1, var23_12.g);
                                                        var13_32 = var9_10;
                                                        var23_12.j();
                                                    }
                                                    var13_32 = var9_10;
                                                    var23_12 = var23_12.i;
                                                }
                                                try {
                                                    var9_10 = var11_30 = this.j((anc)var24_7, var9_10, var7_6);
                                                    break block70;
                                                }
                                                catch (Throwable var23_23) {}
                                            }
lbl211:
                                            // 8 sources

                                            while (true) {
                                                var11_30 = -9223372036854775807L;
                                                var26_11 = this.A;
                                                var25_27 = var26_11.b;
                                                var26_11 = var26_11.c;
                                                var7_6 = true;
                                                if (1 == var3_5) {
                                                    var11_30 = var9_10;
                                                }
                                                this.Q(var1_1, (anc)var24_7, (aew)var25_27, (anc)var26_11, var11_30, false);
                                                if (var4_29 != 0 || var15_8 != this.A.d) {
                                                    var26_11 = this.A;
                                                    var25_27 = var26_11.c.a;
                                                    var26_11 = var26_11.b;
                                                    var2_2 = var4_29 != 0 && var2_2 != false && var26_11.p() == false && var26_11.n((Object)var25_27, (aeu)this.r).f == false ? var7_6 : false;
                                                    var11_30 = this.A.e;
                                                    var3_5 = var1_1.a(var25_27) == -1 ? 4 : 3;
                                                    this.A = this.n((anc)var24_7, var9_10, var15_8, var11_30, var2_2, var3_5);
                                                }
                                                this.D();
                                                this.F(var1_1, this.A.b);
                                                this.A = this.A.e(var1_1);
                                                if (!var1_1.p()) {
                                                    this.L = null;
                                                }
                                                this.t(false);
                                                this.d.d(2);
                                                throw var23_18;
                                            }
                                            catch (Throwable var23_15) {
                                                var9_10 = var13_32;
                                                ** GOTO lbl211
                                            }
lbl239:
                                            // 4 sources

                                            var13_32 = var9_10;
                                            try {
                                                var23_12 = var27_3.d;
                                                var25_27 = null;
lbl243:
                                                // 2 sources

                                                while (var23_12 != null) {
                                                    var13_32 = var9_10;
                                                    var28_28 = var23_12.g;
                                                    if (var25_27 != null) break block71;
                                                    var13_32 = var9_10;
                                                    ** GOTO lbl-1000
                                                }
                                                break block72;
                                            }
                                            catch (Throwable var23_21) {
                                                var9_10 = var13_32;
                                                ** GOTO lbl211
                                            }
lbl-1000:
                                            // 1 sources

                                            {
                                                var25_27 = var27_3.d(var1_1, (ajk)var28_28);
                                                ** GOTO lbl277
                                            }
                                        }
                                        var13_32 = var9_10;
                                        {
                                            var26_11 = var27_3.b(var1_1, (ajj)var25_27, var17_33);
                                            if (var26_11 != null) break block73;
                                            var13_32 = var9_10;
                                        }
                                        {
                                            var7_6 = var27_3.n((ajj)var25_27);
                                            if (var7_6) break block74;
                                            break block70;
                                        }
                                    }
                                    var13_32 = var9_10;
                                    {
                                        var19_34 = var28_28.b;
                                        var13_32 = var9_10;
                                    }
                                    try {
                                        var21_35 = var26_11.b;
                                        if (var19_34 != var21_35) break block75;
                                    }
                                    catch (Throwable var23_20) {
                                        var9_10 = var13_32;
                                        ** GOTO lbl211
                                    }
                                    try {
                                        if (!var28_28.a.equals(var26_11.a)) break block75;
                                        var25_27 = var26_11;
lbl277:
                                        // 2 sources

                                        var23_12.g = var25_27.a(var28_28.c);
                                        if (ajl.k(var28_28.e, var25_27.e)) ** GOTO lbl297
                                        var23_12.j();
                                        var13_32 = var25_27.e;
                                        if (var13_32 != -9223372036854775807L) break block76;
                                        var13_32 = 0x7FFFFFFFFFFFFFFFL;
                                        ** GOTO lbl289
                                    }
                                    catch (Throwable var23_17) {
                                        ** GOTO lbl211
                                    }
                                }
                                try {
                                    var13_32 = var23_12.e(var13_32);
lbl289:
                                    // 2 sources

                                    if (var23_12 != var27_3.e) ** GOTO lbl-1000
                                    var7_6 = var23_12.g.f;
                                    if (var11_30 == -9223372036854775808L || var11_30 >= var13_32) {
                                        var5_9 = 1;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var5_9 = 0;
                                    }
                                    if (var27_3.n((ajj)var23_12) || var5_9 != 0) break block74;
                                    break block70;
lbl297:
                                    // 1 sources

                                    var26_11 = var23_12.i;
                                    var25_27 = var23_12;
                                    var23_12 = var26_11;
                                    ** GOTO lbl243
                                }
                                catch (Throwable var23_16) {
                                    ** GOTO lbl211
                                }
                            }
                            try {
                                var7_6 = var27_3.n((ajj)var25_27);
                                if (var7_6) break block74;
                                break block70;
                            }
                            catch (Throwable var23_19) {
                                var9_10 = var13_32;
                                ** GOTO lbl211
                            }
                        }
                        var13_32 = var9_10;
                        ** try [egrp 14[TRYBLOCK] [27 : 1530->1679)] { 
lbl314:
                        // 1 sources

                        this.H(false);
                        var11_30 = var9_10;
                        break block69;
                    }
                    var11_30 = var9_10;
                }
lbl320:
                // 1 sources

                catch (Throwable var23_24) {
                    var9_10 = var13_32;
                    ** continue;
                }
            }
            var9_10 = var11_30;
        }
        var25_27 = this.A;
        var23_12 = var25_27.b;
        var25_27 = var25_27.c;
        var11_30 = 1 != var3_5 ? -9223372036854775807L : var9_10;
        var3_5 = 4;
        this.Q(var1_1, (anc)var24_7, (aew)var23_12, (anc)var25_27, var11_30, false);
        if (var4_29 != 0 || var15_8 != this.A.d) {
            var25_27 = this.A;
            var23_12 = var25_27.c.a;
            var25_27 = var25_27.b;
            var2_2 = var4_29 != 0 && var2_2 != false && var25_27.p() == false && var25_27.n((Object)var23_12, (aeu)this.r).f == false;
            var11_30 = this.A.e;
            if (var1_1.a(var23_12) != -1) {
                var3_5 = 3;
            }
            this.A = this.n((anc)var24_7, var9_10, var15_8, var11_30, var2_2, var3_5);
        }
        this.D();
        this.F(var1_1, this.A.b);
        this.A = this.A.e(var1_1);
        if (!var1_1.p()) {
            this.L = null;
        }
        this.t(false);
        this.d.d(2);
    }

    private final void v(aeo aeo2, boolean bl2) {
        float f2 = aeo2.b;
        this.ab(aeo2, true, bl2);
    }

    private final void w() {
        boolean bl2;
        if (!ajd.Y(this.w.f)) {
            bl2 = false;
        } else {
            long l2;
            Object object = this.w.f;
            long l3 = this.i(((ajj)object).b());
            if (object == this.w.d) {
                ((ajj)object).d(this.M);
            } else {
                ((ajj)object).d(this.M);
                l2 = ((ajj)object).g.b;
            }
            l2 = this.W(this.A.b, ((ajj)object).g.a) ? this.R.g : -9223372036854775807L;
            Object object2 = this.x;
            aew aew2 = this.A.b;
            object = ((ajj)object).g.a;
            float f2 = this.t.b().b;
            bl2 = this.A.l;
            object = new ajf((akr)object2, l3, f2, this.E, l2);
            boolean bl3 = this.j.e((ajf)object);
            object2 = this.w.d;
            bl2 = bl3;
            if (!bl3) {
                bl2 = bl3;
                if (((ajj)object2).e) {
                    bl2 = bl3;
                    if (l3 < 500000L) {
                        bl2 = bl3;
                        if (this.s > 0L) {
                            ((ajj)object2).a.p(this.A.s);
                            bl2 = this.j.e((ajf)object);
                        }
                    }
                }
            }
        }
        this.G = bl2;
        if (bl2) {
            this.w.f.f(this.M, this.t.b().b, this.F);
        }
        this.O();
    }

    private final void x() {
        block4: {
            Object object;
            this.w.g();
            ajj ajj2 = this.w.g;
            if (!(ajj2 == null || ajj2.d && !ajj2.e || (object = ajj2.a).m())) {
                aii aii2 = this.j;
                Object object2 = this.A.b;
                object2 = ajj2.g.a;
                if (ajj2.e) {
                    object.d();
                }
                object = aii2.e.values().iterator();
                while (object.hasNext()) {
                    if (!((aih)object.next()).a) continue;
                    break block4;
                }
                if (!ajj2.d) {
                    ajj2.g(this, ajj2.g.b);
                    return;
                }
                ajj2.f(this.M, this.A.o.b, this.F);
            }
        }
    }

    private final void y() {
        ajb ajb2 = this.B;
        Object object = this.A;
        boolean bl2 = ajb2.a;
        boolean bl3 = ajb2.b != object;
        ajb2.a = bl2 |= bl3;
        ajb2.b = object;
        if (bl2) {
            object = this.S.a;
            ((aiy)object).e.c(new aks(object, ajb2, 1));
            this.B = new ajb(this.A);
        }
    }

    private final void z(int n2, boolean bl2) {
        boolean[] blArray = this.n;
        if (blArray[n2] != bl2) {
            blArray[n2] = bl2;
            this.y.c(new cdw((Object)this, n2, 1, null));
        }
    }

    @Override
    public final void c(anb anb2) {
        this.d.f(8, anb2).d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(aju aju2) {
        synchronized (this) {
            if (!this.g && this.e.getThread().isAlive()) {
                this.d.f(14, aju2).d();
                return;
            }
            afx.e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            aju2.a(false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e() {
        synchronized (this) {
            if (this.g) return true;
            if (!this.e.getThread().isAlive()) return true;
            this.d.d(7);
            aim aim2 = new aim(this, 6);
            this.ac(aim2);
            return this.g;
        }
    }

    /*
     * Exception decompiling
     */
    public final boolean handleMessage(Message var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 23[TRYBLOCK] [302 : 1495->1497)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

