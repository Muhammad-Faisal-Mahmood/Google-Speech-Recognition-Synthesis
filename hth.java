/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.content.SharedPreferences
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.graphics.Rect
 *  android.net.Uri
 *  android.os.CancellationSignal
 *  gda
 *  gkd
 *  gqv
 */
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.CancellationSignal;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class hth {
    public final Object a;
    public final Object b;

    public hth() {
        this.b = new ArrayList();
        this.a = new fwj();
    }

    public hth(SharedPreferences sharedPreferences) {
        this.a = new ArrayList();
        this.b = sharedPreferences;
    }

    public hth(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        this.a = new CancellationSignal();
    }

    public hth(fdo fdo2) {
        this.b = new AtomicBoolean();
        this.a = fdo2;
    }

    public hth(gpc gpc2, gqr gqr2) {
        this.a = gpc2;
        this.b = gqr2;
    }

    public hth(gto gto2, gto gto3) {
        jse.e(gto2, "enableTikTokExceptionHandlerV2");
        jse.e(gto3, "crashOnExecutorException");
        this.b = gto2;
        this.a = gto3;
    }

    public hth(hac hac2, gft gft2) {
        jse.e(hac2, "pendingExperimentValues");
        this.b = hac2;
        this.a = gft2;
    }

    public hth(hth hth2, cya cya2) {
        gda gda2 = gda.a;
        fxf.K(gda2);
        this.a = hth2;
        this.b = cya2;
    }

    public hth(iyh iyh2, iwx iwx2) {
        fxf.B(iyh2.g() ^ true, "Error status must not be OK");
        this.a = iyh2;
        this.b = iwx2;
    }

    public hth(Object object, Object object2) {
        this.b = object;
        this.a = object2;
    }

    public hth(Object object, Object object2, byte[] byArray) {
        this.a = object;
        this.b = object2;
    }

    public hth(Set set) {
        new Random();
        this.b = set;
        this.a = new ArrayList(2);
    }

    public hth(jnu jnu2) {
        this.b = new HashMap();
        this.a = jnu2;
    }

    public hth(jnu jnu2, Executor executor) {
        this.a = executor;
        this.b = jnu2;
    }

    public hth(byte[] byArray, byte[] byArray2) {
        this.b = new Rect();
        this.a = new Rect();
    }

    public hth(char[] cArray) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static String f(int n2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(".");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String g(fym fym2, String string) {
        return hth.f(fym2.a, string);
    }

    public static void n() {
        if (!Thread.interrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void o(Cursor cursor) {
        try {
            Object[] objectArray = cursor.getColumnNames();
            Arrays.toString(objectArray);
            while (cursor.moveToNext()) {
                int n2;
                for (int i2 = 0; i2 < (n2 = objectArray.length); ++i2) {
                    try {
                        cursor.getString(i2);
                        continue;
                    }
                    catch (Exception exception) {
                        if (cursor.getType(i2) != 4) continue;
                        n2 = cursor.getBlob(i2).length;
                    }
                }
            }
            if (cursor == null) return;
        }
        catch (Throwable throwable) {
            if (cursor == null) throw throwable;
            try {
                cursor.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
        cursor.close();
    }

    public final Uri a(gkf gkf2, gkd gkd2) {
        fxf.K(gkd2);
        fxf.r(true, "getMobStoreUri() does not support suffixes");
        String string = String.valueOf(gkf2.a).concat(".pb");
        gkd2 = gda.a;
        return ((goi)this.b).g(gkf2.c, string, (gda)gkd2);
    }

    public final jqf b(ScheduledExecutorService object) {
        jse.e(object, "executor");
        fxf fxf2 = new fxf();
        jse.e(object, "executor");
        if (((Boolean)((gto)this.b).e(true)).booleanValue() && ((Boolean)((gto)this.a).e(false)).booleanValue()) {
            object = new jwb(new gdm((ScheduledExecutorService)object)).plus(gdl.a);
        } else {
            object = new gdj((ScheduledExecutorService)object);
            object = new jwb((Executor)object).plus((jqf)object);
        }
        return object.plus(fxf.aA(fxf2, false, 6));
    }

    public final gzx c(boolean bl2) {
        hdc hdc2 = hdc.a;
        boolean bl3 = hdc2 != null;
        fxf.q(bl3);
        gzs gzs2 = new gzs();
        Object object = (goi)this.a;
        object = hav.r(((goi)object).h(1, 2), ((goi)object).h(1, 1), ((goi)object).h(2, 2), ((goi)object).h(2, 1)).k();
        while (object.hasNext()) {
            Object[] objectArray = new File((File)object.next(), "accounts").listFiles(new gaq(hdc2, bl2));
            if (objectArray == null) continue;
            gzs2.i(objectArray);
        }
        return gzs2.g();
    }

    public final int d() {
        return this.b.getInt("count", 0);
    }

    public final String e(fym fym2, String string) {
        return this.b.getString(hth.g(fym2, string), null);
    }

    public final boolean h(fym fym2, String string) {
        return this.b.getBoolean(hth.g(fym2, string), false);
    }

    public final hac i() {
        Object object = ((imj)this.b).a();
        gzy gzy2 = new gzy();
        object = object.iterator();
        while (object.hasNext()) {
            fzl fzl2 = (fzl)object.next();
            fxf.r(fzl2.a.isEmpty() ^ true, "AccountProvider's account type cannot be an empty string.");
            gzy2.d(fzl2.a, fzl2.b);
        }
        return gzy2.b();
    }

    public final void j(gda object) {
        fxf.K(object);
        object = fxf.aq("onBeforeNoAccountAvailable");
        try {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                fyr fyr2 = (fyr)iterator.next();
                if (!(fyr2 instanceof fys)) continue;
                ((fys)fyr2).b();
            }
            for (fyr fyr2 : (ArrayList)this.a) {
                if (!(fyr2 instanceof fys)) continue;
                ((fys)fyr2).b();
            }
            return;
        }
        finally {
            ((gol)object).close();
        }
    }

    public final void k(gda object) {
        fxf.K(object);
        object = fxf.aq("onBeforeAccountLoading");
        try {
            Object object22 = this.b.iterator();
            while (object22.hasNext()) {
                fyr fyr2 = (fyr)object22.next();
                if (!(fyr2 instanceof fys)) continue;
                ((fys)fyr2).a();
            }
            for (Object object22 : (ArrayList)this.a) {
                if (!(object22 instanceof fys)) continue;
                ((fys)object22).a();
            }
            return;
        }
        finally {
            ((gol)object).close();
        }
    }

    public final void l(gda object, fze object22) {
        fxf.K(object);
        object = fxf.aq("onBeforeActivityAccountReady");
        try {
            object22 = ((fze)object22).i;
            object22 = this.b.iterator();
            while (object22.hasNext()) {
                fyr fyr2 = (fyr)object22.next();
                if (!(fyr2 instanceof fys)) continue;
                ((fys)fyr2).c();
            }
            for (Object object22 : (ArrayList)this.a) {
                if (!(object22 instanceof fys)) continue;
                ((fys)object22).c();
            }
            return;
        }
        finally {
            ((gol)object).close();
        }
    }

    public final void m(ValueAnimator valueAnimator) {
        fvd fvd2 = new fvd();
        valueAnimator.addListener((Animator.AnimatorListener)this.a);
        ((ArrayList)this.b).add(fvd2);
    }

    public final ezj p(String string) {
        return (ezj)((HashMap)this.b).get(string);
    }

    public final Optional q(String string) {
        return (Optional)((HashMap)this.a).get(string);
    }

    public final void r(String string) {
        ((HashMap)this.a).remove(string);
        ((HashMap)this.b).remove(string);
    }

    public final frr s(gkf gkf2, bmu object) {
        fxf.B(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        fxf.B(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        Object object2 = gkf2.g;
        Executor executor = object2;
        if (object2 == null) {
            executor = (Executor)this.a.b();
        }
        Object object3 = gsl.a;
        object2 = hhk.K("");
        ((gto)object3).e(object2);
        object3 = fxf.aj((hpn)object2, new ffp(this, gkf2, 5, null), executor);
        String string = gkf2.a;
        hyf hyf2 = gkf2.b;
        object2 = gkf2.e;
        object = fvc.Q(string, (hpn)object3, hyf2, hwj.a(), executor, (gto)object2, (bmu)object);
        if (!gkf2.d.isEmpty()) {
            ((frr)object).c(new frf(gkf2.d, executor));
        }
        return object;
    }

    public final void t(hth objectArray) {
        hth.n();
        gol gol2 = fxf.as("execSQL: ".concat((String)objectArray.b), gqv.a);
        try {
            Object object = this.b;
            Object object2 = objectArray.b;
            objectArray = (Object[])objectArray.a;
            object2 = (String)object2;
            ((SQLiteDatabase)object).execSQL((String)object2, objectArray);
            return;
        }
        finally {
            gol2.close();
        }
    }
}

