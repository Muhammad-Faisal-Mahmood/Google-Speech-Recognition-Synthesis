/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 *  android.media.metrics.MediaMetricsManager
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.Surface
 */
import android.content.Context;
import android.media.AudioManager;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

public final class aiy
extends adk
implements aiq {
    public static final int w = 0;
    private final CopyOnWriteArraySet A;
    private final aeu B;
    private final boolean C;
    private final Looper D;
    private final afl E;
    private final aiv F;
    private final aiw G;
    private final long H;
    private aka I;
    private aip J;
    private aei K;
    private Object L;
    private int M;
    private agb N;
    private int O;
    private adi P;
    private boolean Q;
    private boolean R;
    private int S;
    private aei T;
    private bmu U;
    private final AmbientMode$AmbientController V;
    final aep b;
    public final aes c;
    public final aoz d;
    public final afp e;
    public final ajd f;
    public final afu g;
    public final List h;
    public final apa i;
    public int j;
    public int k;
    public boolean l;
    public aep m;
    public Surface n;
    public ajr o;
    public int p;
    public final akl q;
    public final gzy r;
    final diz s;
    public final vy t;
    public final vy u;
    public final wa v;
    private final afn x = new afn();
    private final Context y;
    private final ajw[] z;

    static {
        aeg.b("media3.exoplayer");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public aiy(aio var1_1) {
        super();
        var6_3 = Integer.toHexString(System.identityHashCode(this));
        var4_4 = agf.e;
        var5_5 = new StringBuilder("Init ");
        var5_5.append((String)var6_3);
        var5_5.append(" [AndroidXMedia3/1.5.0-alpha01] [");
        var5_5.append((String)var4_4);
        var5_5.append("]");
        afx.d("ExoPlayerImpl", var5_5.toString());
        this.y = var1_1.a.getApplicationContext();
        this.q = (akl)var1_1.h.apply(var1_1.b);
        this.S = -1000;
        this.P = var1_1.j;
        this.M = 1;
        this.H = 2000L;
        this.F = var4_4 = new aiv(this);
        this.G = var5_5 = new aiw();
        var5_5 = new Handler(var1_1.i);
        var4_4 = ((aim)var1_1.c).a.a((Handler)var5_5, (aiv)var4_4);
        this.z = var4_4;
        var2_6 = ((ajw[])var4_4).length;
        abr.f(true);
        this.d = (aoz)var1_1.e.a();
        var1_1.d.a();
        this.i = var1_1.g.a();
        this.C = true;
        this.I = var1_1.k;
        var6_3 = var1_1.i;
        this.D = var6_3;
        this.E = var9_7 = var1_1.b;
        this.c = this;
        var7_9 = new akg(1);
        var8_8 = new afu((Looper)var6_3, var9_7, (afs)var7_9);
        this.g = var8_8;
        var6_3 = new CopyOnWriteArraySet();
        this.A = var6_3;
        super();
        this.h = var6_3;
        this.U = var6_3 = new bmu();
        this.J = aip.a;
        var2_6 = ((ajw[])var4_4).length;
        this.s = var6_3 = new diz(new ajy[1], new aoh[1], afd.a, null);
        super();
        this.B = var4_4;
        super();
        for (var2_6 = 0; var2_6 < 20; ++var2_6) {
            var4_4.b((new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32})[var2_6]);
        }
        aay.f(29, true, (adr)var4_4);
        aay.f(23, false, (adr)var4_4);
        aay.f(25, false, (adr)var4_4);
        aay.f(33, false, (adr)var4_4);
        aay.f(26, false, (adr)var4_4);
        aay.f(34, false, (adr)var4_4);
        this.b = var6_3 = aay.d((adr)var4_4);
        super();
        aay.e((aep)var6_3, (adr)var4_4);
        var4_4.b(4);
        var4_4.b(10);
        this.m = aay.d((adr)var4_4);
        this.e = this.E.b(this.D, null);
        this.V = var6_3 = new AmbientMode$AmbientController(this, null);
        this.o = ajr.h(this.s);
        var7_9 = this.q;
        var10_10 = this.c;
        var9_7 = this.D;
        var3_11 = var7_9.e == null || var7_9.b.b.isEmpty();
        abr.f(var3_11);
        abr.i(var10_10);
        var7_9.e = var10_10;
        var7_9.f = var7_9.a.b((Looper)var9_7, null);
        var4_4 = var7_9.d;
        var8_8 = new akf((akl)var7_9, (aes)var10_10);
        var11_12 = var4_4.a;
        var12_13 = var4_4.d;
        var7_9.d = var10_10 = new afu(var12_13, (Looper)var9_7, var11_12, (afs)var8_8, var4_4.e);
        if (agf.a < 31) {
            var4_4 = new akr();
        } else {
            var4_4 = this.y;
            var7_9 = ut$$ExternalSyntheticApiModelOutline0.m(var4_4.getSystemService("media_metrics"));
            var4_4 = var7_9 == null ? null : new ako((Context)var4_4, ut$$ExternalSyntheticApiModelOutline0.m((MediaMetricsManager)var7_9));
            if (var4_4 == null) {
                afx.e("ExoPlayerImpl", "MediaMetricsService unavailable.");
                var4_4 = new akr(ut$$ExternalSyntheticApiModelOutline0.m());
            } else {
                this.q.d.a(var4_4);
                var4_4 = new akr(ut$$ExternalSyntheticApiModelOutline0.m(var4_4.c));
            }
        }
        this.f = var7_9 = new ajd(this.z, this.d, this.s, (aii)var1_1.f.a(), this.i, this.q, this.I, var1_1.m, this.D, this.E, (AmbientMode$AmbientController)var6_3, (akr)var4_4, this.J);
        this.K = aei.a;
        this.T = aei.a;
        this.p = -1;
        var4_4 = (AudioManager)this.y.getSystemService("audio");
        var2_6 = var4_4 == null ? -1 : var4_4.generateAudioSessionId();
        this.O = var2_6;
        var2_6 = afk.a;
        this.Q = true;
        this.i(this.q);
        var7_9 = this.i;
        var4_4 = new Handler(this.D);
        var6_3 = this.q;
        abr.i(var6_3);
        abr.i(var6_3);
        var7_9 = ((apc)var7_9).g;
        var7_9.O((akl)var6_3);
        var8_8 = new giu((Handler)var4_4, (akl)var6_3);
        ((CopyOnWriteArrayList)var7_9.a).add(var8_8);
        var4_4 = this.F;
        this.A.add(var4_4);
        this.u = var4_4 = new vy(var1_1.a, (Handler)var5_5);
        this.r = var5_5 = new gzy(var1_1.a, this.F);
        var4_4 = var5_5.c;
        if (!Objects.equals(null, null)) {
            var5_5.c = null;
            var5_5.a = 0;
            abr.e(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        this.t = var4_4 = new vy(var1_1.a);
        this.v = var4_4 = new wa(var1_1.a);
        yi.c();
        var2_6 = afe.a;
        this.N = agb.a;
        var5_5 = this.d;
        var4_4 = this.P;
        var1_1 = ((aox)var5_5).b;
        synchronized (var1_1) {
            var3_11 = ((aox)var5_5).f.equals(var4_4);
            ((aox)var5_5).f = var4_4;
        }
        {
            if (var3_11) ** GOTO lbl142
        }
        try {
            ((aox)var5_5).d();
lbl142:
            // 2 sources

            this.r(1, 10, this.O);
            this.r(2, 10, this.O);
            this.r(1, 3, this.P);
            this.r(2, 4, this.M);
            this.r(2, 5, 0);
            this.r(1, 9, false);
            this.r(2, 7, this.G);
            this.r(6, 8, this.G);
            this.r(-1, 16, this.S);
            return;
        }
        finally {
            this.x.e();
        }
    }

    private final void A(ail ail2) {
        ajr ajr2;
        ajr ajr3 = this.o;
        ajr3 = ajr3.a(ajr3.c);
        ajr3.q = ajr3.s;
        ajr3.r = 0L;
        ajr3 = ajr2 = ajr3.d(1);
        if (ail2 != null) {
            ajr3 = ajr2.c(ail2);
        }
        ++this.j;
        this.f.d.e(6).d();
        this.u(ajr3, 0, false, 5, -9223372036854775807L);
    }

    private final int x(ajr ajr2) {
        if (ajr2.b.p()) {
            return this.p;
        }
        return ajr2.b.n((Object)ajr2.c.a, (aeu)this.B).c;
    }

    private final long y(ajr ajr2) {
        if (ajr2.b.p()) {
            return agf.i(0L);
        }
        boolean bl2 = ajr2.p;
        long l2 = ajr2.s;
        if (ajr2.c.b()) {
            return l2;
        }
        this.v(ajr2.b, ajr2.c);
        return l2;
    }

    private static long z(ajr ajr2) {
        aev aev2 = new aev();
        aeu aeu2 = new aeu();
        ajr2.b.n(ajr2.c.a, aeu2);
        long l2 = ajr2.d;
        if (l2 == -9223372036854775807L) {
            l2 = ajr2.b.o((int)aeu2.c, (aev)aev2).l;
            return 0L;
        }
        return l2;
    }

    @Override
    public final int a() {
        this.t();
        if (this.m()) {
            return this.o.c.b;
        }
        return -1;
    }

    @Override
    public final int b() {
        this.t();
        if (this.m()) {
            return this.o.c.c;
        }
        return -1;
    }

    @Override
    public final int c() {
        int n2;
        this.t();
        int n3 = n2 = this.x(this.o);
        if (n2 == -1) {
            n3 = 0;
        }
        return n3;
    }

    @Override
    public final int d() {
        this.t();
        return this.o.f;
    }

    @Override
    public final int e() {
        this.t();
        return this.o.n;
    }

    @Override
    public final long f() {
        this.t();
        return agf.m(this.y(this.o));
    }

    @Override
    public final aew g() {
        this.t();
        return this.o.b;
    }

    @Override
    public final afd h() {
        this.t();
        return (afd)this.o.u.b;
    }

    @Override
    public final void i(aeq aeq2) {
        abr.i(aeq2);
        this.g.a(aeq2);
    }

    @Override
    public final void j() {
        this.t();
        this.w(this.l(), 1);
        ajr ajr2 = this.o;
        if (ajr2.f != 1) {
            return;
        }
        ajr2 = ajr2.c(null);
        int n2 = true != ajr2.b.p() ? 2 : 4;
        ajr2 = ajr2.d(n2);
        ++this.j;
        this.f.d.e(29).d();
        this.u(ajr2, 1, false, 5, -9223372036854775807L);
    }

    @Override
    public final void k() {
        this.t();
        this.l();
        this.A(null);
        int n2 = afk.a;
        n2 = gzx.d;
        gzx gzx2 = hct.a;
        long l2 = this.o.s;
        gzx.o(gzx2);
    }

    @Override
    public final boolean l() {
        this.t();
        return this.o.l;
    }

    @Override
    public final boolean m() {
        this.t();
        return this.o.c.b();
    }

    @Override
    public final void n() {
        this.t();
        this.d();
        this.w(true, 1);
    }

    @Override
    public final void o(ane object) {
        boolean bl2;
        long l2;
        aia aia2;
        ArrayList<Object> arrayList;
        int n2;
        int n3;
        Object object2;
        Object object3;
        int n4;
        block21: {
            long l3;
            ajr ajr2;
            Object object4;
            block22: {
                block23: {
                    block24: {
                        block20: {
                            this.t();
                            object = Collections.singletonList(object);
                            this.t();
                            this.t();
                            this.x(this.o);
                            this.f();
                            ++this.j;
                            if (!this.h.isEmpty()) {
                                int n5 = this.h.size();
                                for (n4 = n5 - 1; n4 >= 0; --n4) {
                                    this.h.remove(n4);
                                }
                                object3 = this.U;
                                object2 = new int[((int[])((bmu)object3).a).length - n5];
                                n3 = 0;
                                for (n4 = 0; n4 < ((int[])(object4 = (int[])((bmu)object3).a)).length; ++n4) {
                                    int n6 = object4[n4];
                                    if (n6 >= 0 && n6 < n5) {
                                        ++n3;
                                        continue;
                                    }
                                    n2 = n6;
                                    if (n6 >= 0) {
                                        n2 = n6 - n5;
                                    }
                                    object2[n4 - n3] = n2;
                                }
                                this.U = new bmu((int[])object2, new Random(((Random)((bmu)object3).b).nextLong()));
                            }
                            arrayList = new ArrayList<Object>();
                            for (n4 = 0; n4 < object.size(); ++n4) {
                                object3 = new ajo((ane)object.get(n4), this.C);
                                arrayList.add(object3);
                                this.h.add(n4, new aix(((ajo)object3).b, ((ajo)object3).a));
                            }
                            this.U = this.U.c(arrayList.size());
                            aia2 = new aia(this.h, this.U);
                            if (!aia2.p() && aia2.b < 0) {
                                throw new adv();
                            }
                            n4 = ((aew)aia2).g(false);
                            object3 = this.o;
                            if (aia2.p()) {
                                this.p = n4;
                                object = null;
                            } else {
                                if (n4 != -1 && n4 < aia2.b) {
                                    n3 = n4;
                                    l2 = -9223372036854775807L;
                                } else {
                                    n3 = ((aew)aia2).g(false);
                                    l2 = aia2.o(n3, this.a).a();
                                }
                                object = aia2.k(this.a, this.B, n3, agf.i(l2));
                            }
                            bl2 = aia2.p() || object != null;
                            abr.d(bl2);
                            object2 = ((ajr)object3).b;
                            l2 = this.p((ajr)object3);
                            ajr2 = ((ajr)object3).e(aia2);
                            if (!aia2.p()) break block20;
                            object3 = ajr.a;
                            l2 = agf.i(0L);
                            object = this.s;
                            object2 = aob.a;
                            n3 = gzx.d;
                            object = ajr2.g((anc)object3, l2, l2, l2, 0L, (aob)object2, (diz)object, hct.a).a((anc)object3);
                            ((ajr)object).q = ((ajr)object).s;
                            break block21;
                        }
                        object4 = ajr2.c.a;
                        n3 = agf.a;
                        bl2 = object4.equals(((Pair)object).first);
                        object3 = !bl2 ? new anc(((Pair)object).first) : ajr2.c;
                        l3 = (Long)((Pair)object).second;
                        l2 = agf.i(l2);
                        if (!((aew)object2).p()) {
                            ((aew)object2).n(object4, this.B);
                        }
                        if (!bl2 || (n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1))) < 0) break block22;
                        if (n3 != 0) break block23;
                        n3 = ((aew)aia2).a(ajr2.k.a);
                        if (n3 == -1) break block24;
                        n3 = aia2.m((int)n3, (aeu)this.B).c;
                        object = ((anc)object3).a;
                        object2 = this.B;
                        ((aew)aia2).n(object, (aeu)object2);
                        object = ajr2;
                        if (n3 == ((aeu)object2).c) break block21;
                    }
                    ((aew)aia2).n(((anc)object3).a, this.B);
                    l2 = ((anc)object3).b() ? this.B.e(((anc)object3).b, ((anc)object3).c) : this.B.d;
                    object = ajr2.g((anc)object3, ajr2.s, ajr2.s, ajr2.e, l2 - ajr2.s, ajr2.i, ajr2.u, ajr2.j).a((anc)object3);
                    ((ajr)object).q = l2;
                    break block21;
                }
                abr.f(((anc)object3).b() ^ true);
                long l4 = Math.max(0L, ajr2.r - (l3 - l2));
                l2 = ajr2.q;
                if (ajr2.k.equals(ajr2.c)) {
                    l2 = l3 + l4;
                }
                object = ajr2.g((anc)object3, l3, l3, l3, l4, ajr2.i, ajr2.u, ajr2.j);
                ((ajr)object).q = l2;
                break block21;
            }
            abr.f(((anc)object3).b() ^ true);
            object = !bl2 ? aob.a : ajr2.i;
            object2 = !bl2 ? this.s : ajr2.u;
            if (!bl2) {
                n3 = gzx.d;
                object4 = hct.a;
            } else {
                object4 = ajr2.j;
            }
            object = ajr2.g((anc)object3, l3, l3, l3, 0L, (aob)object, (diz)object2, (List)object4).a((anc)object3);
            ((ajr)object).q = l3;
        }
        n2 = ((ajr)object).f;
        if (n4 != -1) {
            n3 = n2;
            if (n2 != 1) {
                n3 = !aia2.p() && n4 < aia2.b ? 2 : 4;
            }
        } else {
            n4 = -1;
            n3 = n2;
        }
        object2 = ((ajr)object).d(n3);
        object = this.f;
        l2 = agf.i(-9223372036854775807L);
        object3 = this.U;
        ((ajd)object).d.f(17, new aiz(arrayList, (bmu)object3, n4, l2)).d();
        bl2 = !this.o.c.a.equals(((ajr)object2).c.a) && !this.o.b.p();
        this.u((ajr)object2, 0, bl2, 4, this.y((ajr)object2));
    }

    public final long p(ajr ajr2) {
        if (ajr2.c.b()) {
            ajr2.b.n(ajr2.c.a, this.B);
            long l2 = ajr2.d == -9223372036854775807L ? ajr2.b.o(this.x(ajr2), this.a).a() : this.B.f() + agf.m(ajr2.d);
            return l2;
        }
        return agf.m(this.y(ajr2));
    }

    public final void q(int n2, int n3) {
        agb agb2 = this.N;
        if (n2 == agb2.b && n3 == agb2.c) {
            return;
        }
        this.N = new agb(n2, n3);
        this.g.e(24, new ais(n2, n3));
        this.r(2, 14, new agb(n2, n3));
    }

    public final void r(int n2, int n3, Object object) {
        ajw[] ajwArray = this.z;
        int n4 = ajwArray.length;
        for (n4 = 0; n4 <= 0; ++n4) {
            ajw ajw2 = ajwArray[n4];
            if (n2 != -1) {
                ajw2.J();
                if (n2 != 1) continue;
            }
            this.x(this.o);
            ajd ajd2 = this.f;
            Object object2 = this.o.b;
            object2 = new aju(ajd2, ajw2, ajd2.e);
            abr.f(((aju)object2).g ^ true);
            ((aju)object2).c = n3;
            abr.f(((aju)object2).g ^ true);
            ((aju)object2).d = object;
            abr.f(((aju)object2).g ^ true);
            abr.d(true);
            ((aju)object2).g = true;
            ((aju)object2).b.d((aju)object2);
        }
    }

    public final void s(Object object) {
        Object object2 = new ArrayList();
        Object object3 = this.z;
        int n2 = ((ajw[])object3).length;
        int n3 = 0;
        int n4 = 0;
        for (n2 = 0; n2 <= 0; ++n2) {
            object3[n2].J();
        }
        object3 = this.L;
        int n5 = n3;
        if (object3 != null) {
            n5 = n3;
            if (object3 != object) {
                block11: {
                    try {
                        object2 = object2.iterator();
                    }
                    catch (TimeoutException timeoutException) {
                        n2 = 1;
                        break block11;
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        n2 = n4;
                    }
                    while (true) {
                        n2 = n4;
                        if (object2.hasNext()) {
                            ((aju)object2.next()).b(this.H);
                            continue;
                        }
                        break;
                    }
                }
                object3 = this.L;
                object2 = this.n;
                n5 = n2;
                if (object3 == object2) {
                    object2.release();
                    this.n = null;
                    n5 = n2;
                }
            }
        }
        this.L = object;
        if (n5 != 0) {
            this.A(new ail(2, new aje(3), 1003));
        }
    }

    public final void t() {
        this.x.b();
        Object object = this.D;
        if (Thread.currentThread() != object.getThread()) {
            String string = agf.r("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.D.getThread().getName());
            if (!this.Q) {
                object = this.R ? null : new IllegalStateException();
                afx.f("ExoPlayerImpl", string, (Throwable)object);
                this.R = true;
                return;
            }
            throw new IllegalStateException(string);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void u(ajr var1_1, int var2_2, boolean var3_3, int var4_4, long var5_5) {
        block73: {
            block76: {
                block74: {
                    block75: {
                        block60: {
                            block72: {
                                block69: {
                                    block70: {
                                        block71: {
                                            block62: {
                                                block68: {
                                                    block65: {
                                                        block67: {
                                                            block66: {
                                                                block63: {
                                                                    block64: {
                                                                        block61: {
                                                                            block59: {
                                                                                var26_6 = this.o;
                                                                                this.o = var1_1;
                                                                                var18_7 = var26_6.b.equals(var1_1.b);
                                                                                var23_8 = var26_6.b;
                                                                                var27_9 = var1_1.b;
                                                                                var19_10 = var27_9.p();
                                                                                var24_11 = -1;
                                                                                var25_12 = true;
                                                                                var22_13 = false;
                                                                                if (!var19_10 || !var23_8.p()) break block59;
                                                                                var22_13 = new Pair(var22_13, var24_11);
                                                                                break block60;
                                                                            }
                                                                            if (var27_9.p() == var23_8.p()) break block61;
                                                                            var22_13 = new Pair(var25_12, (Object)3);
                                                                            break block60;
                                                                        }
                                                                        if (var23_8.o((int)var23_8.n((Object)var26_6.c.a, (aeu)this.B).c, (aev)this.a).b.equals(var27_9.o((int)var27_9.n((Object)var1_1.c.a, (aeu)this.B).c, (aev)this.a).b)) break block62;
                                                                        if (!var3_3) break block63;
                                                                        if (var4_4 != 0) break block64;
                                                                        var3_3 = true;
                                                                        var7_14 = 1;
                                                                        var4_4 = 0;
                                                                        break block65;
                                                                    }
                                                                    var3_3 = true;
                                                                    break block66;
                                                                }
                                                                var3_3 = false;
                                                            }
                                                            if (!var3_3 || var4_4 != 1) break block67;
                                                            var7_14 = 2;
                                                            break block65;
                                                        }
                                                        if (var18_7) break block68;
                                                        var7_14 = 3;
                                                    }
                                                    var22_13 = new Pair(var25_12, (Object)var7_14);
                                                    break block60;
                                                }
                                                throw new IllegalStateException();
                                            }
                                            if (!var3_3) break block69;
                                            if (var4_4 != 0) break block70;
                                            if (var26_6.c.d >= var1_1.c.d) break block71;
                                            var22_13 = new Pair(var25_12, (Object)0);
                                            var3_3 = true;
                                            var4_4 = 0;
                                            break block60;
                                        }
                                        var3_3 = true;
                                        var4_4 = 0;
                                        break block72;
                                    }
                                    var3_3 = true;
                                    break block72;
                                }
                                var3_3 = false;
                            }
                            var22_13 = new Pair(var22_13, var24_11);
                        }
                        var19_10 = (Boolean)var22_13.first;
                        var11_15 = (Integer)var22_13.second;
                        if (var19_10) {
                            if (!var1_1.b.p()) {
                                var7_14 = var1_1.b.n((Object)var1_1.c.a, (aeu)this.B).c;
                                var22_13 = var1_1.b.o((int)var7_14, (aev)this.a).d;
                            } else {
                                var22_13 = null;
                            }
                            this.T = aei.a;
                        } else {
                            var22_13 = null;
                        }
                        if (var19_10 || !fvd.z(var26_6.j, var1_1.j)) {
                            var24_11 = new aeh(this.T);
                            var25_12 = var1_1.j;
                            var7_14 = 0;
                            while (true) {
                                if (var7_14 >= ((hct)var25_12).c) break;
                                var23_8 = (aek)var25_12.get(var7_14);
                                for (var8_16 = 0; var8_16 < var23_8.a(); ++var8_16) {
                                    var23_8.b(var8_16).a((aeh)var24_11);
                                }
                                ++var7_14;
                            }
                            this.T = new aei((aeh)var24_11);
                        }
                        if ((var23_8 = this.g()).p()) {
                            var23_8 = this.T;
                        } else {
                            var24_11 = var23_8.o((int)this.c(), (aev)this.a).d;
                            var23_8 = new aeh(this.T);
                            var24_11 = var24_11.d;
                            if (var24_11 != null) {
                                var25_12 = var24_11.b;
                                if (var25_12 != null) {
                                    var23_8.a = var25_12;
                                }
                                if ((var25_12 = var24_11.c) != null) {
                                    var23_8.b = var25_12;
                                }
                                if ((var25_12 = var24_11.d) != null) {
                                    var23_8.c = var25_12;
                                }
                                if ((var25_12 = var24_11.e) != null) {
                                    var23_8.d = var25_12;
                                }
                                if ((var25_12 = var24_11.f) != null) {
                                    var23_8.e = var25_12;
                                }
                                if ((var25_12 = (Object)var24_11.g) != null) {
                                    var27_9 = var24_11.h;
                                    var23_8.f = (byte[])var25_12.clone();
                                    var23_8.g = var27_9;
                                }
                                if ((var25_12 = var24_11.i) != null) {
                                    var23_8.h = var25_12;
                                }
                                if ((var25_12 = var24_11.j) != null) {
                                    var23_8.i = var25_12;
                                }
                                if ((var25_12 = var24_11.k) != null) {
                                    var23_8.j = var25_12;
                                }
                                if ((var25_12 = var24_11.l) != null) {
                                    var23_8.k = var25_12;
                                }
                                if ((var25_12 = var24_11.m) != null) {
                                    var23_8.l = var25_12;
                                }
                                if ((var25_12 = var24_11.n) != null) {
                                    var23_8.l = var25_12;
                                }
                                if ((var25_12 = var24_11.o) != null) {
                                    var23_8.m = var25_12;
                                }
                                if ((var25_12 = var24_11.p) != null) {
                                    var23_8.n = var25_12;
                                }
                                if ((var25_12 = var24_11.q) != null) {
                                    var23_8.o = var25_12;
                                }
                                if ((var25_12 = var24_11.r) != null) {
                                    var23_8.p = var25_12;
                                }
                                if ((var25_12 = var24_11.s) != null) {
                                    var23_8.q = var25_12;
                                }
                                if ((var25_12 = var24_11.t) != null) {
                                    var23_8.r = var25_12;
                                }
                                if ((var25_12 = var24_11.u) != null) {
                                    var23_8.s = var25_12;
                                }
                                if ((var25_12 = var24_11.v) != null) {
                                    var23_8.t = var25_12;
                                }
                                if ((var25_12 = var24_11.w) != null) {
                                    var23_8.u = var25_12;
                                }
                                if ((var25_12 = var24_11.x) != null) {
                                    var23_8.v = var25_12;
                                }
                                if ((var24_11 = var24_11.y) != null) {
                                    var23_8.w = var24_11;
                                }
                            }
                            var23_8 = new aei((aeh)var23_8);
                        }
                        var21_17 = var23_8.equals(this.K);
                        this.K = var23_8;
                        var7_14 = var26_6.l != var1_1.l ? 1 : 0;
                        var8_16 = var26_6.f != var1_1.f ? 1 : 0;
                        if (!(var8_16 == 0 && var7_14 == 0 || (var9_18 = this.d()) != 2 && var9_18 != 3)) {
                            this.t();
                            var20_19 = this.o.p;
                            this.l();
                            this.l();
                        }
                        var9_18 = var26_6.h != var1_1.h ? 1 : 0;
                        if (!var18_7) {
                            this.g.c(0, new aiu(var1_1, var2_2, 1));
                        }
                        if (!var3_3) break block73;
                        var27_9 = new aeu();
                        if (!var26_6.b.p()) {
                            var24_11 = var26_6.c.a;
                            var26_6.b.n(var24_11, (aeu)var27_9);
                            var2_2 = var27_9.c;
                            var10_20 = var26_6.b.a(var24_11);
                            var23_8 = var26_6.b.o((int)var2_2, (aev)this.a).b;
                            var25_12 = this.a.d;
                        } else {
                            var23_8 = null;
                            var2_2 = -1;
                            var25_12 = null;
                            var24_11 = null;
                            var10_20 = -1;
                        }
                        if (var4_4 != 0) break block74;
                        if (!var26_6.c.b()) break block75;
                        var28_21 = var26_6.c;
                        var14_22 = var27_9.e(var28_21.b, var28_21.c);
                        var16_23 = aiy.z(var26_6);
                        break block76;
                    }
                    var14_22 = var26_6.c.e != -1 ? aiy.z(this.o) : var27_9.d;
                    ** GOTO lbl188
                }
                if (var26_6.c.b()) {
                    var14_22 = var26_6.s;
                    var16_23 = aiy.z(var26_6);
                } else {
                    var14_22 = var26_6.s;
lbl188:
                    // 2 sources

                    var16_23 = var14_22;
                }
            }
            var12_24 = agf.a;
            var27_9 = var26_6.c;
            var12_24 = var27_9.b;
            var13_25 = var27_9.c;
            var27_9 = new aer(var23_8, var2_2, (aef)var25_12, var24_11, var10_20, agf.m(var14_22), agf.m(var16_23), var12_24, var13_25);
            var10_20 = this.c();
            if (!this.o.b.p()) {
                var24_11 = this.o;
                var23_8 = var24_11.c.a;
                var24_11.b.n(var23_8, this.B);
                var2_2 = this.o.b.a(var23_8);
                var24_11 = this.o.b.o((int)var10_20, (aev)this.a).b;
                var25_12 = this.a.d;
            } else {
                var24_11 = null;
                var25_12 = null;
                var23_8 = null;
                var2_2 = -1;
            }
            var14_22 = agf.m(var5_5);
            var5_5 = this.o.c.b() != false ? agf.m(aiy.z(this.o)) : var14_22;
            var28_21 = this.o.c;
            var23_8 = new aer(var24_11, var10_20, (aef)var25_12, var23_8, var2_2, var14_22, var5_5, var28_21.b, var28_21.c);
            this.g.c(11, new ait(var4_4, (aer)var27_9, (aer)var23_8));
        }
        if (var19_10) {
            this.g.c(1, new aiu(var22_13, var11_15, 0));
        }
        if (var26_6.g != var1_1.g) {
            this.g.c(10, new air(var1_1, 9));
            if (var1_1.g != null) {
                this.g.c(10, new air(var1_1, 10));
            }
        }
        if ((var22_13 = var26_6.u) != (var23_8 = var1_1.u)) {
            var22_13 = var23_8.d;
            this.g.c(2, new air(var1_1, 11));
        }
        if (!var21_17) {
            var22_13 = this.K;
            this.g.c(14, new air(var22_13, 1));
        }
        if (var9_18 != 0) {
            this.g.c(3, new air(var1_1, 0));
        }
        if (var8_16 != 0 || var7_14 != 0) {
            this.g.c(-1, new air(var1_1, 2));
        }
        if (var8_16 != 0) {
            this.g.c(4, new air(var1_1, 3));
        }
        if (var7_14 != 0 || var26_6.m != var1_1.m) {
            this.g.c(5, new air(var1_1, 4));
        }
        if (var26_6.n != var1_1.n) {
            this.g.c(6, new air(var1_1, 6));
        }
        if (var26_6.f() != var1_1.f()) {
            this.g.c(7, new air(var1_1, 7));
        }
        if (!var26_6.o.equals(var1_1.o)) {
            this.g.c(12, new air(var1_1, 8));
        }
        var22_13 = this.m;
        var25_12 = this.c;
        var23_8 = this.b;
        var2_2 = agf.a;
        var18_7 = var25_12.m();
        var24_11 = (adk)var25_12;
        var27_9 = var24_11.g();
        var4_4 = var27_9.p() == false && var27_9.o((int)var24_11.c(), (aev)var24_11.a).h != false ? 1 : 0;
        var28_21 = var24_11.g();
        if (var28_21.p()) {
            while (true) {
                var7_14 = 0;
                break;
            }
        } else {
            var2_2 = var24_11.c();
            var27_9 = (aiy)var25_12;
            var27_9.t();
            var27_9.t();
            if (var28_21.q(var2_2) == -1) ** continue;
            var7_14 = 1;
        }
        var28_21 = var24_11.g();
        if (var28_21.p()) {
            var2_2 = 0;
        } else {
            var2_2 = var24_11.c();
            var27_9 = (aiy)var25_12;
            var27_9.t();
            var27_9.t();
            var2_2 = var28_21.j(var2_2, 0, false) != -1 ? 1 : 0;
        }
        var27_9 = var24_11.g();
        var8_16 = var27_9.p() == false && var27_9.o(var24_11.c(), var24_11.a).b() != false ? 1 : 0;
        var27_9 = var24_11.g();
        var9_18 = var27_9.p() == false && var27_9.o((int)var24_11.c(), (aev)var24_11.a).i != false ? 1 : 0;
        var20_19 = var25_12.g().p();
        var24_11 = new adr();
        aay.e((aep)var23_8, (adr)var24_11);
        var19_10 = var18_7 ^ true;
        aay.f(4, var19_10, (adr)var24_11);
        var3_3 = var4_4 != 0 && var18_7 == false;
        aay.f(5, var3_3, (adr)var24_11);
        var3_3 = var7_14 != 0 && var18_7 == false;
        aay.f(6, var3_3, (adr)var24_11);
        var3_3 = var20_19 == false && (var7_14 != 0 || var8_16 == 0 || var4_4 != 0) && var18_7 == false;
        aay.f(7, var3_3, (adr)var24_11);
        var3_3 = var2_2 != 0 && var18_7 == false;
        aay.f(8, var3_3, (adr)var24_11);
        var3_3 = var20_19 == false && (var2_2 != 0 || var8_16 != 0 && var9_18 != 0) && var18_7 == false;
        aay.f(9, var3_3, (adr)var24_11);
        aay.f(10, var19_10, (adr)var24_11);
        var3_3 = var4_4 != 0 && var18_7 == false;
        aay.f(11, var3_3, (adr)var24_11);
        var3_3 = var4_4 != 0 && var18_7 == false;
        aay.f(12, var3_3, (adr)var24_11);
        this.m = var23_8 = aay.d((adr)var24_11);
        if (!var23_8.equals(var22_13)) {
            this.g.c(13, new air(this, 5));
        }
        this.g.b();
        var3_3 = var26_6.p;
        var3_3 = var1_1.p;
    }

    public final void v(aew aew2, anc anc2) {
        aew2.n(anc2.a, this.B);
    }

    public final void w(boolean bl2, int n2) {
        Object object = this.o;
        if (((ajr)object).l == bl2 && ((ajr)object).n == 0 && ((ajr)object).m == 1) {
            return;
        }
        ++this.j;
        boolean bl3 = ((ajr)object).p;
        ajr ajr2 = ((ajr)object).b(bl2, 1, 0);
        Handler handler = ((agd)this.f.d).b;
        object = agd.h();
        ((ilo)object).a = handler.obtainMessage(1, bl2 ? 1 : 0, 1);
        ((ilo)object).d();
        this.u(ajr2, 0, false, 5, -9223372036854775807L);
    }
}

