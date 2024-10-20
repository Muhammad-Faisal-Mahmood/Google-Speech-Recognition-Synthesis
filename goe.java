/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  gqv
 */
import android.os.Build;
import java.util.UUID;

public final class goe
implements gpc {
    public final grb a;
    public final gpc b;
    public Thread c;
    public gqr d;
    private final gra e;

    private goe(gra object, goe goe2, goz goz2) {
        this.e = object;
        this.a = goe2.a;
        this.b = goe2;
        object = goz2.e;
        if (object == null) {
            this.d = null;
            this.c = Thread.currentThread();
            return;
        }
        this.d = object;
        this.c = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public goe(gra object, grb object2, goz goz2) {
        this.e = object;
        this.a = object2;
        object = null;
        this.b = null;
        object2 = goz2.e;
        if (object2 == null) {
            this.d = null;
            object = Thread.currentThread();
        } else {
            this.d = object2;
        }
        this.c = object;
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 28) {
            fs$$ExternalSyntheticApiModelOutline0.m(this);
        }
    }

    @Override
    public final gpc a() {
        return this.b;
    }

    @Override
    public final gqr b() {
        return this.d;
    }

    @Override
    public final String c() {
        return this.e.c;
    }

    @Override
    public final void close() {
        gno.k(this);
        this.c = null;
        this.d = null;
    }

    @Override
    public final UUID d() {
        return this.a.b;
    }

    @Override
    public final void e() {
    }

    public final int f() {
        return this.e.f;
    }

    @Override
    public final gop i() {
        gra gra2 = this.e;
        return gop.e(gra2.e, gra2.c());
    }

    @Override
    public final gom j(fxf fxf2) {
        return gop.h(fxf2, this.i(), gqv.a);
    }

    @Override
    public final gop l() {
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final gpc m(String var1_1, gop var2_2, goz var3_3) {
        block7: {
            block6: {
                var9_4 = this.a;
                var7_5 = var9_4.a();
                var1_1 = new gra(this.e, (String)var1_1, var7_5, (gop)var2_2);
                do {
                    var2_2 = (gra)var9_4.e.get();
                    var4_6 = var2_2.f;
                    var6_7 = true;
                    if (++var4_6 >= var9_4.a.f) {
                        var1_1.d(-2147483648, null);
                        synchronized (var9_4) {
                            ++var9_4.g;
                            break;
                        }
                    }
                    var1_1.d(var4_6, (gra)var2_2);
                } while (!a.l(var9_4.e, var2_2, var1_1));
                var2_2 = new goe((gra)var1_1, this, (goz)var3_3);
                a.s(var2_2.b, "root trace is not a child span.");
                var5_8 = var2_2.c != null || var2_2.d != null;
                fxf.B(var5_8, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
                var3_3 = var2_2.d;
                if (var3_3 == null) break block6;
                if (var3_3 != ((goe)var2_2.b).d) ** GOTO lbl-1000
                var5_8 = var6_7;
                break block7;
            }
            if (((goe)var2_2.b).c == var2_2.c) {
                var5_8 = var6_7;
            } else lbl-1000:
            // 2 sources

            {
                var5_8 = false;
            }
        }
        var1_1.h = var5_8;
        return var2_2;
    }

    @Override
    public final void n(boolean bl2) {
        long l2 = this.a.a();
        gra gra2 = this.e;
        long l3 = gra2.d;
        fxf.A(gra2.e() ^ true);
        long l4 = true != bl2 ? 0L : 0x4000000000000000L;
        gra2.i = l2 - l3 & 0x3FFFFFFFFFFFFFFFL | (l4 | Long.MIN_VALUE);
        this.g();
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p() {
        this.e.j = 3;
    }

    @Override
    public final void q(fxf object, Object object2) {
        gqx gqx2 = new gqx((fxf)object, object2);
        do {
            if ((object2 = gra.a.a((gra)(object = this.e))) == null) continue;
            gqx2.b = object2;
        } while (!gra.a.b((gra)object, (gqx)object2, gqx2));
        this.g();
    }

    public final String toString() {
        return gno.j(this);
    }
}

