/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.util.Base64
 */
import android.media.metrics.PlaybackMetrics;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class akn
implements akp {
    private static final Random d = new Random();
    public final aev a = new aev();
    public final aeu b = new aeu();
    public ako c;
    private final HashMap e = new HashMap();
    private aew f = aew.a;
    private String g;
    private long h = -1L;

    public static String b() {
        byte[] byArray = new byte[12];
        d.nextBytes(byArray);
        return Base64.encodeToString((byte[])byArray, (int)10);
    }

    private final akm i(int n2, anc object) {
        Iterator iterator = this.e.values().iterator();
        long l2 = Long.MAX_VALUE;
        Object object2 = null;
        while (iterator.hasNext()) {
            long l3;
            long l4;
            long l5;
            akm akm2 = (akm)iterator.next();
            if (akm2.c == -1L && n2 == akm2.b && object != null && (l5 = ((anc)object).d) >= (l4 = akm2.g.a())) {
                akm2.c = l5;
            }
            if (object == null) {
                if (n2 != akm2.b) continue;
            } else {
                anc anc2 = akm2.d;
                if (anc2 == null ? ((anc)object).b() || ((anc)object).d != akm2.c : ((anc)object).d != anc2.d || ((anc)object).b != anc2.b || ((anc)object).c != anc2.c) continue;
            }
            l4 = akm2.c;
            if (l4 != -1L && (l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) >= 0) {
                if (l3 != false) continue;
                l3 = agf.a;
                if (((akm)object2).d == null || akm2.d == null) continue;
                object2 = akm2;
                continue;
            }
            object2 = akm2;
            l2 = l4;
        }
        if (object2 == null) {
            object2 = akn.b();
            object = new akm(this, (String)object2, n2, (anc)object);
            this.e.put(object2, object);
            return object;
        }
        return object2;
    }

    private final void j(akm akm2) {
        long l2 = akm2.c;
        if (l2 != -1L) {
            this.h = l2;
        }
        this.g = null;
    }

    private final void k(akc object) {
        if (((akc)object).b.p()) {
            object = this.g;
            if (object != null) {
                object = (akm)this.e.get(object);
                abr.i(object);
                this.j((akm)object);
                return;
            }
        } else {
            int n2;
            long l2;
            Object object2 = (akm)this.e.get(this.g);
            this.g = this.i((int)((akc)object).c, (anc)((akc)object).d).a;
            this.f((akc)object);
            anc anc2 = ((akc)object).d;
            if (anc2 != null && anc2.b() && (object2 == null || ((akm)object2).c != (l2 = anc2.d) || (object2 = ((akm)object2).d) == null || ((anc)object2).b != (n2 = anc2.b) || ((anc)object2).c != anc2.c)) {
                anc2 = new anc(anc2.a, anc2.d);
                this.i(((akc)object).c, anc2);
            }
        }
    }

    public final long a() {
        long l2;
        akm akm2 = (akm)this.e.get(this.g);
        if (akm2 != null && (l2 = akm2.c) != -1L) {
            return l2;
        }
        return this.h + 1L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String c() {
        synchronized (this) {
            return this.g;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String d(aew object, anc anc2) {
        synchronized (this) {
            return this.i((int)((aew)object).n((Object)anc2.a, (aeu)this.b).c, (anc)anc2).a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(akc akc2) {
        synchronized (this) {
            Object object = this.g;
            if (object != null) {
                object = (akm)this.e.get(object);
                abr.i(object);
                this.j((akm)object);
            }
            object = this.e.values().iterator();
            while (object.hasNext()) {
                ako ako2;
                akm akm2 = (akm)object.next();
                object.remove();
                if (!akm2.e || (ako2 = this.c) == null) continue;
                ako2.g(akc2, akm2.a);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void f(akc akc2) {
        synchronized (this) {
            long l2;
            Object object;
            abr.i(this.c);
            if (!(akc2.b.p() || (object = akc2.d) != null && (((anc)object).d < (l2 = this.a()) || (object = (akm)this.e.get(this.g)) != null && ((akm)object).c == -1L && ((akm)object).b != akc2.c))) {
                Object object2;
                Object object3;
                object = this.i(akc2.c, akc2.d);
                if (this.g == null) {
                    this.g = ((akm)object).a;
                }
                if ((object3 = akc2.d) != null && ((anc)object3).b()) {
                    object2 = ((anc)object3).a;
                    l2 = ((anc)object3).d;
                    int n2 = ((anc)object3).b;
                    object3 = new anc(object2, l2, n2);
                    object2 = this.i(akc2.c, (anc)object3);
                    if (!((akm)object2).e) {
                        akm.b((akm)object2);
                        aew aew2 = akc2.b;
                        object2 = akc2.d;
                        object3 = this.b;
                        aew2.n(((anc)object2).a, (aeu)object3);
                        this.b.i(akc2.d.b);
                        object2 = this.b;
                        Math.max(0L, agf.m(0L) + ((aeu)object2).f());
                    }
                }
                if (!((akm)object).e) {
                    akm.b((akm)object);
                }
                if (((akm)object).a.equals(this.g) && !((akm)object).f) {
                    ((akm)object).f = true;
                    object2 = this.c;
                    object = ((akm)object).a;
                    object3 = akc2.d;
                    if (object3 == null || !((anc)object3).b()) {
                        ((ako)object2).b();
                        ((ako)object2).g = object;
                        object = new PlaybackMetrics.Builder();
                        ((ako)object2).h = ut$$ExternalSyntheticApiModelOutline0.m$1(ut$$ExternalSyntheticApiModelOutline0.m((PlaybackMetrics.Builder)object, "AndroidXMedia3"), "1.5.0-alpha01");
                        ((ako)object2).c(akc2.b, akc2.d);
                        return;
                    }
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void g(akc akc2, int n2) {
        synchronized (this) {
            abr.i(this.c);
            Iterator iterator = this.e.values().iterator();
            while (true) {
                akm akm2;
                block8: {
                    block9: {
                        boolean bl2;
                        block7: {
                            if (!iterator.hasNext()) {
                                this.k(akc2);
                                return;
                            }
                            akm2 = (akm)iterator.next();
                            if (!akm2.a(akc2)) continue;
                            iterator.remove();
                            if (!akm2.e) continue;
                            bl2 = akm2.a.equals(this.g);
                            if (n2 != 0) break block7;
                            if (!bl2) break block8;
                            bl2 = akm2.f;
                            break block9;
                        }
                        if (!bl2) break block8;
                    }
                    this.j(akm2);
                }
                this.c.g(akc2, akm2.a);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h(akc var1_1) {
        synchronized (this) {
            abr.i(this.c);
            var5_2 = this.f;
            this.f = var1_1.b;
            var8_3 = this.e.values().iterator();
            while (true) {
                block12: {
                    block11: {
                        if (!var8_3.hasNext()) {
                            this.k(var1_1);
                            return;
                        }
                        var6_7 = (akm)var8_3.next();
                        var4_6 = this.f;
                        var3_5 = var6_7.b;
                        if (var3_5 < var5_2.c()) break block11;
                        var2_4 = var3_5;
                        if (var3_5 < var4_6.c()) break block12;
                        ** GOTO lbl23
                    }
                    var5_2.o(var3_5, var6_7.g.a);
                    var2_4 = var6_7.g.a.n;
                    while (true) {
                        block13: {
                            if (var2_4 <= var6_7.g.a.o) break block13;
lbl23:
                            // 2 sources

                            var2_4 = -1;
                            break;
                        }
                        var3_5 = var4_6.a(var5_2.f(var2_4));
                        if (var3_5 != -1) {
                            var2_4 = var4_6.m((int)var3_5, (aeu)var6_7.g.b).c;
                            break;
                        }
                        ++var2_4;
                    }
                }
                var6_7.b = var2_4;
                if (var2_4 != -1 && ((var7_8 = var6_7.d) == null || var4_6.a(var7_8.a) != -1) && !var6_7.a(var1_1)) continue;
                var8_3.remove();
                if (!var6_7.e) continue;
                if (var6_7.a.equals(this.g)) {
                    this.j(var6_7);
                }
                this.c.g(var1_1, var6_7.a);
            }
        }
    }
}

