/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.AccountManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.net.Uri
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public final class cxu {
    public final Object a;
    public final Object b;

    public cxu() {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public cxu(Context context) {
        this.b = context.getPackageName();
        this.a = AccountManager.get((Context)context);
    }

    public cxu(Uri uri, ProviderInfo providerInfo) {
        this.a = uri;
        this.b = providerInfo;
    }

    public cxu(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.b = new HashMap();
        this.a = ambientMode$AmbientController;
    }

    public cxu(bmu bmu2, Context context) {
        this.b = bmu2;
        this.a = context;
    }

    public cxu(bql bql2, gto gto2) {
        jse.e(bql2, "enqueueStatus");
        hwp hwp2 = bqm.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        bqm bqm2 = (bqm)hwp2.b;
        bqm2.c = bql2.f;
        bqm2.b |= 1;
        this.b = (bqm)hwp2.o();
        this.a = gto2;
    }

    public cxu(gto gto2, gui gui2) {
        this.a = gto2;
        this.b = fvd.ap(gui2);
    }

    public cxu(Class clazz, Object object) {
        this.a = clazz;
        this.b = object;
    }

    public cxu(jnu jnu2, jnu jnu3) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
    }

    public cxu(jnu jnu2, jnu jnu3, byte[] byArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
    }

    public cxu(byte[] byArray) {
        this.b = new WeakHashMap();
        this.a = new dky(this);
    }

    public static cxu b(long l2) {
        return new cxu(Long.TYPE, l2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ker d(boolean bl2, dlu object) {
        Throwable throwable422222;
        ker ker2;
        block16: {
            hwp hwp2 = ker.a.l();
            long l2 = Process.getElapsedCpuTime();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            Object object2 = hwp2.b;
            ker2 = (ker)object2;
            ker2.b |= 1;
            ker2.c = l2;
            if (!((hwv)object2).B()) {
                hwp2.u();
            }
            object2 = (ker)hwp2.b;
            ((ker)object2).b |= 2;
            ((ker)object2).d = bl2;
            int n2 = Thread.activeCount();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ker)hwp2.b;
            ((ker)object2).b |= 4;
            ((ker)object2).e = n2;
            int n3 = Process.myPid();
            object2 = String.format(Locale.US, "/proc/%d/oom_score_adj", n3);
            ker2 = StrictMode.allowThreadDiskReads();
            RandomAccessFile randomAccessFile = new RandomAccessFile((String)object2, "r");
            object2 = gto.h(randomAccessFile.readLine());
            cxc cxc2 = new cxc(19);
            object2 = ((gto)object2).b(cxc2);
            randomAccessFile.close();
            catch (Throwable throwable2) {
                try {
                    randomAccessFile.close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    try {
                        throwable2.addSuppressed(throwable3);
                        throw throwable2;
                    }
                    catch (Throwable throwable422222) {
                        break block16;
                    }
                    catch (IOException iOException) {
                        object2 = gsl.a;
                    }
                }
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)ker2);
            if (((gto)object2).g()) {
                n2 = (Integer)((gto)object2).c();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (ker)hwp2.b;
                ((ker)object2).b |= 0x10;
                ((ker)object2).g = n2;
            }
            object = !((dlu)object).a ? gsl.a : (gto)fvd.L(((dlu)object).a(), new dls(n3)).b(new cxc(15)).e(gsl.a);
            if (!((gto)object).g()) return (ker)hwp2.o();
            object = ((ComponentName)((gto)object).c()).flattenToString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ker)hwp2.b;
            object.getClass();
            ((ker)object2).b |= 0x20;
            ((ker)object2).h = object;
            return (ker)hwp2.o();
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)ker2);
        throw throwable422222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2, Status status) {
        Object object = this.a;
        synchronized (object) {
            Object object2 = new HashMap(this.a);
        }
        Object object3 = this.b;
        synchronized (object3) {
            object = new HashMap(this.b);
        }
        for (Object object2 : object2.entrySet()) {
            if (!bl2 && !((Boolean)object2.getValue()).booleanValue()) continue;
            ((BasePendingResult)object2.getKey()).h(status);
        }
        object = object.entrySet().iterator();
        while (object.hasNext()) {
            object3 = (Map.Entry)object.next();
            if (!bl2 && !((Boolean)object3.getValue()).booleanValue()) continue;
            ((bzo)object3.getKey()).d(new ccq(status));
        }
        return;
    }

    public final ker c() {
        dlu dlu2 = dlt.a((Context)this.a);
        return cxu.d(((bmu)this.b).H(dlu2), dlu2);
    }

    public final void e(File object, int n2) {
        Object object2;
        dco dco2;
        Object object3;
        block5: {
            block4: {
                object3 = ((File)object).getParentFile();
                fxf.K(object3);
                dco2 = new dco(((File)object3).getName(), ((File)object).getName());
                object2 = this.a;
                object3 = ((dfu)((AmbientMode$AmbientController)object2).a).c(dco2);
                if (object3 == null) break block4;
                object3 = ((dct)object3).a;
                break block5;
            }
            object3 = null;
        }
        try {
            ((dfu)((AmbientMode$AmbientController)object2).a).f.f((String)object3);
        }
        catch (IOException iOException) {
            ((hfk)((hfk)((hfk)ddd.a.g()).i(iOException)).j("com/google/android/libraries/micore/superpacks/gc/FileManager$FileRefTableListener", "onFileRefChanged", 1496, "FileManager.java")).u("Failed to delete released file %s", object);
        }
        object = ((AmbientMode$AmbientController)object2).a;
        object3 = new dft(dco2, n2, 0);
        ((dfu)object).g.a((dau)object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f(File file) {
        Object object = this.b;
        synchronized (object) {
            return this.b.containsKey(file);
        }
    }

    public final evl g(int n2, hpn hpn2, Runnable runnable, jnf jnf2) {
        hpn2.getClass();
        jvb jvb2 = (jvb)this.b.b();
        jvb2.getClass();
        Executor executor = (Executor)this.a.b();
        executor.getClass();
        return new evl(n2, hpn2, runnable, jnf2, jvb2, executor);
    }
}

