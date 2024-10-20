/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ApplicationExitInfo
 *  android.content.Context
 *  android.os.Build$VERSION
 *  hom
 */
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

final class doa
implements dny {
    private final Context a;
    private final dkm b;
    private final jnu c;
    private final jnu d;

    public doa(Context context, dkm dkm2, jnu jnu2, jnu jnu3) {
        this.a = context;
        this.b = dkm2;
        this.c = jnu2;
        this.d = jnu3;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public hpn a(int n2, int n3, String string, long l2) {
        Object object = (ActivityManager)this.a.getSystemService("activity");
        fxf.K(object);
        List list = sk$$ExternalSyntheticApiModelOutline1.m((ActivityManager)object, this.a.getPackageName(), 0, 0);
        object = new gzs();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object2;
            kcy kcy2;
            block46: {
                list = sk$$ExternalSyntheticApiModelOutline1.m(iterator.next());
                if (sk$$ExternalSyntheticApiModelOutline1.m$1((ApplicationExitInfo)list).equals(string)) {
                    if (sk$$ExternalSyntheticApiModelOutline1.m((ApplicationExitInfo)list) == l2) return hno.f(hhk.H(((gzs)object).g()), new cxc(17), (Executor)hom.a);
                }
                kcy2 = (kcy)kcz.a.l();
                Object object3 = sk$$ExternalSyntheticApiModelOutline1.m$1((ApplicationExitInfo)list);
                if (!kcy2.b.B()) {
                    kcy2.u();
                }
                object2 = (kcz)kcy2.b;
                object3.getClass();
                ((kcz)object2).b |= 1;
                ((kcz)object2).c = object3;
                n2 = sk$$ExternalSyntheticApiModelOutline1.m$3((ApplicationExitInfo)list);
                if (!kcy2.b.B()) {
                    kcy2.u();
                }
                object2 = (kcz)kcy2.b;
                ((kcz)object2).b |= 4;
                ((kcz)object2).e = n2;
                long l3 = sk$$ExternalSyntheticApiModelOutline1.m((ApplicationExitInfo)list);
                if (!kcy2.b.B()) {
                    kcy2.u();
                }
                object2 = (kcz)kcy2.b;
                ((kcz)object2).b |= 0x10;
                ((kcz)object2).g = l3;
                l3 = sk$$ExternalSyntheticApiModelOutline1.m$1((ApplicationExitInfo)list);
                if (!kcy2.b.B()) {
                    kcy2.u();
                }
                object2 = (kcz)kcy2.b;
                ((kcz)object2).b |= 0x40;
                ((kcz)object2).i = l3;
                l3 = sk$$ExternalSyntheticApiModelOutline1.m$2((ApplicationExitInfo)list);
                if (!kcy2.b.B()) {
                    kcy2.u();
                }
                object2 = (kcz)kcy2.b;
                ((kcz)object2).b |= 0x80;
                ((kcz)object2).j = l3;
                boolean bl2 = sk$$ExternalSyntheticApiModelOutline1.m();
                if (!kcy2.b.B()) {
                    kcy2.u();
                }
                object2 = (kcz)kcy2.b;
                ((kcz)object2).b |= 0x100;
                ((kcz)object2).k = bl2;
                switch (sk$$ExternalSyntheticApiModelOutline1.m((ApplicationExitInfo)list)) {
                    default: {
                        n2 = 0;
                        break;
                    }
                    case 14: {
                        n2 = 100;
                        break;
                    }
                    case 13: {
                        n2 = 14;
                        break;
                    }
                    case 12: {
                        n2 = 13;
                        break;
                    }
                    case 11: {
                        n2 = 12;
                        break;
                    }
                    case 10: {
                        n2 = 11;
                        break;
                    }
                    case 9: {
                        n2 = 10;
                        break;
                    }
                    case 8: {
                        n2 = 9;
                        break;
                    }
                    case 7: {
                        n2 = 8;
                        break;
                    }
                    case 6: {
                        n2 = 7;
                        break;
                    }
                    case 5: {
                        n2 = 6;
                        break;
                    }
                    case 4: {
                        n2 = 5;
                        break;
                    }
                    case 3: {
                        n2 = 4;
                        break;
                    }
                    case 2: {
                        n2 = 3;
                        break;
                    }
                    case 1: {
                        n2 = 2;
                        break;
                    }
                    case 0: {
                        n2 = 15;
                    }
                }
                if (n2 != 0) {
                    if (!kcy2.b.B()) {
                        kcy2.u();
                    }
                    object2 = (kcz)kcy2.b;
                    ((kcz)object2).d = n2 - 1;
                    ((kcz)object2).b |= 2;
                    n3 = n2;
                } else {
                    n3 = 0;
                }
                n2 = sk$$ExternalSyntheticApiModelOutline1.m$1((ApplicationExitInfo)list);
                n2 = n2 != 100 ? (n2 != 125 ? (n2 != 200 ? (n2 != 230 ? (n2 != 300 ? (n2 != 325 ? (n2 != 350 ? (n2 != 400 ? (n2 != 1000 ? 0 : 10) : 9) : 7) : 4) : 8) : 6) : 5) : 3) : 2;
                if (n2 != 0) {
                    if (!kcy2.b.B()) {
                        kcy2.u();
                    }
                    object2 = (kcz)kcy2.b;
                    ((kcz)object2).f = n2 - 1;
                    ((kcz)object2).b |= 8;
                }
                if (n3 == 7 && Build.VERSION.SDK_INT >= 33 && ((Boolean)this.c.b()).booleanValue()) {
                    block45: {
                        object2 = sk$$ExternalSyntheticApiModelOutline1.m((ApplicationExitInfo)list);
                        object3 = sk$$ExternalSyntheticApiModelOutline1.m((ApplicationExitInfo)list);
                        if (object2 != null && !fxf.P((String)object3)) {
                            long l4;
                            hvu hvu2 = hvu.u((InputStream)object2);
                            if ((Long)this.d.b() < 0L || (l4 = (long)hvu2.d()) <= (l3 = ((Long)this.d.b()).longValue())) {
                                hwp hwp2 = kcx.a.l();
                                if (!hwp2.b.B()) {
                                    hwp2.u();
                                }
                                hwv hwv2 = hwp2.b;
                                kcx kcx2 = (kcx)hwv2;
                                hvu2.getClass();
                                kcx2.b |= 2;
                                kcx2.d = hvu2;
                                if (!hwv2.B()) {
                                    hwp2.u();
                                }
                                hwv2 = (kcx)hwp2.b;
                                object3.getClass();
                                ((kcx)hwv2).b |= 1;
                                ((kcx)hwv2).c = object3;
                                object3 = (kcx)hwp2.o();
                                if (!kcy2.b.B()) {
                                    kcy2.u();
                                }
                                kcz kcz2 = (kcz)kcy2.b;
                                object3.getClass();
                                kcz2.l = object3;
                                kcz2.b |= 0x200;
                            }
                            break block45;
                        }
                        if (object2 == null) break block46;
                    }
                    ((InputStream)object2).close();
                    catch (Throwable throwable) {
                        if (object2 == null) throw throwable;
                        try {
                            ((InputStream)object2).close();
                            throw throwable;
                        }
                        catch (Throwable throwable2) {
                            try {
                                throwable.addSuppressed(throwable2);
                                throw throwable;
                            }
                            catch (IOException iOException) {
                                a.as(dkc.a.h(), "Failed to read ANR trace", "com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", '\u00b5', "ApplicationExitInfoCaptureImpl.java", iOException);
                            }
                        }
                    }
                }
            }
            object2 = this.b;
            sk$$ExternalSyntheticApiModelOutline1.m$2((ApplicationExitInfo)list);
            hzw.b(sk$$ExternalSyntheticApiModelOutline1.m((ApplicationExitInfo)list));
            ((gzs)object).h(hno.f(object2.a(), new dnz(this, kcy2), (Executor)hom.a));
        }
        return hno.f(hhk.H(((gzs)object).g()), new cxc(17), (Executor)hom.a);
    }

    public /* synthetic */ kcz b(kcy hyg2, gto object2) {
        if (!((gto)object2).g()) {
            hyg2 = (kcz)((hwp)hyg2).o();
        } else {
            for (Object object2 : ((dkl)((gto)object2).c()).b) {
                int n2 = ((dkj)object2).b;
                int n3 = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? 0 : 2) : 1) : 3;
                if (n3 != 0) {
                    if (n3 - 1 != 1) continue;
                    object2 = n2 == 2 ? (dkk)((dkj)object2).c : dkk.a;
                    hwv hwv2 = ((dkk)object2).b;
                    object2 = hwv2;
                    if (hwv2 == null) {
                        object2 = hzb.a;
                    }
                    long l2 = hzw.a((hzb)object2);
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    object2 = (kcz)((kcy)hyg2).b;
                    hwv2 = kcz.a;
                    ((kcz)object2).b |= 0x20;
                    ((kcz)object2).h = l2;
                    continue;
                }
                throw null;
            }
            hyg2 = (kcz)((hwp)hyg2).o();
        }
        return hyg2;
    }
}

