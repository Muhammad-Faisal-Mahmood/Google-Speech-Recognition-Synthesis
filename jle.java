/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class jle {
    private static jle e;
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;

    private jle(Context context) {
        this.d = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.b = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)new afz(this), intentFilter);
    }

    public jle(jlc jlc2, jlu jlu2) {
        this.b = jlc2;
        a.s(jlu2, "frameWriter");
        this.c = jlu2;
        this.a = 65535;
        this.d = new jlb(this, 0, 65535, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static jle g(Context object) {
        synchronized (jle.class) {
            jle jle2;
            if (e != null) return e;
            e = jle2 = new jle((Context)object);
            return e;
        }
    }

    public final void a(boolean bl2, jlb jlb2, klm klm2, boolean bl3) {
        a.s(klm2, "source");
        int n2 = jlb2.b();
        boolean bl4 = jlb2.d();
        int n3 = (int)klm2.b;
        if (!bl4 && n2 >= n3) {
            jlb2.c(klm2, n3, bl2);
        } else {
            if (!bl4 && n2 > 0) {
                jlb2.c(klm2, n2, false);
            }
            n3 = (int)klm2.b;
            jlb2.a.bK(klm2, n3);
            jlb2.d = bl2 | jlb2.d;
        }
        if (bl3) {
            this.b();
        }
    }

    public final void b() {
        try {
            this.c.c();
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public final void c() {
        Object object = this.b.r();
        Collections.shuffle(Arrays.asList(object));
        int n2 = ((jlb[])object).length;
        int n3 = ((jlb)this.d).b;
        while (true) {
            int n4 = 0;
            if (n2 <= 0 || n3 <= 0) break;
            int n5 = (int)Math.ceil((float)n3 / (float)n2);
            for (int i2 = 0; i2 < n2 && n3 > 0; ++i2) {
                Object object2 = object[i2];
                int n6 = Math.min(n3, Math.min(((jlb)object2).a(), n5));
                int n7 = n3;
                if (n6 > 0) {
                    ((jlb)object2).c += n6;
                    n7 = n3 - n6;
                }
                n6 = n4;
                if (((jlb)object2).a() > 0) {
                    object[n4] = object2;
                    n6 = n4 + 1;
                }
                n3 = n7;
                n4 = n6;
            }
            n2 = n4;
        }
        object = new jld();
        for (jlb jlb2 : this.b.r()) {
            jlb2.e(jlb2.c, (jld)object);
            jlb2.c = 0;
        }
        if (((jld)object).a()) {
            this.b();
        }
    }

    public final void d(jlb jlb2, int n2) {
        if (jlb2 == null) {
            ((jlb)this.d).f(n2);
            this.c();
            return;
        }
        jlb2.f(n2);
        jld jld2 = new jld();
        jlb2.e(jlb2.b(), jld2);
        if (jld2.a()) {
            this.b();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int e() {
        Object object = this.b;
        synchronized (object) {
            return this.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(int n2) {
        Object object = this.b;
        synchronized (object) {
            if (this.a == n2) {
                return;
            }
            this.a = n2;
        }
        Iterator iterator = ((CopyOnWriteArrayList)this.c).iterator();
        while (iterator.hasNext()) {
            object = (WeakReference)iterator.next();
            AmbientMode$AmbientController ambientMode$AmbientController = (AmbientMode$AmbientController)((Reference)object).get();
            if (ambientMode$AmbientController != null) {
                ambientMode$AmbientController.a(n2);
                continue;
            }
            ((CopyOnWriteArrayList)this.c).remove(object);
        }
        return;
    }
}

