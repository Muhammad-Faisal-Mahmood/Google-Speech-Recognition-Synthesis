/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class bng {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public bng(bnf bnf2) {
        this.b = null;
        this.c = null;
        this.d = bnf2.a;
        this.a = bnf2.b;
    }

    public bng(gky gky2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, hpq hpq2, gto gto2) {
        this.b = gky2;
        this.c = ambientModeSupport$AmbientController;
        this.d = hpq2;
        this.a = (Boolean)gto2.e(false);
    }

    public bng(String string, byte[][] byArray, boolean bl2, Date date) {
        this.b = string;
        this.d = byArray;
        this.a = bl2;
        this.c = date;
    }

    public bng(boolean bl2, Set set, dwf dwf2, dwf dwf3) {
        this.a = bl2;
        this.d = set;
        this.b = dwf2;
        this.c = dwf3;
    }

    /*
     * WARNING - void declaration
     */
    public final Object a(String string, String object) {
        void var2_5;
        try {
            object = this.b.a(object);
            return object;
        }
        catch (IOException iOException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        Log.e((String)"PhenotypeCombinedFlags", (String)"Invalid Phenotype flag value for flag ".concat(string), (Throwable)var2_5);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dvr b(dua object, String string) {
        boolean bl2 = this.a;
        Object object2 = this.d;
        Object object3 = dvr.g;
        dvq dvq2 = new dvq((dua)object, string, bl2, (Set)object2);
        gtp gtp2 = new gtp(string, "");
        dvr dvr2 = (dvr)object3.a.get(gtp2);
        object2 = dvr2;
        if (dvr2 == null) {
            object2 = dvq2.a();
            dvr2 = (dvr)object3.a.putIfAbsent(gtp2, object2);
            if (dvr2 == null) {
                dvr2 = ((dua)object).c;
                object = new AmbientMode$AmbientController(object2, null);
                dwa.c.putIfAbsent(gtp2, object);
                if (!dwa.b) {
                    object = dwa.a;
                    synchronized (object) {
                        if (!dwa.b && !Objects.equals(dvr2.getPackageName(), "com.google.android.gms")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                object3 = new dwa();
                                dvq2 = new IntentFilter("com.google.android.gms.phenotype.UPDATE");
                                ag$$ExternalSyntheticApiModelOutline0.m((Context)dvr2, (BroadcastReceiver)object3, (IntentFilter)dvq2, 2);
                            } else {
                                object3 = new dwa();
                                dvq2 = new IntentFilter("com.google.android.gms.phenotype.UPDATE");
                                dvr2.registerReceiver((BroadcastReceiver)object3, (IntentFilter)dvq2);
                            }
                            dwa.b = true;
                        }
                    }
                }
                Objects.requireNonNull(object2);
                object = new dty(object2, 7);
                dvv.a.putIfAbsent(gtp2, object);
            } else {
                object2 = dvr2;
            }
        }
        object = (dvr)object2;
        bl2 = ((dvr)object).d;
        fxf.v(true, "Package %s cannot be registered both with and without stickyAccountSupport", string);
        return object;
    }

    public final hpn c(Set set, long l2, Map map) {
        if (this.a) {
            return hhk.K(hcy.a);
        }
        return hno.f(((gky)this.b).b(), gqk.b(new gll(this, map, set, l2)), (Executor)this.d);
    }
}

