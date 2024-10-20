/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

public final class aks
implements Runnable {
    public final Object a;
    public final Object b;
    private final int c;

    public aks(cdz cdz2, cbk cbk2, int n2) {
        this.c = n2;
        this.b = cbk2;
        this.a = cdz2;
    }

    public /* synthetic */ aks(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public aks(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ aks(Object object, Object object2, int n2, char[] cArray) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var2_1 = this.c;
        var8_2 = null;
        var3_3 = -9223372036854775807L;
        var7_4 = false;
        var6_5 = true;
        var1_6 = 1;
        switch (var2_1) {
            default: {
                var9_7 = ((cei)this.a).a;
                var8_2 = this.b;
                if (var9_7 != null) break;
                return;
            }
            case 19: {
                var9_8 = (cdz)this.a;
                var8_2 = var9_8.b;
                var8_2 = (cdx)var9_8.e.j.get(var8_2);
                if (var8_2 == null) {
                    return;
                }
                var9_8 = (cbk)this.b;
                if (!var9_8.b()) {
                    var8_2.i((cbk)var9_8);
                    return;
                }
                var9_8 = (cdz)this.a;
                var9_8.d = true;
                if (var9_8.a.l()) {
                    ((cdz)this.a).c();
                    return;
                }
                try {
                    var9_8 = ((cdz)this.a).a;
                    var9_8.p(null, var9_8.g());
                    return;
                }
                catch (SecurityException var9_9) {
                    Log.e((String)"GoogleApiManager", (String)"Failed to get service from broker. ", (Throwable)var9_9);
                    ((cdz)this.a).a.i("Failed to get service from broker.");
                    var8_2.i(new cbk(10));
                    return;
                }
            }
            case 18: {
                var8_2 = this.b;
                ((bvs)this.a).h.o((ane)var8_2);
                return;
            }
            case 17: {
                var8_2 = this.b;
                ((brq)this.a).c.o((ane)var8_2);
                return;
            }
            case 16: {
                var9_10 = this.b;
                var8_2 = (brq)this.a;
                var9_10 = new bro((brq)var8_2, (po)var9_10);
                var8_2.c.i((aeq)var9_10);
                var9_10 = var8_2.c;
                Objects.requireNonNull(var9_10);
                var9_10 = new bpv(var9_10, 5);
                var8_2.d.post((Runnable)var9_10);
                return;
            }
            case 15: {
                var8_2 = (Throwable)this.a.a();
                ((po)this.b).d((Throwable)var8_2);
                return;
            }
            case 14: {
                var8_2 = (View)this.b;
                var9_11 /* !! */  = (ViewGroup)var8_2.getParent();
                if (var9_11 /* !! */  != null) {
                    var9_11 /* !! */ .removeView((View)var8_2);
                }
                var9_11 /* !! */  = (bne)this.a;
                var9_11 /* !! */ .i.addView((View)var8_2, var9_11 /* !! */ .j);
                var9_11 /* !! */ .i.requestLayout();
                var9_11 /* !! */ .i = null;
                var9_11 /* !! */ .j = null;
                return;
            }
            case 13: {
                var8_2 = (bne)this.a;
                var10_23 = var8_2.e;
                if (var10_23 == null) return;
                var9_12 = this.b;
                if (var9_12 == null) return;
                if (sk$$ExternalSyntheticApiModelOutline1.m(var10_23) != null) return;
                var8_2.h = true;
                var10_23 = var8_2.e;
                var1_6 = var8_2.g;
                var2_1 = var8_2.f;
                sk$$ExternalSyntheticApiModelOutline1.m(var10_23, (View)var9_12, var1_6, var2_1);
                return;
            }
            case 12: {
                var1_6 = ((bko)this.b).b;
                var8_2 = this.a.findViewHolderForAdapterPosition(var1_6);
                if (var8_2 == null) return;
                var8_2.itemView.requestFocus();
                return;
            }
            case 11: {
                var8_2 = this.a;
                jse.e(var8_2, "$id");
                var8_2 = ((UUID)var8_2).toString();
                jse.d(var8_2, "id.toString()");
                AmbientMode$AmbientCallback.l((bdn)this.b, (String)var8_2);
                return;
            }
            case 10: {
                var11_29 = ((bgb)this.b).b.f;
                var9_13 = var11_29.j;
                var10_24 = this.a;
                synchronized (var9_13) {
                    var10_24 = var11_29.e((String)var10_24);
                    ** if (var10_24 == null) goto lbl109
lbl-1000:
                    // 1 sources

                    {
                        var8_2 = var10_24.b;
                    }
                }
lbl109:
                // 2 sources

                if (var8_2 == null) return;
                if (((bhd)var8_2).b() == false) return;
                var9_13 = ((bgb)this.b).c;
                synchronized (var9_13) {
                    ((bgb)this.b).f.put(AmbientLifecycleObserverKt.o((bhd)var8_2), var8_2);
                    var12_31 = this.b;
                    var11_29 = ((bgb)var12_31).j;
                    var10_24 = (juy)((bgb)var12_31).i.d;
                    var10_24 = bfa.a((bzb)var11_29, (bhd)var8_2, (juy)var10_24, (bew)var12_31);
                    ((bgb)this.b).g.put(AmbientLifecycleObserverKt.o((bhd)var8_2), var10_24);
                    return;
                }
            }
            case 9: {
                var8_2 = this.a;
                jse.e(var8_2, "$listenersList");
                var9_14 = var8_2.iterator();
                while (var9_14.hasNext() != false) {
                    var8_2 = this.b;
                    ((bmm)var9_14.next()).a(((bfs)var8_2).d);
                }
                return;
            }
            case 8: {
                var8_2 = this.b;
                ((bec)this.a).a.A((bzb)var8_2, 3);
                return;
            }
            case 7: {
                bbi.a();
                var1_6 = bdz.d;
                var8_2 = (bhd)this.a;
                var9_15 = var8_2.b;
                ((bdz)this.b).a.c(new bhd[]{var8_2});
                return;
            }
            case 6: {
                var9_16 = this.a;
                var10_25 = this.b;
                var8_2 = ((bcn)var10_25).j;
                synchronized (var8_2) {
                    var10_25 = ((bcn)var10_25).i.iterator();
                    while (var10_25.hasNext() != false) {
                        ((bcc)var10_25.next()).a((bgs)var9_16, false);
                    }
                    return;
                }
            }
            case 5: {
                var9_17 = this.a;
                jse.e(var9_17, "$command");
                var8_2 = this.b;
                try {
                    var9_17.run();
                    return;
                }
                finally {
                    ((big)var8_2).a();
                }
            }
            case 4: {
                var8_2 = ((ata)this.b).b.g();
                if (!(var8_2 instanceof ate)) {
                    if (var8_2 != null) throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                    return;
                }
                var1_6 = ((ate)var8_2).d((String)this.a);
                if (var1_6 != -1) {
                    ((ata)this.b).b.Z(var1_6);
                    return;
                }
                var10_26 = this.b;
                var9_19 = this.a;
                var8_2.registerAdapterDataObserver(new asz((kf)var8_2, ((ata)var10_26).b, (String)var9_19));
                return;
            }
            case 3: {
                var10_27 = (ann)this.b;
                var8_2 = var10_27.h;
                var9_20 = this.a;
                var8_2 = var8_2 == null ? var9_20 : new aqa(-9223372036854775807L);
                var10_27.k = var8_2;
                var10_27.l = var9_20.a();
                var5_33 = var7_4;
                if (!var10_27.p) {
                    var5_33 = var7_4;
                    if (var9_20.a() == -9223372036854775807L) {
                        var5_33 = true;
                    }
                }
                var10_27.m = var5_33;
                if (var5_33) {
                    var1_6 = 7;
                }
                var10_27.n = var1_6;
                if (var10_27.j) {
                    var10_27.v.u(var10_27.l, var9_20.d(), var10_27.m);
                    return;
                }
                var10_27.r();
                return;
            }
            case 2: {
                var8_2 = this.a;
                this.b.a(var8_2);
                return;
            }
            case 1: {
                var10_28 = (aiy)this.b;
                var1_6 = var10_28.j;
                var9_21 = (ajb)this.a;
                var10_28.j = var1_6 -= var9_21.c;
                if (var9_21.d) {
                    var10_28.k = var9_21.e;
                    var10_28.l = true;
                }
                if (var1_6 != 0) return;
                var8_2 = var9_21.b.b;
                if (!var10_28.o.b.p() && var8_2.p()) {
                    var10_28.p = -1;
                }
                if (!var8_2.p()) {
                    var11_30 = Arrays.asList(((aia)var8_2).c);
                    var5_34 = var11_30.size() == var10_28.h.size();
                    abr.f(var5_34);
                    for (var1_6 = 0; var1_6 < var11_30.size(); ++var1_6) {
                        ((aix)var10_28.h.get((int)var1_6)).a = (aew)var11_30.get(var1_6);
                    }
                }
                if (!var10_28.l) ** GOTO lbl233
                var5_34 = var6_5;
                if (var9_21.b.c.equals(var10_28.o.c)) {
                    var5_34 = var9_21.b.e != var10_28.o.s ? var6_5 : false;
                }
                if (var5_34) {
                    if (!var8_2.p() && !var9_21.b.c.b()) {
                        var11_30 = var9_21.b;
                        var12_32 = var11_30.c;
                        var3_3 = var11_30.e;
                        var10_28.v((aew)var8_2, var12_32);
                    } else {
                        var3_3 = var9_21.b.e;
                    }
                }
                ** GOTO lbl235
lbl233:
                // 1 sources

                var3_3 = -9223372036854775807L;
                var5_34 = false;
lbl235:
                // 3 sources

                var10_28.l = false;
                var10_28.u(var9_21.b, 1, var5_34, var10_28.k, var3_3);
                return;
            }
            case 0: {
                ((aie)this.b).a();
                var1_6 = agf.a;
                var9_22 = (aiv)((bxt)this.a).b;
                var8_2 = var9_22.a.q;
                var8_2.u(var8_2.r(var8_2.b.d), 1013, new akd(20));
                var8_2 = var9_22.a;
                return;
            }
        }
        var8_2.a(var9_7);
    }
}

