/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 */
import android.content.Context;
import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

public final class cxt {
    public final Object a;

    public cxt() {
        this.a = fvd.ap(new bpr(8));
    }

    public cxt(Context context) {
        this.a = context.getApplicationContext();
    }

    public cxt(Context context, byte[] byArray) {
        this.a = context.getApplicationContext();
    }

    public cxt(Context context, char[] cArray) {
        new ConcurrentHashMap();
        boolean bl2 = context != null;
        fvc.H(bl2, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public cxt(cgw cgw2) {
        jse.e(cgw2, "clock");
        this.a = new hdu(new gza(100));
    }

    public cxt(Object object) {
        this.a = object;
    }

    public cxt(Object object, byte[] byArray) {
        this.a = object;
    }

    public cxt(Matcher matcher) {
        fxf.K(matcher);
        this.a = matcher;
    }

    public cxt(jnu jnu2) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public cxt(byte[] byArray) {
        this.a = new ConcurrentHashMap();
        int n2 = Process.myPid();
        this.b(new cqx("Main", 1, true)).d(n2);
    }

    public cxt(byte[] byArray, byte[] byArray2) {
        this.a = new hou();
    }

    public cxt(char[] cArray) {
        this.a = new AtomicInteger();
    }

    public final void A(ebt ebt2) {
        jse.e(ebt2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ecx)hyg2.b;
        ecx ecx2 = ecx.a;
        ebt2.getClass();
        ((ecx)hyg2).c = ebt2;
        ((ecx)hyg2).b |= 1;
    }

    public final hpn B(Callable callable, Executor executor) {
        callable = gqk.j(callable);
        return ((iuv)this.a).a(callable, executor);
    }

    public final hpn C(hnx hnx2, Executor executor) {
        hnx2 = gqk.c(hnx2);
        return ((iuv)this.a).b(hnx2, executor);
    }

    public final grf D(hnx hnx2, Executor executor) {
        return grf.g(((cxt)this.a).C(hnx2, executor));
    }

    public final hpn E(Callable callable, Executor executor) {
        callable = gqk.j(callable);
        return ((hou)this.a).a(callable, executor);
    }

    public final hpn F(hnx hnx2, Executor executor) {
        hnx2 = gqk.c(hnx2);
        return ((hou)this.a).b(hnx2, executor);
    }

    public final hac G() {
        fxf.r(true, "SharedPreferencesView#getAll() not available on key migration");
        return hac.i(this.a.getAll());
    }

    public final long H(String string) {
        return this.a.getLong(string, 0L);
    }

    public final /* synthetic */ euk I() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (euk)hwv2;
    }

    public final void J(edf edf2) {
        jse.e(edf2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (euk)hyg2.b;
        euk euk2 = euk.a;
        edf2.getClass();
        ((euk)hyg2).d = edf2;
        ((euk)hyg2).b |= 2;
    }

    public final void K(ear ear2) {
        jse.e(ear2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (euk)hyg2.b;
        euk euk2 = euk.a;
        ear2.getClass();
        ((euk)hyg2).c = ear2;
        ((euk)hyg2).b |= 1;
    }

    public final /* synthetic */ esf L() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (esf)hwv2;
    }

    public final void M(ese ese2) {
        jse.e(ese2, "value");
        Object object = this.a;
        hyg hyg2 = (hwp)object;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        object = (esf)((hwr)object).b;
        hyg2 = esf.a;
        ese2.getClass();
        ((esf)object).c = ese2;
        ((esf)object).b |= 1;
    }

    public final /* synthetic */ erv N() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (erv)hwv2;
    }

    public final void O(eqz eqz2) {
        jse.e(eqz2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        erv erv2 = (erv)hyg2.b;
        hyg2 = erv.a;
        erv2.c = eqz2.g;
        erv2.b |= 1;
    }

    public final void P(eqw eqw2) {
        jse.e(eqw2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (erv)hyg2.b;
        erv erv2 = erv.a;
        ((erv)hyg2).e = eqw2.c;
        ((erv)hyg2).b |= 4;
    }

    public final void Q(String string) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (erv)hyg2.b;
        erv erv2 = erv.a;
        ((erv)hyg2).b |= 2;
        ((erv)hyg2).d = string;
    }

    public final ctc a() {
        return (ctc)this.a.a();
    }

    public final cqz b(cqx cqx2) {
        cra cra2 = new cra(cqx2);
        this.a.put(cqx2, cra2);
        return cra2;
    }

    public final /* synthetic */ dzm c() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (dzm)hwv2;
    }

    public final void d(hvu hvu2) {
        jse.e(hvu2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        dzm dzm2 = (dzm)hyg2.b;
        hyg2 = dzm.a;
        hvu2.getClass();
        dzm2.b |= 1;
        dzm2.c = hvu2;
    }

    public final /* synthetic */ dzn e() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (dzn)hwv2;
    }

    public final void f(dzm dzm2) {
        jse.e(dzm2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (dzn)hyg2.b;
        dzn dzn2 = dzn.a;
        dzm2.getClass();
        ((dzn)hyg2).d = dzm2;
        ((dzn)hyg2).c = 1;
    }

    public final void g(dzt dzt2) {
        jse.e(dzt2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (dzn)hyg2.b;
        dzn dzn2 = dzn.a;
        dzt2.getClass();
        ((dzn)hyg2).d = dzt2;
        ((dzn)hyg2).c = 2;
    }

    public final void h(long l2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (dzn)hyg2.b;
        dzn dzn2 = dzn.a;
        ((dzn)hyg2).b |= 2;
        ((dzn)hyg2).f = l2;
    }

    public final void i(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        dzn dzn2 = (dzn)hyg2.b;
        hyg2 = dzn.a;
        dzn2.b |= 4;
        dzn2.g = n2;
    }

    public final /* synthetic */ ebw j() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ebw)hwv2;
    }

    public final void k(String string) {
        jse.e(string, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ebw ebw2 = (ebw)hyg2.b;
        hyg2 = ebw.a;
        string.getClass();
        ebw2.b |= 2;
        ebw2.d = string;
    }

    public final void l(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ebw)hyg2.b;
        ebw ebw2 = ebw.a;
        ((ebw)hyg2).b |= 4;
        ((ebw)hyg2).e = n2;
    }

    public final void m(ecd ecd2) {
        jse.e(ecd2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ebw ebw2 = (ebw)hyg2.b;
        hyg2 = ebw.a;
        ebw2.c = ecd2.k;
        ebw2.b |= 1;
    }

    public final /* synthetic */ efx n() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (efx)hwv2;
    }

    public final void o(eae eae2) {
        jse.e(eae2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        efx efx2 = (efx)hyg2.b;
        hyg2 = efx.a;
        eae2.getClass();
        efx2.e = eae2;
        efx2.b |= 1;
    }

    public final void p(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        efx efx2 = (efx)hyg2.b;
        hyg2 = efx.a;
        efx2.b |= 0x20;
        efx2.j = n2;
    }

    public final void q(int n2, efw object) {
        jse.e(object, "type");
        hyg hyg2 = efv.a.l();
        jse.e(hyg2, "builder");
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        efv efv2 = (efv)hyg2.b;
        efv2.b |= 1;
        efv2.c = n2;
        jse.e(object, "value");
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        efv2 = (efv)hyg2.b;
        efv2.d = ((efw)object).f;
        efv2.b |= 2;
        long l2 = cgw.p().toEpochMilli();
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        object = this.a;
        efv2 = (efv)hyg2.b;
        efv2.b |= 4;
        efv2.e = l2;
        hyg2 = hyg2.o();
        jse.d(hyg2, "build(...)");
        object.add((efv)hyg2);
    }

    public final /* synthetic */ edp r() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (edp)hwv2;
    }

    public final void s(eyf eyf2) {
        jse.e(eyf2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (edp)hyg2.b;
        edp edp2 = edp.a;
        ((edp)hyg2).d = eyf2.a();
        ((edp)hyg2).b |= 2;
    }

    public final void t(edq edq2) {
        jse.e(edq2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (edp)hyg2.b;
        edp edp2 = edp.a;
        edq2.getClass();
        ((edp)hyg2).c = edq2;
        ((edp)hyg2).b |= 1;
    }

    public final /* synthetic */ eas u() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eas)hwv2;
    }

    public final void v(ebq ebq2) {
        jse.e(ebq2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eas eas2 = (eas)hyg2.b;
        hyg2 = eas.a;
        ebq2.getClass();
        eas2.c = ebq2;
        eas2.b |= 1;
    }

    public final void w(ebv ebv2) {
        jse.e(ebv2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eas eas2 = (eas)hyg2.b;
        hyg2 = eas.a;
        eas2.d = ebv2.s;
        eas2.b |= 2;
    }

    public final /* synthetic */ edf x() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (edf)hwv2;
    }

    public final void y(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (edf)hyg2.b;
        edf edf2 = edf.a;
        ((edf)hyg2).b |= 1;
        ((edf)hyg2).c = n2;
    }

    public final /* synthetic */ ecx z() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ecx)hwv2;
    }
}

