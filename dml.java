/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class dml {
    private static dml b;
    public final Object a;

    public dml() {
        this.a = new ArrayList();
    }

    public dml(int n2) {
        juc[] jucArray = new juc[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            jucArray[i2] = new juc(null, jud.a);
        }
        this.a = jucArray;
    }

    public dml(czh czh2) {
        jse.e(czh2, "clientsManager");
        this.a = czh2;
    }

    public dml(Object object) {
        this.a = object;
    }

    public dml(Object object, byte[] byArray) {
        this.a = object;
    }

    public dml(jnu jnu2) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public dml(jnu jnu2, byte[] byArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public dml(jnu jnu2, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public dml(jnu jnu2, char[] cArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public dml(byte[] byArray) {
        this.a = new AtomicInteger();
    }

    public dml(byte[] byArray, byte[] byArray2) {
        this.a = new juc(new kbm(8, false), jud.a);
    }

    public dml(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        this.a = new AtomicReference<Object>(null);
    }

    public dml(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        this.a = Collections.emptyList();
    }

    public dml(byte[] byArray, char[] cArray) {
        this.a = new LinkedHashMap();
    }

    public dml(char[] cArray) {
        this.a = new gza(20);
    }

    public dml(char[] cArray, byte[] byArray, byte[] byArray2) {
        this.a = new ArrayList(20);
    }

    public dml(short[] sArray) {
        this((byte[])null, (byte[])null);
    }

    public dml(short[] sArray, byte[] byArray) {
        this.a = new AtomicLong();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static dml Q() {
        synchronized (dml.class) {
            dml dml2;
            if (b != null) return b;
            b = dml2 = new dml(null, null, null, null);
            return b;
        }
    }

    public final boolean A(Object object) {
        kbm kbm2;
        int n2;
        while ((n2 = (kbm2 = (kbm)((juc)this.a).a).a(object)) != 0) {
            if (n2 != 1) {
                return false;
            }
            Object object2 = this.a;
            kbm kbm3 = kbm2.c();
            ((juc)object2).d(kbm2, kbm3);
        }
        return true;
    }

    public final juc B(int n2) {
        return ((juc[])this.a)[n2];
    }

    public final jjv C() {
        return new jjv((jjt)this.a);
    }

    public final long D(long l2) {
        return ((AtomicLong)this.a).addAndGet(l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List E() {
        synchronized (this) {
            return this.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void F() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final long G() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45410230").a();
    }

    public final long H() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45407723").a();
    }

    public final boolean I() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45656570").d();
    }

    public final boolean J() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45625547").d();
    }

    public final boolean K() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45531009").d();
    }

    public final boolean L() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45459633").d();
    }

    public final boolean M() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45386178").d();
    }

    public final boolean N() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45408541").d();
    }

    public final boolean O() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45622795").d();
    }

    public final boolean P() {
        return ((AmbientModeSupport$AmbientController)this.a.b()).g("com.google.android.apps.search.transcription.device 45615079").d();
    }

    public final dsj a(float f2) {
        Random random = (Random)this.a.b();
        random.getClass();
        return new dsj(random, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string, dxk dxk2) {
        synchronized (this) {
            dyd dyd2 = new dyd(string, dxk2);
            this.a.add(dyd2);
            return;
        }
    }

    public final int c() {
        return ((AtomicInteger)this.a).get();
    }

    public final /* synthetic */ eaz d() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eaz)hwv2;
    }

    public final void e(ebd ebd2) {
        jse.e(ebd2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eaz)hyg2.b;
        eaz eaz2 = eaz.a;
        ebd2.getClass();
        ((eaz)hyg2).c = ebd2;
        ((eaz)hyg2).b = 1;
    }

    public final /* synthetic */ eax f() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eax)hwv2;
    }

    public final void g(ebo ebo2) {
        jse.e(ebo2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eax)hyg2.b;
        eax eax2 = eax.a;
        ((eax)hyg2).c = ebo2.z;
        ((eax)hyg2).b |= 1;
    }

    public final /* synthetic */ eaw h() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eaw)hwv2;
    }

    public final void i(eaz eaz2) {
        jse.e(eaz2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eaw)hyg2.b;
        eaw eaw2 = eaw.a;
        eaz2.getClass();
        ((eaw)hyg2).c = eaz2;
        ((eaw)hyg2).b |= 1;
    }

    public final /* synthetic */ eav j() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eav)hwv2;
    }

    public final void k(ebg ebg2) {
        jse.e(ebg2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eav)hyg2.b;
        eav eav2 = eav.a;
        ((eav)hyg2).c = ebg2.J;
        ((eav)hyg2).b |= 1;
    }

    public final enl l(eip eip2, eae eae2) {
        bmu bmu2 = (bmu)this.a;
        return new enl(eip2, eae2, ((edz)bmu2.b).a(), ((emh)bmu2.a).a(), (Optional)((imc)bmu2.c).a);
    }

    public final enk m(eip eip2, eae eae2) {
        eqe eqe2 = (eqe)this.a;
        return new enk(eip2, eae2, ((edz)eqe2.a).a(), (gto)((imc)eqe2.b).a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(int n2) {
        synchronized (this) {
            ((gze)this.a).add((Object)n2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean o(int n2) {
        synchronized (this) {
            return ((gze)this.a).contains(n2);
        }
    }

    public final /* synthetic */ kcp p() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (kcp)hwv2;
    }

    public final void q(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcp)hyg2.b;
        kcp kcp2 = kcp.a;
        ((kcp)hyg2).b |= 4;
        ((kcp)hyg2).e = n2;
    }

    public final /* synthetic */ kcs r() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (kcs)hwv2;
    }

    public final void s(kcm kcm2) {
        jse.e(kcm2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        kcs kcs2 = (kcs)hyg2.b;
        hyg2 = kcs.a;
        kcm2.getClass();
        kcs2.g = kcm2;
        kcs2.b |= 0x10;
    }

    public final void t(kcn kcn2) {
        jse.e(kcn2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcs)hyg2.b;
        kcs kcs2 = kcs.a;
        ((kcs)hyg2).d = kcn2.K;
        ((kcs)hyg2).b |= 2;
    }

    public final void u(kco kco2) {
        jse.e(kco2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcs)hyg2.b;
        kcs kcs2 = kcs.a;
        ((kcs)hyg2).c = kco2.d;
        ((kcs)hyg2).b |= 1;
    }

    public final void v(kcp kcp2) {
        jse.e(kcp2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcs)hyg2.b;
        kcs kcs2 = kcs.a;
        kcp2.getClass();
        ((kcs)hyg2).e = kcp2;
        ((kcs)hyg2).b |= 4;
    }

    public final /* synthetic */ kcm w() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (kcm)hwv2;
    }

    public final int x() {
        long l2 = ((kbm)((juc)this.a).a).b.b;
        return (int)((l2 & 0xFFFFFFFC0000000L) >> 30) - (int)(0x3FFFFFFFL & l2) & 0x3FFFFFFF;
    }

    public final Object y() {
        kbm kbm2;
        Object object;
        while ((object = (kbm2 = (kbm)((juc)this.a).a).b()) == kbm.a) {
            object = this.a;
            kbm kbm3 = kbm2.c();
            ((juc)object).d(kbm2, kbm3);
        }
        return object;
    }

    public final void z() {
        kbm kbm2;
        while (!(kbm2 = (kbm)((juc)this.a).a).d()) {
            Object object = this.a;
            kbm kbm3 = kbm2.c();
            ((juc)object).d(kbm2, kbm3);
        }
        return;
    }
}

